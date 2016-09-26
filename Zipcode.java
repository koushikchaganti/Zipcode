package com.koushikchaganti.pincode.service;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Zipcode {
	
	private int pincode;
	private String officename;
	private String officetype;
	private String divisionname;
	private String regionname;
	private String circlename;
	private String taluk;
	private String districtname;
	private String statename;
	private String telephone;
	private String relatedsuboffice;
	private String relatedheadoffice;
	private String longitude;
	
	public Zipcode() {
		// TODO Auto-generated constructor stub
	}
	
	public Zipcode(int pincode, String officename, String officetype, String divisionname, String regionname,
			String circlename, String taluk, String districtname, String statename, String telephone,
			String relatedsuboffice, String relatedheadoffice, String longitude, String latitude) {
		super();
		this.pincode = pincode;
		this.officename = officename;
		this.officetype = officetype;
		this.divisionname = divisionname;
		this.regionname = regionname;
		this.circlename = circlename;
		this.taluk = taluk;
		this.districtname = districtname;
		this.statename = statename;
		this.telephone = telephone;
		this.relatedsuboffice = relatedsuboffice;
		this.relatedheadoffice = relatedheadoffice;
		this.longitude = longitude;
		this.latitude = latitude;
	}
	/**
	 * @return the pincode
	 */
	public int getPincode() {
		return pincode;
	}
	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	/**
	 * @return the officename
	 */
	public String getOfficename() {
		return officename;
	}
	/**
	 * @param officename the officename to set
	 */
	public void setOfficename(String officename) {
		this.officename = officename;
	}
	/**
	 * @return the officetype
	 */
	public String getOfficetype() {
		return officetype;
	}
	/**
	 * @param officetype the officetype to set
	 */
	public void setOfficetype(String officetype) {
		this.officetype = officetype;
	}
	/**
	 * @return the divisionname
	 */
	public String getDivisionname() {
		return divisionname;
	}
	/**
	 * @param divisionname the divisionname to set
	 */
	public void setDivisionname(String divisionname) {
		this.divisionname = divisionname;
	}
	/**
	 * @return the regionname
	 */
	public String getRegionname() {
		return regionname;
	}
	/**
	 * @param regionname the regionname to set
	 */
	public void setRegionname(String regionname) {
		this.regionname = regionname;
	}
	/**
	 * @return the circlename
	 */
	public String getCirclename() {
		return circlename;
	}
	/**
	 * @param circlename the circlename to set
	 */
	public void setCirclename(String circlename) {
		this.circlename = circlename;
	}
	/**
	 * @return the taluk
	 */
	public String getTaluk() {
		return taluk;
	}
	/**
	 * @param taluk the taluk to set
	 */
	public void setTaluk(String taluk) {
		this.taluk = taluk;
	}
	/**
	 * @return the districtname
	 */
	public String getDistrictname() {
		return districtname;
	}
	/**
	 * @param districtname the districtname to set
	 */
	public void setDistrictname(String districtname) {
		this.districtname = districtname;
	}
	/**
	 * @return the statename
	 */
	public String getStatename() {
		return statename;
	}
	/**
	 * @param statename the statename to set
	 */
	public void setStatename(String statename) {
		this.statename = statename;
	}
	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}
	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	/**
	 * @return the relatedsuboffice
	 */
	public String getRelatedsuboffice() {
		return relatedsuboffice;
	}
	/**
	 * @param relatedsuboffice the relatedsuboffice to set
	 */
	public void setRelatedsuboffice(String relatedsuboffice) {
		this.relatedsuboffice = relatedsuboffice;
	}
	/**
	 * @return the relatedheadoffice
	 */
	public String getRelatedheadoffice() {
		return relatedheadoffice;
	}
	/**
	 * @param relatedheadoffice the relatedheadoffice to set
	 */
	public void setRelatedheadoffice(String relatedheadoffice) {
		this.relatedheadoffice = relatedheadoffice;
	}
	/**
	 * @return the longitude
	 */
	public String getLongitude() {
		return longitude;
	}
	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	/**
	 * @return the latitude
	 */
	public String getLatitude() {
		return latitude;
	}
	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	private String latitude;



}
