package com.cams.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cams.app.data.impl.CoreAdoption;
import com.cams.app.data.impl.CoreAdoptionBundle;
import com.cams.app.data.impl.MSDetails;
import com.cams.app.data.impl.PrivateFix;
import com.cams.app.data.impl.TRN;
import com.cams.app.data.interfaces.ICoreAdoption;
import com.cams.app.data.interfaces.ICoreAdoptionBundle;
import com.cams.app.data.interfaces.IMSDetails;
import com.cams.app.data.interfaces.IPrivateFix;
import com.cams.app.data.interfaces.ITRN;

@Configuration
public class DataConfigBean {

	@Bean
	public ICoreAdoption coreAdoption() {
		return new CoreAdoption();
	}
	
	@Bean
	public ICoreAdoptionBundle coreAdoptionBundle() {
		return new CoreAdoptionBundle();
	}
	
	@Bean
	public IMSDetails msDetails() {
		return new MSDetails();
	}
	
	@Bean
	public IPrivateFix privateFix() {
		return new PrivateFix();
	}
	
	@Bean
	public ITRN trn() {
		return new TRN();
	}
}
