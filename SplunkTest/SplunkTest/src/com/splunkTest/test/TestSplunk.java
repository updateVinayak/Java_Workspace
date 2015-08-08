package com.splunkTest.test;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import com.splunk.Args;
import com.splunk.Job;
import com.splunk.Service;

public class TestSplunk {
	
	public static void main(String[] args) {
		
		
		Map<String, Object> connectionArg = new HashMap<String, Object>();
		connectionArg.put("host", "arnav-pc");		
		//connectionArg.put("host", "SplunkLocal");		
		connectionArg.put("username", "admin");
		connectionArg.put("password", "3380");
		connectionArg.put("port", 8089);
		connectionArg.put("scheme", "https");
		
		Service service = Service.connect(connectionArg);
		System.out.println(service.getToken());
		
		//Job job = service.getJobs().create("search hostname=US-WASH-CY7QYR1 session_id=\"EF9B1D96192FAC3C6A1231A1D96EA22\"");
		Job job = service.getJobs().create("search client_ip=\"127.0.0.1\" hostname=US-WASH-CY7QYR1 | head 10");
		//Job job = service.getJobs().create("search hostname=US-WASH-CY7QYR1 | head 1");
		
		while(!job.isDone()){
			try{
				Thread.sleep(500);
			}
			catch(Exception ex){
				ex.printStackTrace();
			}
		}
		System.out.println();
		try{
			Args outPut = new Args();
			outPut.put("output_mode", "json");
			
			InputStream stream = job.getResults(outPut);
			
			byte[] buffer = new byte[4096];
			while(stream.read(buffer) != -1){
				System.out.println(new String(buffer));
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

}