package icehs.science.chapter05;

public class SumANdAverageTest {

	public static void main(String[] args) {
		int sum=0;
		double ave=0;
		for(int a=1;a<=500;a++) {
			sum+=a;
			ave=(double)sum/a;
			
		}
		System.out.println("ÇÕ°è : "+sum);
		System.out.println("Æò±Õ : "+ave);
	}

}
