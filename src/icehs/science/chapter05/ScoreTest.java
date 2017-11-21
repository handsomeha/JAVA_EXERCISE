package icehs.science.chapter05;

import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		System.out.println("반의 학생 수는?");
		int stuNo=getUserInput();
		int scoreSum=0;
		for(int i=1;i<=stuNo;i++) {
			System.out.print(i+"번 점수는?");
			scoreSum += getUserInput();
		}
		System.out.println(stuNo+"명의 총점 : "+scoreSum+"점");
		System.out.println(stuNo+"명의 평균 : "+(double)scoreSum/stuNo+"점");
		
	}
	public static int getUserInput() {
		Scanner sc= new Scanner(System.in);
		int input= sc.nextInt();
		
		return input;
	}

}
