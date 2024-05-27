package com.jtc.hibernate_project_9;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "account_info")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="acid")
	private int accid;
	@Column(name = "accno")
	private long accno;
	@Column(name = "acctype")
	private String acctype;
	@Column(name = "bankname")
	private String bankname;
	@Column(name = "brance")
	private String brance;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cid", referencedColumnName = "id")
	private Customer customer;

	public Account() {
		super();
	}

	public Account(long accno, String acctype, String bankname, String brance, Customer customer) {
		super();
		this.accno = accno;
		this.acctype = acctype;
		this.bankname = bankname;
		this.brance = brance;
		this.customer = customer;
	}

	public Account(long accno, String acctype, String bankname, String brance) {
		super();
		this.accno = accno;
		this.acctype = acctype;
		this.bankname = bankname;
		this.brance = brance;
	}

	public long getAccno() {
		return accno;
	}

	public void setAccno(long accno) {
		this.accno = accno;
	}

	public String getAcctype() {
		return acctype;
	}

	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public String getBrance() {
		return brance;
	}

	public void setBrance(String brance) {
		this.brance = brance;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Account [accno=" + accno + ", acctype=" + acctype + ", bankname=" + bankname + ", brance=" + brance
				+ ", customer=" + customer.getId() + "]";
	}

}
