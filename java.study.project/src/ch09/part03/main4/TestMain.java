package ch09.part03.main4;

public class TestMain {
	public static void main(String [] args) {
		
		/**childClass 객체생성*/
		ChildClass c = new ChildClass(); 
		/**업캐스팅 - 형변환 연산자 생략가능*/
		AbstractClass c1 = c;
		/**다운캐스팅 - 형변환 연산자 생략불가능*/
		if(c1 instanceof ChildClass) {
			ChildClass c2 = (ChildClass) c1;
		}
		
	}
}
