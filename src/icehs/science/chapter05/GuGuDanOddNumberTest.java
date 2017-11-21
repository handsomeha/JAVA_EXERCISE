package icehs.science.chapter05;

public class GuGuDanOddNumberTest {

	public static void main(String[] args) {
		int i=2;
		int j=1;
		while(i<=5) {
			
			while(j<=9) {
				if((i*j) %2 ==0) continue;
				System.out.println(i+" * "+j+" = "+(i*j));
				j++;
			}
			i++;
		}
		
	}

}
