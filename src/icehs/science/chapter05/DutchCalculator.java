package icehs.science.chapter05;

import java.util.Scanner;

public class DutchCalculator {

	public static void main(String[] args) {
		int sum=0;
		System.out.println("모임이 몇차까지 진행되었나요?");
		int numOfCha=getUserInput();
		System.out.println("==========================");
		System.out.println("각 차수에서 쓴 비용을 입력하세요.");
		for(int i=1;i<=numOfCha;i++) {
			System.out.println(i+"차 비용 : ");
			sum +=getUserInput();
			
		}
		System.out.println("총 비용은 "+ sum+ "원 입니다.");
		System.out.println("==========================");
		
		System.out.println("모임의 인원수를 입력하세요 : ");
		int num=getUserInput();
		System.out.println("==========================");
		System.out.println("더치페이 금액은?");
		int money=sum/num;
		for(int j=1;j<=num;j++) {
			if(j==num) {
				System.out.println(num+" : "+sum+"원");
			}else {
			System.out.println(j+" : "+money+"원");
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
