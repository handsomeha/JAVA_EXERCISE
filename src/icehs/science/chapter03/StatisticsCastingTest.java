package icehs.science.chapter03;

public class StatisticsCastingTest {

	public static void main(String[] args) {
		double lotto = 0.0000001235;
		System.out.println("�ζǿ� ��÷�� Ȯ�� :" + lotto);
		
		int intlotto=(int)lotto;
		System.out.println("�ζǿ� ��÷�� Ȯ�� int ��ȯ :" + intlotto);
		
		long Num = 6973738433L;
		System.out.println("�� ������ �α� �� :" + Num);
		
		int intNum =(int)Num;
		System.out.println("�� ������ �α� �� int ��ȯ :" + intNum);
	}

}
