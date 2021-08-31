package ch02.part03.main1.sub1;

public class TestVarient1 {
	public static void main(String[] args) {


		int a = 3;									
		double b = 3.14;						
		boolean c = true;						
		String d = "Hello Java";			

		/* 변수 값의 변경 - 선언된 변수는 변경이 가능하다. */
		a = 4;
		b = 1.414;
		c = false;
		d = "Hello Java2";

		/* 변수 값을 화면에 출력하기 */
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}