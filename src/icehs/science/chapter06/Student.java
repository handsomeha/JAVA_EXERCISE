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
		System.out.println("�̸� : "+studentName);
		System.out.println("�й� : "+studentNumber);
		System.out.println("���� ���� : "+scoreKorean);
		System.out.println("���� ���� : "+scoreEnglish);
		System.out.println("���� ���� : "+scoreMath);
	}
	void changestudentNumber(String newstudentNumber) {
		studentNumber = newstudentNumber;
	}
}
