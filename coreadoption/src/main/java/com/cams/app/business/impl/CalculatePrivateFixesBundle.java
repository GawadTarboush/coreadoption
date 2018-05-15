package com.cams.app.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.cams.app.business.interfaces.ICalculatePrivateFixesBundle;
import com.cams.app.data.impl.PrivateFix;
import com.cams.app.persistence.interfaces.IPrivateFixPersestince;

public class CalculatePrivateFixesBundle implements ICalculatePrivateFixesBundle {

	@Autowired
	private IPrivateFixPersestince privateFixPersesrince;

	@Autowired
	private static final Logger logger = LoggerFactory.getLogger(CalculatePrivateFixesBundle.class);

	private final static String ACTIVE = "active";

	@Override
	public List<String> retreiveCalculatedPrivateFixIDsList(int currentHfNumber) {

		List<String> calculatedPrivateFixesList = new ArrayList<>();
		List<PrivateFix> listOfPrivateFixFromDB = privateFixPersesrince.selectAllPrivateFixes();
		logger.info("Current HF Number: ", currentHfNumber);

		for (PrivateFix privateFix : listOfPrivateFixFromDB) {
			if (privateFix.getFixEstedHf() > currentHfNumber && ACTIVE.equals(privateFix.getStatus())) {
				calculatedPrivateFixesList.add(privateFix.getPfId());
			}
		}

		return calculatedPrivateFixesList;
	}

}
