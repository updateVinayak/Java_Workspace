package com.myHealth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.myHealth.dao.IMasterDAO;
import com.myHealth.model.data.StateDetails;

@Component
public class MasterServiceImpl implements IMasterService {

	@Autowired
	private IMasterDAO masterDAO; 
	
	public IMasterDAO getMasterDAO() {
		return masterDAO;
	}

	public void setMasterDAO(IMasterDAO masterDAO) {
		this.masterDAO = masterDAO;
	}




	public List<StateDetails> getAllState() {

		return masterDAO.getAllStates();
		
	}

}
