package icehs.science.chapter05;

import java.util.Scanner;

public class PrimeNumberTest {

	public static void main(String[] args) {
		int a=23;
		int b=26;
		
		for(int i=2;i<=a;i++) {
			if(a==i) {
				System.out.println(a+"은 소수입니다.");
			}else if(a%i==0) {
				System.out.println(a+"은 소수가 아닙니다.");
				break;
			} }
			
			for(int j=2;j<=b;j++) {
				if(b==j) {
					System.out.println(b+"은 소수입니다.");
				}else if(b%j==0) {
					System.out.println(b+"은 소수가 아닙니다.");
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
	
