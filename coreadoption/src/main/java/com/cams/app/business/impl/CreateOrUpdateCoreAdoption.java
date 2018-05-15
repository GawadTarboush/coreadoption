package com.cams.app.business.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.cams.app.business.interfaces.ICreateOrUpdateCoreAdoption;
import com.cams.app.data.impl.CoreAdoption;
import com.cams.app.repository.intrafaces.CoreAdoptionRepository;

public class CreateOrUpdateCoreAdoption implements ICreateOrUpdateCoreAdoption {

	@Autowired
	private CoreAdoptionRepository coreAdoptionRepository;

	@Override
	public void createOrUpdateCoreAdoption(CoreAdoption coreAdoption) {
		coreAdoptionRepository.saveAndFlush(coreAdoption);
	}

}
