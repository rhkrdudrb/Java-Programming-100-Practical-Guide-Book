package ch09.part03.main3;

/** 추상클래스를 상속한 자식클래스의 정의 */
public class ChildClass extends AbstractClass {
	/**정적 전역변수 정의*/
	private static String var3 = "static 전역변수";
	
	/**정적 초기화 블록 정의*/
	static {
		System.out.println("\t 구현클래스 - var3 [" + var3 + "]");
	}
	/**전연변수 정의*/
	private String var4 = "전역변수";
	
	/**초기화블록 정의*/
	{
		System.out.println("\t 구현클래스 - var4 [" + var4 + "]");
	}
	/**생성자함수 정의*/
	public ChildClass() {
		System.out.println("\t 구현클래스 - 생성자함수");
	}
	/**method1() 추상메소드 재정의*/
	public void method1() {
		System.out.println("\t 구현클래스 - method1() - var4 [" + var4 + "]");
	}
}
