package com.myHealth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myHealth.model.data.StateDetails;
import com.myHealth.service.IMasterService;


@RestController
public class MasterController {

	@Autowired
	private IMasterService masterService;
	
	public IMasterService getMasterService() {
		return masterService;
	}

	public void setMasterService(IMasterService masterService) {
		this.masterService = masterService;
	}



	@RequestMapping("/states")
	public List<StateDetails> getAllState(){
		
		
		return masterService.getAllState();
		
	}
	
}