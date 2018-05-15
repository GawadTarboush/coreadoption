package com.cams.app.persistence.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cams.app.data.impl.PrivateFix;
import com.cams.app.persistence.interfaces.IPrivateFixPersestince;
import com.cams.app.repository.intrafaces.PrivateFixRepository;

public class PrivateFixPersestince implements IPrivateFixPersestince {

	@Autowired
	private PrivateFixRepository privateFixRepository;
	
	@Override
	public void insertPrivateFix(PrivateFix privateFix) {

		privateFixRepository.saveAndFlush(privateFix);
	}

	@Override
	public List<PrivateFix> selectAllPrivateFixes() {
		
		List<PrivateFix> listOfAllPrivateFixes = privateFixRepository.findAll();
		return listOfAllPrivateFixes;
	}
	
}
