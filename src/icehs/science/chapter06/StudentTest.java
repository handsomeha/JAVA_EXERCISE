package icehs.science.chapter06;

public class StudentTest {
	public static void main(String[] args) {
		Student stu1=new Student();
		System.out.println(stu1);
		stu1.studentName="ȫ�浿";
		stu1.scoreKorean=80;
		stu1.scoreEnglish=90;
		stu1.scoreMath=100;
		
		System.out.println(stu1.studentName);
		System.out.println(stu1.scoreKorean);
		System.out.println(stu1.scoreEnglish);
		System.out.println(stu1.scoreMath);
		System.out.println(stu1.calculatorAverage());
		System.out.println(stu1.average);
		
	}
}
