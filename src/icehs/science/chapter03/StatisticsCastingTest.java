package icehs.science.chapter03;

public class StatisticsCastingTest {

	public static void main(String[] args) {
		double lotto = 0.0000001235;
		System.out.println("로또에 당첨될 확률 :" + lotto);
		
		int intlotto=(int)lotto;
		System.out.println("로또에 당첨될 확률 int 변환 :" + intlotto);
		
		long Num = 6973738433L;
		System.out.println("전 세계의 인구 수 :" + Num);
		
		int intNum =(int)Num;
		System.out.println("전 세계의 인구 수 int 변환 :" + intNum);
	}

}
