package ch11.part01.main1;

public class TestMain {

	/** 전역변수 정의 */
	private String name = "전역변수 name"; // [변수1]
	
	/**method() 함수정의*/
	public void method() {
		String name = "지역변수 name"; //[변수2]
		//문제 1 변수 1의 값을 콘솔화면에 나타내시오.
		System.out.println(this.name);
		//문제2 변수2의 값을 콘솔화면에 나타내시오.
		System.out.println(name);
	}
	
	/**메인함수 정의*/
	public static void main(String[]args) {
		/**객체생성 및 함수사용*/
		TestMain testMain = new TestMain();
		testMain.method();
	}
}