package com.cams.app.data.impl;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cams.app.data.interfaces.IMSDetails;

@Entity
@Table(name = "MS_DETAILS")
public class MSDetails implements IMSDetails {

	@Id
	private String msName;
	private int coreMsBN;

	@Override
	public String getMsName() {
		return msName;
	}

	@Override
	public void setMsName(String msName) {
		this.msName = msName;
	}

	@Override
	public int getCoreMsBN() {
		return coreMsBN;
	}

	@Override
	public void setCoreMsBN(int coreMsBN) {
		this.coreMsBN = coreMsBN;
	}
}
