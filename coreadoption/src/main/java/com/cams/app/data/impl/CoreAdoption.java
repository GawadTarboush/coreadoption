package com.cams.app.data.impl;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.cams.app.data.interfaces.ICoreAdoption;

@Entity
@Table(name = "coreadoption")
public class CoreAdoption implements ICoreAdoption {

	@Id
	private String id;
	private Date date;
	private String creator;
	
	@OneToMany(targetEntity=CoreAdoption.class, mappedBy="hfBundle", fetch=FetchType.EAGER)
	private List<CoreAdoptionBundle> hfBundle;
	
	@OneToMany(targetEntity=CoreAdoption.class, mappedBy="listOfCoreMSs", fetch=FetchType.EAGER)
	private List<String> listOfCoreMSs;
	
	@OneToMany(targetEntity=CoreAdoption.class, mappedBy="listOfCustMSs", fetch=FetchType.EAGER)
	private List<String> listOfCustMSs;
	
	@OneToMany(targetEntity=CoreAdoption.class, mappedBy="listOfPFs", fetch=FetchType.EAGER)
	private List<String> listOfPFs;
	
	@Override
	public String getId() {
		return id;
	}
	@Override
	public void setId(String id) {
		this.id = id;
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
	public String getCreator() {
		return creator;
	}
	@Override
	public void setCreator(String creator) {
		this.creator = creator;
	}
	@Override
	public List<CoreAdoptionBundle> getHfBundle() {
		return hfBundle;
	}
	@Override
	public void setHfBundle(List<CoreAdoptionBundle> hfBundle) {
		this.hfBundle = hfBundle;
	}
	@Override
	public List<String> getListOfCoreMSs() {
		return listOfCoreMSs;
	}
	@Override
	public void setListOfCoreMSs(List<String> listOfCoreMSs) {
		this.listOfCoreMSs = listOfCoreMSs;
	}
	@Override
	public List<String> getListOfCustMSs() {
		return listOfCustMSs;
	}
	@Override
	public void setListOfCustMSs(List<String> listOfCustMSs) {
		this.listOfCustMSs = listOfCustMSs;
	}
	@Override
	public List<String> getListOfPFs() {
		return listOfPFs;
	}
	@Override
	public void setListOfPFs(List<String> listOfPFs) {
		this.listOfPFs = listOfPFs;
	}
	
}
