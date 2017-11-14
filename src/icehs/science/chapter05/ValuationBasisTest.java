package icehs.science.chapter05;

public class ValuationBasisTest {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=40;
		int d=50;
		int f=80;
		double g=(double)6/10*a*b/2 + (double)13/100*(c+d)/2 + (double)27/100*f;
		
		System.out.println("평가 점수 : "+g);
		
		if(g>=95) {
			System.out.println("Special Class 입니다!!");
		}
		else if(g>=90) {
			System.out.println("Gold Class 입니다!!");
		}
		else if(g>=85) {
			System.out.println("Silver Class 입니다!!");
		}
		else if(g>=80) {
			System.out.println("Bronze Class 입니다!!");
		}
		else {
			System.out.println("Member 입니다!!");
		}

	}

}
