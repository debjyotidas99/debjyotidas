package com.jtc.spring_6;

public class Account {
	private int accno;
	private String branch;
	private double balance;
	private float withdraw;

	public Account() {
		super();
	}

	public Account(int accno, String branch, double balance, float withdraw) {
		super();
		this.accno = accno;
		this.branch = branch;
		this.balance = balance;
		this.withdraw = withdraw;
	}

	public int getAccno() {
		return accno;
	}

	public String getBranch() {
		return branch;
	}

	public double getBalance() {
		return balance;
	}

	public float getWithdraw() {
		return withdraw;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setWithdraw(float withdraw) {
		this.withdraw = withdraw;
	}

	@Override
	public String toString() {
		return "Account [accno=" + accno + ", branch=" + branch + ", balance=" + balance + ", withdraw=" + withdraw
				+ "]";
	}

}
