package com.cams.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cams.app.persistence.impl.CoreAdoptionBundlePersestince;
import com.cams.app.persistence.impl.CoreAdoptionPersestince;
import com.cams.app.persistence.impl.MSDetailsPersestince;
import com.cams.app.persistence.impl.PrivateFixPersestince;
import com.cams.app.persistence.impl.TRNPersestince;
import com.cams.app.persistence.interfaces.ICoreAdoptionBundlePersestince;
import com.cams.app.persistence.interfaces.ICoreAdoptionPersestince;
import com.cams.app.persistence.interfaces.IMSDetailsPersestince;
import com.cams.app.persistence.interfaces.IPrivateFixPersestince;
import com.cams.app.persistence.interfaces.ITRNPersestince;


@Configuration
public class PersistenceConfigBean {

	
	@Bean
	public ICoreAdoptionPersestince coreAdoptionPersestince()
	{
		return new CoreAdoptionPersestince();
	}
	
	@Bean
	public ICoreAdoptionBundlePersestince coreAdoptionBundlePersestince()
	{
		return new CoreAdoptionBundlePersestince();
	}
	
	@Bean
	public IMSDetailsPersestince msDetailsPersestince()
	{
		return new MSDetailsPersestince();
	}
	
	@Bean
	public IPrivateFixPersestince privateFixPersestince()
	{
		return new PrivateFixPersestince();
	}
	
	@Bean
	public ITRNPersestince trnPersestince()
	{
		return new TRNPersestince();
	}
}
