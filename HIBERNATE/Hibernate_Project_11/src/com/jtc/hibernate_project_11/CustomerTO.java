package com.jtc.hibernate_project_11;

public class CustomerTO {
	private int cid;
	private String name;
	private String email;
	private long phone;

	public CustomerTO(int cid, String name, String email, long phone) {
		super();
		this.cid = cid;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public CustomerTO(String name, String email, long phone) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public CustomerTO(int cid) {
		// TODO Auto-generated constructor stub
		this.cid=cid;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "CustomerTO [cid=" + cid + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}

}
