package ch09.part03.main2;

public abstract class AbstractClass {

	/** 추상메소드 */
	public abstract void method1();

	/** 일반함수 정의*/
	public void method2() {
		System.out.println("AbstractClass 클래스 method2() 로직");
		/**추상메소드 method1() 사용가능*/
		method1();
	}
	
	/**생성자함수 정의*/
	public AbstractClass() {
		System.out.println("AbstractClass 생성자 함수");
	}
}
