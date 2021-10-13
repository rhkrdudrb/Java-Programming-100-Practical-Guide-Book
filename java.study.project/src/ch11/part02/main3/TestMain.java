package ch11.part02.main3;

public class TestMain {
	
	public void setName(String name) {

	}
	
	public void print() {
		/**setName() 으로 들어오는 name 값을 출력하시오.*/
		//System.out.println(name);
	}
	
	public static void main(String [] arge) {
		TestMain testMain = new TestMain();
		testMain.setName("아메리카노 좋아좋아좋아~");
		testMain.print();
	}
	
	
	
}