package org.fi.restmobiapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="mobilePhone_0006")
public class MobilePhone {

	
	@Id
	@Column(name="phoneid")
	int phoneId;
	
	@Column(name="phonename")
	String phoneName;
	
	@Column(name="phonememory")
	String phoneMemory;
	
	@Column(name="phoneos")
	String phoneOs;
	
	@Column(name="phonesize")
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
