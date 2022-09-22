package org.bank;

public class AxixBank extends BankInfo {
public void deposit() {
	super.deposit();
	System.out.println("4%");
}
public static void main(String[] args) {
	AxixBank a = new AxixBank();
	a.deposit();
	a.savings();
	a.fixed();
	
}
}
