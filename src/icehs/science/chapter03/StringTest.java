package icehs.science.chapter03;

public class StringTest {

	public static void main(String[] args) {
		String sejong = "¼¼Á¾´ë¿Õ";
		String num = "10000";
		int year = 2017;
		
		int parsenum = Integer.parseInt(num);
		
		System.out.println(sejong +":" +num);
		System.out.println(year + "³â");
		System.out.println(num+year);
		System.out.println(parsenum+year);
		

	}

}
