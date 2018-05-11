package com.cams.app.data.impl;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.cams.app.data.interfaces.ICoreAdoptionBundle;

@Entity
public class CoreAdoptionBundle implements ICoreAdoptionBundle {

	@Id
	private String id;
	private String sqoCoreHF;
	private String sqoCustHF;
	private String b2bHF;
	private String omsHF;
	private String acpeHF;
	private String mecHF;
	
	@OneToMany(targetEntity=CoreAdoptionBundle.class, mappedBy="trnsList", fetch=FetchType.EAGER)
	private List<TRN> trnsList;
	
	@Override
	public String getSqoCoreHF() {
		return sqoCoreHF;
	}
	@Override
	public void setSqoCoreHF(String sqoCoreHF) {
		this.sqoCoreHF = sqoCoreHF;
	}
	@Override
	public String getSqoCustHF() {
		return sqoCustHF;
	}
	@Override
	public void setSqoCustHF(String sqoCustHF) {
		this.sqoCustHF = sqoCustHF;
	}
	@Override
	public String getB2bHF() {
		return b2bHF;
	}
	@Override
	public void setB2bHF(String b2bHF) {
		this.b2bHF = b2bHF;
	}
	@Override
	public String getOmsHF() {
		return omsHF;
	}
	@Override
	public void setOmsHF(String omsHF) {
		this.omsHF = omsHF;
	}
	@Override
	public String getAcpeHF() {
		return acpeHF;
	}
	@Override
	public void setAcpeHF(String acpeHF) {
		this.acpeHF = acpeHF;
	}
	@Override
	public String getMecHF() {
		return mecHF;
	}
	@Override
	public void setMecHF(String mecHF) {
		this.mecHF = mecHF;
	}
	@Override
	public List<TRN> getTrnsList() {
		return trnsList;
	}
	@Override
	public void setTrnsList(List<TRN> trnsList) {
		this.trnsList = trnsList;
	}
	@Override
	public String getId() {
		return id;
	}
	@Override
	public void setId(String id) {
		this.id = id;
	}
}
