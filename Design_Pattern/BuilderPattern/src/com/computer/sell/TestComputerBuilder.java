package com.computer.sell;

public class TestComputerBuilder {

	public static void main(String[] args) {
		
		OrangeBookProBuilder bookProBuilder =  new OrangeBookProBuilder();
		
		ComputerManager cm = new ComputerManager(bookProBuilder);
		
		cm.createOrangeBookPro();
		OrangeBookPro orangeBookPro = cm.getOrange();
		
		System.out.println(orangeBookPro.getHardDisk());
		System.out.println(orangeBookPro.getProcesor());
		System.out.println(orangeBookPro.getMemory());
		
	}
	
}
