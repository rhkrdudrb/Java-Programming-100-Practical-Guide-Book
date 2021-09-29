package ch08.part02.main5.sub2;

import java.util.ArrayList;

public class TestMain {

	public static void main(String[] args) {

		/** public static void add(ArrayList<String>) list, String... str) 함수사용 */
		ArrayList<String> list1 = new ArrayList<String>();
		
		/**자료추가*/
		list1.add("a");
		list1.add("b");
		System.out.println(list1);
		
		/**모듈을 이용한 자료추가*/
		ArrayListUtil.add(list1, "c","d","e","f");
		System.out.println(list1);
		
		/**2.public static <T> void add(ArrayList<T> list, T... str) 함수사용*/
		
		/**객체생성*/
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		/**자료추가*/
		list2.add(1);
		list2.add(2);
		System.out.println();
		System.out.println(list2);
		
		
		/**모듈을 이용한 자료추가*/
		ArrayListUtil.add(list2, 3,4,5);
		System.out.println(list2);
		
	}

}