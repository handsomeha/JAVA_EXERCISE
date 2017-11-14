package icehs.science.chapter05;

public class GradeIfElseIfTest {

	public static void main(String[] args) {
		int d=92;
		
		if(d>=90) {
			System.out.println("A학점 입니다.");
		}
		else if(d>=80) {
			System.out.println("B학점 입니다.");
		}
		else if(d>=70) {
			System.out.println("C학점 입니다.");
		}else if(d>=60) {
			System.out.println("D학점 입니다.");
		}else {
			System.out.println("F학점 입니다.");
		}
	}

}
