package com.spring.bean;

public class BankDetail {
	private String bankName;
	private String accountNumber;

	public BankDetail(String bankName, String accountNumber) {
		this.bankName = bankName;
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		System.out.println("bankName :" + bankName);
		System.out.println("Acco.No :" + accountNumber);
		return "BankName :"+ bankName + ", " +"Account No :"+ accountNumber;
	}
}
