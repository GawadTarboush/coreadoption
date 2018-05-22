package com.cams.app.persistence.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.cams.app.data.impl.CoreAdoptionBundle;
import com.cams.app.persistence.interfaces.ICoreAdoptionBundlePersestince;
import com.cams.app.repository.intrafaces.CoreAdoptionBundleRepository;

public class CoreAdoptionBundlePersestince implements ICoreAdoptionBundlePersestince {

	@Autowired
	private CoreAdoptionBundleRepository coreAdoptionBundleRepository;

	@Override
	public void insertCoreAdoptionBundlePersestince(CoreAdoptionBundle coreAdoptionBundle) {
		coreAdoptionBundleRepository.saveAndFlush(coreAdoptionBundle);
	}

}
