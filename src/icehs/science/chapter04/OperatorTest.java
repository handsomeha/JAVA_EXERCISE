package icehs.science.chapter04;

public class OperatorTest {

	public static void main(String[] args) {
		int num=64;
		boolean result3=(num%2==0)&&(num%7==0);
		boolean result4=(num%2==0)||(num%7==0);
		
		System.out.println("¦���Դϱ�? : "+(num%2==0));
		System.out.println("3�� ����Դϱ�? : "+(num%3==0));
		System.out.println("2�� ����̸鼭 7�� ����Դϱ�? : "+result3);
		System.out.println("2�� ����̰ų� 7�� ����Դϱ�? : "+result4);
		
		
		
		
	}
}
