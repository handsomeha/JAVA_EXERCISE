package icehs.science.chapter05;

public class MultiFiveSumTest {

	public static void main(String[] args) {
		int sum=0;
		int i=1;
		while(sum<=100) {
			int five=i*5;
			sum+=five;
			
			System.out.println(i++ + ". ( +"+five+" ) "+sum);
		}

	}

}
