package icehs.science.chapter05;

public class GuGuDan1Test {

	public static void main(String[] args) {
		for(int i=2;i<10;i++) {
			
			
			for(int j=1;j<=9;j++) {
		if(j==5) continue;
				System.out.print(i+" * "+j+" = "+(i*j)+"\t");
			
			}
			System.out.println();
		}

	}

}
