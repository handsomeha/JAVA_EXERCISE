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
		System.out.println("������ "+owner+"�Դϴ�.");
		System.out.println("���¹�ȣ�� "+accountNum+" �Դϴ�.");
		System.out.println("�ܾ��� "+balance+"�� �Դϴ�.");
	}
	long getBalance() {
		return balance;
	}
}
