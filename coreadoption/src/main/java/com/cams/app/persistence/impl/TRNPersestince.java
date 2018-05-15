package com.cams.app.persistence.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.cams.app.data.impl.TRN;
import com.cams.app.persistence.interfaces.ITRNPersestince;
import com.cams.app.repository.intrafaces.TRNRepository;

public class TRNPersestince implements ITRNPersestince {

	@Autowired
	private TRNRepository trnRepository;
	@Override
	public void insertTRN(TRN trn) {

		trnRepository.saveAndFlush(trn);
	}

}
