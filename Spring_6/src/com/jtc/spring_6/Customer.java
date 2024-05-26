package com.jtc.spring_6;

import java.util.List;
import java.util.Map;
//import java.util.Properties;
import java.util.Set;

public class Customer {
	private int cid;
	private String name;
	private double salary;
	private boolean eligibleToVote;

	private List<String> emails;
	private Set<Long> phones;
	private Map<String, Integer> ref;
	// private Properties myprops;
	private Address address;
	private List<Account> account;

	public Customer() {

	}

	public Customer(int cid, String name, double salary, boolean eligibleToVote) {
		super();
		this.cid = cid;
		this.name = name;
		this.salary = salary;
		this.eligibleToVote = eligibleToVote;
	}

	public int getCid() {
		return cid;
	}

	public String getName() {
		return name;
	}

	public double getsalary() {
		return salary;
	}

	public boolean isEligibleToVote() {
		return eligibleToVote;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setsalary(double salary) {
		this.salary = salary;
	}

	public void setEligibleToVote(boolean eligibleToVote) {
		this.eligibleToVote = eligibleToVote;
	}

	public List<String> getEmails() {
		return emails;
	}

	public Set<Long> getPhones() {
		return phones;
	}

	public Map<String, Integer> getRef() {
		return ref;
	}

	public Address getAddress() {
		return address;
	}

	public List<Account> getAccount() {
		return account;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public void setPhones(Set<Long> phones) {
		this.phones = phones;
	}

	public void setRef(Map<String, Integer> ref) {
		this.ref = ref;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setAccount(List<Account> account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", salary=" + salary + ", eligibleToVote=" + eligibleToVote
				+ ", emails=" + emails + ", phones=" + phones + ", ref=" + ref + ", address=" + address + ", account="
				+ account + "]";
	}

}
