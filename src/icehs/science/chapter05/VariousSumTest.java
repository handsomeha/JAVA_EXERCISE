package icehs.science.chapter05;

public class VariousSumTest {

	public static void main(String[] args) {
		int sum1=0;
		int sum2=0;
		int sum3=0;
		
		for(int a=1;a<=1000;a++) {
			sum1+=a;
			if(a%2==0) {
				sum2 +=a;
			}
			else sum3 +=a;
		}
		System.out.println("1���� 1000������ �� : "+sum1);
		System.out.println("1���� 1000���� ¦������ �� : "+sum2);
		System.out.println("1���� 1000���� Ȧ������ �� : "+sum3);
	}

}
