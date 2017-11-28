package icehs.science.chapter06;

public class Student2 {

	String studentName;
	String studentNum;
	int kor=94;
	int eng=80;
	int math=89;
	
	void printStuInfo() {
		System.out.println("이름 : "+studentName);
		System.out.println("학번 : "+studentNum);
		System.out.println("국어 성적 : "+kor);
		System.out.println("영어 성적 : "+eng);
		System.out.println("수학 성적 : "+math);
			}
	void calcavg() {
		double avg=(kor+eng+math)/3;
		System.out.println("평균 : "+avg);
	}
	
	void change() {
		System.out.println("* 학번을 변경합니다!!!");
	}
	void changeStudentNum(String newstudentNum) {
		studentNum= newstudentNum;
	}
	

}
