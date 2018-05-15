package com.cams.app.persistence.interfaces;

import java.util.List;

import com.cams.app.data.impl.PrivateFix;

public interface IPrivateFixPersestince {
	
	public void insertPrivateFix(PrivateFix privateFix);
	
	public List<PrivateFix> selectAllPrivateFixes();

}
