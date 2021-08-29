package ch03.part03.main3;

public class TestMain1 {
	public static void main(String[] args) {

		/** 실수 → 정수로 형변환 : 값의 변경 있음 */
		double a = 1.414;
		int b = (int) a;

		/** 정수 → 실수로 형변환 : 값의 변경 없음 */
		int c = 1;
		double d = (double) c;
		double e = c;

		/** char → 정수로 형변환 : 값의 변경 있음 */
		char m = 'A';
		int n = (int) m;

		/** char → 정수로 형변환 : 값의 변경 있음 */
		int o = 100;
		char p = (char) o;

		long a1 = 300000123;
		System.out.println(a1);
		double b1 = a1;
		System.out.println(b1);
	}
}