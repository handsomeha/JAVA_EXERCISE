package icehs.science.chapter06;

public class Student2 {

	String studentName;
	String studentNum;
	int kor=94;
	int eng=80;
	int math=89;
	
	void printStuInfo() {
		System.out.println("�̸� : "+studentName);
		System.out.println("�й� : "+studentNum);
		System.out.println("���� ���� : "+kor);
		System.out.println("���� ���� : "+eng);
		System.out.println("���� ���� : "+math);
			}
	void calcavg() {
		double avg=(kor+eng+math)/3;
		System.out.println("��� : "+avg);
	}
	
	void change() {
		System.out.println("* �й��� �����մϴ�!!!");
	}
	void changeStudentNum(String newstudentNum) {
		studentNum= newstudentNum;
	}
	

}
