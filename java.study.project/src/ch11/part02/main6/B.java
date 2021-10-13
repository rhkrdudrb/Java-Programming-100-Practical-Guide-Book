package ch11.part02.main6;

public class B {
	/** print() 함수 정의*/
	public void print() {
		
		/** DataContainer로 부터 객체 a에 자료접근을 한다*/
		A a= DataContainer.a;
		String name = "";
		if(a != null) {name = a.getName();}
		System.out.println(name);
	}
}
