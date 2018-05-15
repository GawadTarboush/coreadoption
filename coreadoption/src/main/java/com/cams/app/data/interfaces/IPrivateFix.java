package com.cams.app.data.interfaces;

import java.util.Date;
import java.util.List;

import com.cams.app.data.impl.MSDetails;

public interface IPrivateFix {

	void setComment(String comment);

	String getComment();

	void setStatus(String status);

	String getStatus();

	void setFixEstedHf(int fixEstedHf);

	int getFixEstedHf();

	void setHfType(String hfType);

	String getHfType();

	void setRefMSs(List<MSDetails> refMSs);

	List<MSDetails> getRefMSs();

	void setRefDefectId(String refDefectId);

	String getRefDefectId();

	void setRefCoreCaseId(String refCoreCaseId);

	String getRefCoreCaseId();

	void setDate(Date date);

	Date getDate();

	void setVersion(int version);

	int getVersion();

	void setHfId(String hfId);

	String getHfId();

	void setPfId(String pfId);

	String getPfId();

}
