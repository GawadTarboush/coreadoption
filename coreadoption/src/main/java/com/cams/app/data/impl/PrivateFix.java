package com.cams.app.data.impl;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.cams.app.data.interfaces.IPrivateFix;

@Entity
@Table(name = "PRIVATE_FIX")
public class PrivateFix implements IPrivateFix {

	@Id
	private String pfId;
	private String hfId;
	private int version;
	private Date date;
	private String refCoreCaseId;
	private String refDefectId;
	private String hfType;
	private int fixEstedHf;
	private String status;
	private String comment;

	@OneToMany(targetEntity = PrivateFix.class, mappedBy = "refMSs", fetch = FetchType.EAGER)
	private List<MSDetails> refMSs;

	@Override
	public String getPfId() {
		return pfId;
	}

	@Override
	public void setPfId(String pfId) {
		this.pfId = pfId;
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
	public int getVersion() {
		return version;
	}

	@Override
	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public Date getDate() {
		return date;
	}

	@Override
	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String getRefCoreCaseId() {
		return refCoreCaseId;
	}

	@Override
	public void setRefCoreCaseId(String refCoreCaseId) {
		this.refCoreCaseId = refCoreCaseId;
	}

	@Override
	public String getRefDefectId() {
		return refDefectId;
	}

	@Override
	public void setRefDefectId(String refDefectId) {
		this.refDefectId = refDefectId;
	}

	@Override
	public List<MSDetails> getRefMSs() {
		return refMSs;
	}

	@Override
	public void setRefMSs(List<MSDetails> refMSs) {
		this.refMSs = refMSs;
	}

	@Override
	public String getHfType() {
		return hfType;
	}

	@Override
	public void setHfType(String hfType) {
		this.hfType = hfType;
	}

	@Override
	public int getFixEstedHf() {
		return fixEstedHf;
	}

	@Override
	public void setFixEstedHf(int fixEstedHf) {
		this.fixEstedHf = fixEstedHf;
	}

	@Override
	public String getStatus() {
		return status;
	}

	@Override
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getComment() {
		return comment;
	}

	@Override
	public void setComment(String comment) {
		this.comment = comment;
	}

}
