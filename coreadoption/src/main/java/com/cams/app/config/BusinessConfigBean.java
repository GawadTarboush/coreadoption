package com.cams.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cams.app.business.impl.CalculatePrivateFixesBundle;
import com.cams.app.business.impl.CreateOrUpdateCoreAdoption;
import com.cams.app.business.interfaces.ICalculatePrivateFixesBundle;
import com.cams.app.business.interfaces.ICreateOrUpdateCoreAdoption;

@Configuration
public class BusinessConfigBean {

	@Bean
	public ICalculatePrivateFixesBundle calculatePrivateFixesBundle() {
		return new CalculatePrivateFixesBundle();
	}

	@Bean
	public ICreateOrUpdateCoreAdoption iCreateOrUpdateCoreAdoption() {
		return new CreateOrUpdateCoreAdoption();
	}

}
