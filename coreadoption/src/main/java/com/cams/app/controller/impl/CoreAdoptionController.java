package com.cams.app.controller.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cams.app.data.impl.CoreAdoption;
import com.cams.app.persistence.interfaces.ICoreAdoptionPersestince;

@Controller
public class CoreAdoptionController {

	 @Autowired
	 private static final Logger logger =  LoggerFactory.getLogger(CoreAdoptionController.class);
	 
	@Autowired
	private ICoreAdoptionPersestince coreAdoptionUtil;
	
 	@CrossOrigin(origins = "http://localhost:8000")
 	@RequestMapping(value = "/insertCoreAdoption", method = RequestMethod.POST, consumes = {"application/json"})
    public ResponseEntity<String> newCoreAdoption(@RequestBody CoreAdoption coreAdoption) {
 		logger.info("Insert new CA - call repo.");
 		coreAdoptionUtil.insertCoreAoption(coreAdoption);
 		logger.info("repo called succesfully");
         return new ResponseEntity<String>("Core Adoption Uodated successfully!", HttpStatus.OK);
    }
	
	
}
