package icehs.science.chapter04;

public class GradeTest {

	public static void main(String[] args) {
		int num=75;
		boolean result1= (num < 100) && (num >= 90);
		boolean result2= (num < 90) && (num >= 80);
		boolean result3= (num < 80) && (num >= 70);
		boolean result4= (num < 70) && (num > 60);
		
		System.out.println("A학점 : "+result1);
		System.out.println("B학점 : "+result2);
		System.out.println("C학점 : "+result3);
		System.out.println("D학점 : "+result4);

	}

}
