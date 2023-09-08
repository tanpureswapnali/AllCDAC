package org.fi.restmobiapp.dto;



public class MobilePhoneDTO {
	
	   int phoneId;
	   String phoneName;
	   String phoneMemory;
	   String phoneOs;
	   String phoneSize;
	public int getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}
	public String getPhoneName() {
		return phoneName;
	}
	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}
	public String getPhoneMemory() {
		return phoneMemory;
	}
	public void setPhoneMemory(String phoneMemory) {
		this.phoneMemory = phoneMemory;
	}
	public String getPhoneOs() {
		return phoneOs;
	}
	public void setPhoneOs(String phoneOs) {
		this.phoneOs = phoneOs;
	}
	public String getPhoneSize() {
		return phoneSize;
	}
	public void setPhoneSize(String phoneSize) {
		this.phoneSize = phoneSize;
	}

}
