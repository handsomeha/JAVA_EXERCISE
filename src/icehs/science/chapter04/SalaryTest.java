package icehs.science.chapter04;

public class SalaryTest {

	public static void main(String[] args) {
		int sal=1000000;
		int sal_year=sal*12;
		int sal_year_aftertax=sal_year*9/10;
		int bonus=sal*8/10;
		int bonus_aftertax=bonus*945/1000;
		int tot=sal_year_aftertax+bonus_aftertax;
		
		System.out.println("연봉 : "+sal+" , 세후 연봉 : "+sal_year);
		System.out.println("보너스 : "+bonus+" , 세후 보너스 : "+bonus_aftertax);
		System.out.println("지급액 : "+tot);
		
	}

}
