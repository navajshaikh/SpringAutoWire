package com.autowire;

public class BankDetails {
	
	private String BankName;
	private int accountNo;
	private String type;
	public BankDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankDetails(String bankName, int accountNo, String type) {
		super();
		BankName = bankName;
		this.accountNo = accountNo;
		this.type = type;
	}
	public String getBankName() {
		return BankName;
	}
	public void setBankName(String bankName) {
		BankName = bankName;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "BankDetails [BankName=" + BankName + ", accountNo=" + accountNo + ", type=" + type + "]";
	}
	

}
