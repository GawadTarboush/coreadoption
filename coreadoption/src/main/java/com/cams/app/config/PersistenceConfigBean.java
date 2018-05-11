package com.cams.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cams.app.persistence.impl.CoreAdoptionPersestince;
import com.cams.app.persistence.interfaces.ICoreAdoptionPersestince;


@Configuration
public class PersistenceConfigBean {

	
	@Bean
	public ICoreAdoptionPersestince coreAdoptionPersestince()
	{
		return new CoreAdoptionPersestince();
	}
}
