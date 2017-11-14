package icehs.science.chapter05;

public class SwitchCaseTest {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=40;
		int d=50;
		int e=80;
		double f=a*b/2*0.6;
		f +=(c+d)/2*0.13;
		f +=e*0.27;
		int z=(int)f;
		
		System.out.println("평가 점수 : "+z);
		int resultf=(int)f/10;
		switch(resultf) {
		case 9 : System.out.println("Special Class 입니다.");break;
		case 8 : System.out.println("Gold Class 입니다.");break;
		case 7 : System.out.println("Silver Class 입니다.");break;
		case 6 : System.out.println("Bronze Class 입니다.");break;
		default : System.out.println("Member 입니다.");
		}
		
	}

}
