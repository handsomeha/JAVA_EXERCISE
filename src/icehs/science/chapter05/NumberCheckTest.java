package icehs.science.chapter05;

import java.util.*;

public class NumberCheckTest {

	public static void main(String[] args) {
		System.out.println("ù ��° ���� �Է��ϼ���.");
		int first=getUserInput();
		System.out.println("�� ��° ���� �Է��ϼ���.");
		int second=getUserInput();
		int mix=first*second;
		if(mix>=100) {
			System.out.println(first+"*"+second+" : �� �ڸ� �� �̻��Դϴ�.");
		}
		else if(mix>=10){
			System.out.println(first+"*"+second+" : �� �ڸ� ���Դϴ�.");
		}
		else if(mix<0) {
			System.out.println(first+"*"+second+" : ������ Ȯ������ �ʽ��ϴ�.");
		}
		else {
			System.out.println(first+"*"+second+" : �� �ڸ� ���Դϴ�.");
		}
	}

	private static int getUserInput() {
		Scanner sc= new Scanner(System.in);
		int input=sc.nextInt();
		return input;
	}

}
