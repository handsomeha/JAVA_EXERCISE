package icehs.science.chapter05;

import java.util.Scanner;

public class DutchCalculator {

	public static void main(String[] args) {
		int sum=0;
		System.out.println("������ �������� ����Ǿ�����?");
		int numOfCha=getUserInput();
		System.out.println("==========================");
		System.out.println("�� �������� �� ����� �Է��ϼ���.");
		for(int i=1;i<=numOfCha;i++) {
			System.out.println(i+"�� ��� : ");
			sum +=getUserInput();
			
		}
		System.out.println("�� ����� "+ sum+ "�� �Դϴ�.");
		System.out.println("==========================");
		
		System.out.println("������ �ο����� �Է��ϼ��� : ");
		int num=getUserInput();
		System.out.println("==========================");
		System.out.println("��ġ���� �ݾ���?");
		int money=sum/num;
		for(int j=1;j<=num;j++) {
			if(j==num) {
				System.out.println(num+" : "+sum+"��");
			}else {
			System.out.println(j+" : "+money+"��");
			sum -= money;
			}
		}
		
		
	}
	public static int getUserInput() {
		Scanner sc= new Scanner(System.in);
		int input= sc.nextInt();
		return input;
	}

}
