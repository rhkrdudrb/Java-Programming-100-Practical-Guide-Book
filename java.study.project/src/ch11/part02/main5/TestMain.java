package ch11.part02.main5;

public class TestMain {

	public static void main(String[] args) {

		/** A 타입 count 정적 전역변수 1증가 */
		A.count++;
		/** A 타입 a01 객체생성 및 count 정적 전역변수 1증가 */
		A a01 = new A();
		a01.count++;
		/** A 타입 a02 객체생성 및 count 정적 전역변수 1증가 */
		A a02 = new A();
		a02.count++;
		/** A 타입 a03 객체생성 및 count 정적 전역변수 1증가 */
		A a03 = new A();
		a03.count++;
		
		
		/**문제 다음의 결과값을 코드작성 전에 풀어보세요*/
		System.out.println(a02.count);
		//풀이! 모드 같은 new(생성자부름) 을하여 객체는 힙 메모리에 저장되기 때모ㅜㄴ에 count++ 을 4번한 결과가 나온다
	}
}