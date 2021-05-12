package com.ojas.model;

import java.io.Serializable;

public class Persons implements Serializable {
	private int pid;
	private String ename;
	private String contactno;
	private String email;
	private String gender;
	private String address;

	public Persons() {
		super();
	}

	public Persons(int pid, String ename, String contactno, String email, String gender, String address) {
		super();
		this.pid = pid;
		this.ename = ename;
		this.contactno = contactno;
		this.email = email;
		this.gender = gender;
		this.address = address;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
}