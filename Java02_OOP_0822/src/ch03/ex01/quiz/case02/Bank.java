package ch03.ex01.quiz.case02;

public class Bank {
	
	private String accountNum;
	private int balance;
	private double rate;
	
	
	public String getAccountNum() {
		return accountNum;
	}
	public int getBalance() {
		return balance;
	}
	public double getRate() {
		return rate;
	}
		
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	
	@Override
	public String toString() {
		String msg = "###" + accountNum + "###\n";
		msg += "잔액 : " + balance +"\n";
		msg += "이장류: "+ rate + "\n";
		return msg;
	}

}
