package icehs.science.chapter04;

public class SeperateNumberTest {

	public static void main(String[] args) {
		int num=456;
		int hun=num/100;
		int na1=num%100;
		int ten=na1/10;
		int na2=na1%10;
		
		System.out.println("숫자 : "+num);
		System.out.println("백의 자리 수 : "+hun);
		System.out.println("십의 자리 수 : "+ten);
		System.out.println("일의 자리 수 : "+na2);

	}

}
