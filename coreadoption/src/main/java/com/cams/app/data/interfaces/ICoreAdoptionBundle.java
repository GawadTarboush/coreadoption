package com.cams.app.data.interfaces;

import java.util.List;

import com.cams.app.data.impl.TRN;

public interface ICoreAdoptionBundle {

	void setTrnsList(List<TRN> trnsList);

	List<TRN> getTrnsList();

	void setMecHF(String mecHF);

	String getMecHF();

	void setAcpeHF(String acpeHF);

	String getAcpeHF();

	void setOmsHF(String omsHF);

	String getOmsHF();

	void setB2bHF(String b2bHF);

	String getB2bHF();

	void setSqoCustHF(String sqoCustHF);

	String getSqoCustHF();

	void setSqoCoreHF(String sqoCoreHF);

	String getSqoCoreHF();

	void setId(String id);

	String getId();

}
