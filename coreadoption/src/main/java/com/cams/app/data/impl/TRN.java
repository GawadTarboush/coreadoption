package com.cams.app.data.impl;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cams.app.data.interfaces.ITRN;

@Entity
@Table(name = "TRN")
public class TRN implements ITRN {

	@Id
	private String id;
	private String hfId;
	private String type;
	private String defectId;

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String getHfId() {
		return hfId;
	}

	@Override
	public void setHfId(String hfId) {
		this.hfId = hfId;
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String getDefectId() {
		return defectId;
	}

	@Override
	public void setDefectId(String defectId) {
		this.defectId = defectId;
	}

}
