package icehs.science.chapter06;

public class Account {
	String owner;
	String accountNum;
	long balance;

	
	void deposit(int money) {
		balance += money;
			}
	void withdraw(int money) {
		balance -= money;
			}
	
	void checkCash() {
		System.out.println("예금주 "+owner+"입니다.");
		System.out.println("계좌번호는 "+accountNum+" 입니다.");
		System.out.println("잔액은 "+balance+"원 입니다.");
	}
	long getBalance() {
		return balance;
	}
}
