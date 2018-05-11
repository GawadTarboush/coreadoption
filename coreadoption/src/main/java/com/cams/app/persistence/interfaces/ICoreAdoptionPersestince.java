package com.cams.app.persistence.interfaces;

import org.springframework.stereotype.Service;

import com.cams.app.data.impl.CoreAdoption;

@Service
public interface ICoreAdoptionPersestince {

	public void insertCoreAoption(CoreAdoption coreAdoption);
	
}
