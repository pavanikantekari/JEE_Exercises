package com.ojas.model;

import java.io.Serializable;

public class Person implements Serializable {
	private int pid;
	private String pname;
	private String contactno;
	private String email;
	private String gender;
	private String address;

	public Person() {
		super();
	}

	public Person(int pid, String pname, String contactno, String email, String gender, String address) {
		super();
		this.pid = pid;
		this.pname = pname;
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

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
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

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", contactno=" + contactno + ", email=" + email + ", gender="
				+ gender + ", address=" + address + "]";
	}

}