package icehs.science.chapter04;

public class SalaryTest {

	public static void main(String[] args) {
		int sal=1000000;
		int sal_year=sal*12;
		int sal_year_aftertax=sal_year*9/10;
		int bonus=sal*8/10;
		int bonus_aftertax=bonus*945/1000;
		int tot=sal_year_aftertax+bonus_aftertax;
		
		System.out.println("���� : "+sal+" , ���� ���� : "+sal_year);
		System.out.println("���ʽ� : "+bonus+" , ���� ���ʽ� : "+bonus_aftertax);
		System.out.println("���޾� : "+tot);
		
	}

}
