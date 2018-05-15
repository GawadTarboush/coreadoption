package com.cams.app.persistence.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.cams.app.data.impl.MSDetails;
import com.cams.app.persistence.interfaces.IMSDetailsPersestince;
import com.cams.app.repository.intrafaces.MSDetailsRepository;

public class MSDetailsPersestince implements IMSDetailsPersestince
{

	@Autowired
	private MSDetailsRepository msDetailsRepository;
	@Override
	public void insertMSDetals(MSDetails msDetails) {

		msDetailsRepository.saveAndFlush(msDetails);
	}

}
