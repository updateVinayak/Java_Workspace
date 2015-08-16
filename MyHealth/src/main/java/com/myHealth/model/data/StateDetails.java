package com.myHealth.model.data;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="MH_STSTEDETAILS")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class StateDetails {

	

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer stateId;
     
    private String stateName;

	public Integer getStateId() {
		return stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
    
    
}
