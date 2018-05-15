package com.cams.app.persistence.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.cams.app.data.impl.CoreAdoption;
import com.cams.app.persistence.interfaces.ICoreAdoptionPersestince;
import com.cams.app.repository.intrafaces.CoreAdoptionRepository;

public class CoreAdoptionPersestince implements ICoreAdoptionPersestince{

	@Autowired
	private  CoreAdoptionRepository coreAdoptionRepository;
	
	@Override
	public void insertCoreAoption(CoreAdoption coreAdoption) {
		coreAdoptionRepository.saveAndFlush(coreAdoption);
	}
}