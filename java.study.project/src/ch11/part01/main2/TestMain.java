package ch11.part01.main2;

public class TestMain {

	/** 전역변수 정의 */
	private String name = "TestMain 전역변수 name";  // [변수1]

	/** 내부클래스 정의 */
	public class InnerClass {
		
		/**내부클래스 전역변수 정의*/
		private String name= "innerClass 전역변수 name"; // [변수2]
		
		/**metgod() 함수 정의*/
		private void method() {
			/**지역변수 정의*/
			String name = "method() 지역변수 name"; // [변수3] 
			/*문제1 : 변수1의 값을 콘솔화면에 나타내시오*/
			System.out.println(TestMain.this.name);
			/*문제2 : 변수2의 값을 콘솔화면에 나타내시오*/
			System.out.println(this.name);
			/*문제3 : 변수3의 값을 콘솔화면에 나타내시오*/
			System.out.println(name);
			
		}
	}
		
	/** 메인함수 정의 */
	public static void main(String[] args) {
		/** 객체생성 및 함수호출 */
		TestMain testMain = new TestMain();
		testMain.new InnerClass().method();
	}
}