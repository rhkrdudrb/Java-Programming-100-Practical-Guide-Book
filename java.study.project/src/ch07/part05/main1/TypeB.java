package ch07.part05.main1;


public class TypeB {
	/**제네릭 타입을 이용한 함수 정의1*/
	public <T> T method1(T t){
		return t;
	}
	/**제네릭 타입을 이용한 static 함수 정의2*/
	public static<T> T method2(T t){
		return t;
	}
	/**제네릭 타입을 이용한 함수정의 3 - 제네릭 타입을 가진 파라미터 */
	public <T> T method3(TypeA<T> a){
		return a.getT();
	}
	/**제네릭 타입을 이용한 static 함수 정의 4 - 제네릭타입을 가진 파라미터*/
	public static <T> T method4(TypeA<T> a){
		return a.getT();
	}
}
