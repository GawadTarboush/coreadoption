package com.cams.app.data.interfaces;

import java.util.Date;
import java.util.List;

import com.cams.app.data.impl.CoreAdoptionBundle;

public interface ICoreAdoption {

	void setListOfPFs(List<String> listOfPFs);

	List<String> getListOfPFs();

	void setListOfCustMSs(List<String> listOfCustMSs);

	List<String> getListOfCustMSs();

	void setListOfCoreMSs(List<String> listOfCoreMSs);

	List<String> getListOfCoreMSs();

	void setHfBundle(List<CoreAdoptionBundle> hfBundle);

	List<CoreAdoptionBundle> getHfBundle();

	void setCreator(String creator);

	String getCreator();

	void setDate(Date date);

	Date getDate();

	void setId(String id);

	String getId();

}
