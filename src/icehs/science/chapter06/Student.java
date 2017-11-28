package icehs.science.chapter06;

public class Student {
	String studentName;
	String studentNumber;
	int scoreKorean;
	int scoreEnglish;
	int scoreMath;
	double average;
	
	double calculatorAverage() {
		average=(scoreKorean+scoreEnglish+scoreMath)/3.0;
		return average;
	}
	void studentInformation() {
		System.out.println("이름 : "+studentName);
		System.out.println("학번 : "+studentNumber);
		System.out.println("국어 성적 : "+scoreKorean);
		System.out.println("영어 성적 : "+scoreEnglish);
		System.out.println("수학 성적 : "+scoreMath);
	}
	void changestudentNumber(String newstudentNumber) {
		studentNumber = newstudentNumber;
	}
}
