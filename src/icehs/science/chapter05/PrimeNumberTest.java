package icehs.science.chapter05;

import java.util.Scanner;

public class PrimeNumberTest {

	public static void main(String[] args) {
		int a=23;
		int b=26;
		
		for(int i=2;i<=a;i++) {
			if(a==i) {
				System.out.println(a+"�� �Ҽ��Դϴ�.");
			}else if(a%i==0) {
				System.out.println(a+"�� �Ҽ��� �ƴմϴ�.");
				break;
			} }
			
			for(int j=2;j<=b;j++) {
				if(b==j) {
					System.out.println(b+"�� �Ҽ��Դϴ�.");
				}else if(b%j==0) {
					System.out.println(b+"�� �Ҽ��� �ƴմϴ�.");
					break;
				}
		}
	}

	public static int getUserInput() {
		Scanner sc=new Scanner(System.in);
		int Input=sc.nextInt();
		return Input;
	}
}
	
