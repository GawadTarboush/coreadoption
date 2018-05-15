package com.cams.app.controller.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cams.app.business.interfaces.ICalculatePrivateFixesBundle;

@Controller
public class BusinessLayerController {

	@Autowired
	private static final Logger logger = LoggerFactory.getLogger(BusinessLayerController.class);

	@Autowired
	private ICalculatePrivateFixesBundle calculatePrivateFixBundle;

	@CrossOrigin(origins = "http://localhost:8000")
	@GetMapping(value = "/calculatePrivateFixList/{currentHfNumber}")
	public @ResponseBody ResponseEntity<List<String>> getPrivateFixesList(
			@PathVariable("currentHfNumber") int currentHfNumber) {
		logger.info("Calculating Private Fixes List of  HF Number: {}", currentHfNumber);
		List<String> response = calculatePrivateFixBundle.retreiveCalculatedPrivateFixIDsList(currentHfNumber);
		return new ResponseEntity<List<String>>(response, HttpStatus.OK);
	}
}
