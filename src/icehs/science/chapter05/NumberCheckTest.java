package icehs.science.chapter05;

import java.util.*;

public class NumberCheckTest {

	public static void main(String[] args) {
		System.out.println("첫 번째 수를 입력하세요.");
		int first=getUserInput();
		System.out.println("두 번째 수를 입력하세요.");
		int second=getUserInput();
		int mix=first*second;
		if(mix>=100) {
			System.out.println(first+"*"+second+" : 세 자리 수 이상입니다.");
		}
		else if(mix>=10){
			System.out.println(first+"*"+second+" : 두 자리 수입니다.");
		}
		else if(mix<0) {
			System.out.println(first+"*"+second+" : 음수는 확인하지 않습니다.");
		}
		else {
			System.out.println(first+"*"+second+" : 한 자리 수입니다.");
		}
	}

	private static int getUserInput() {
		Scanner sc= new Scanner(System.in);
		int input=sc.nextInt();
		return input;
	}

}
