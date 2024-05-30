package com.movie.dto;



public class CustomerDetails {

	
	private int customId;
	private String customName;
	private String customEmail;
	private long customMobileNo;
	private String address;
	
	public int getCustomId() {
		return customId;
	}
	public void setCustomId(int customId) {
		this.customId = customId;
	}
	public String getCustomName() {
		return customName;
	}
	public void setCustomName(String customName) {
		this.customName = customName;
	}
	public String getCustomEmail() {
		return customEmail;
	}
	public void setCustomEmail(String customEmail) {
		this.customEmail = customEmail;
	}
	public long getCustomMobileNo() {
		return customMobileNo;
	}
	public void setCustomMobileNo(long customMobileNo) {
		this.customMobileNo = customMobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
