package icehs.science.chapter04;

public class SeperateNumberTest {

	public static void main(String[] args) {
		int num=456;
		int hun=num/100;
		int na1=num%100;
		int ten=na1/10;
		int na2=na1%10;
		
		System.out.println("���� : "+num);
		System.out.println("���� �ڸ� �� : "+hun);
		System.out.println("���� �ڸ� �� : "+ten);
		System.out.println("���� �ڸ� �� : "+na2);

	}

}
