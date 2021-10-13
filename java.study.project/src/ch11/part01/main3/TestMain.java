package ch11.part01.main3;

public class TestMain {

	/** TestMain 전역변수 name 정의 */
	private String name = "TestMain  전역변수 name"; // [변수1]

	/** method() 함수 정의 */
	private void method() {
		
		/**지역변수 name 정의*/
		String name = "method() 함수 지역변수 name"; //[변수2]
		
		/**익명클래스*/
		ITest ITest = new ITest() {
			/**익명클래스 전역변수 name 정의*/
			private String name = "익명클래스  전역변수 name"; // [변수3]
			
			/**method()2 함수 재정의*/
			@Override
			public void method2(){
				
				/**지역변수 name 정의*/
				 String name = "method2() 함수 지역변수 name"; // [변수4]
				/**문제1 : 변수1의 값을 콘솔화면에 나타내시오*/
				System.out.println(TestMain.this.name);
				/**문제2 : 변수2의 값을 콘솔화면에 나타내시오*/
				//System.out.println(TestMain.ITest.);
				/**문제3 : 변수3의 값을 콘솔화면에 나타내시오*/
				System.out.println(this.name);
				/**문제4 : 변수4의 값을 콘솔화면에 나타내시오*/
				System.out.println(name);
			}
		};
	}
	/**인터페이스 정의*/
	public interface ITest{
		public void method2();
	}
	/** 메인함수 정의 */
	public static void main(String[] args) {
		TestMain testMain = new TestMain();
		testMain.method();
	}
}