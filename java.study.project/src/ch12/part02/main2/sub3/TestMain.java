package ch12.part02.main2.sub3;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
	public static void main(String[] args) {

		/** 1. 객체생성 */
		System.out.println("[객체생성 add()]");
		List<String> list1 = new ArrayList<String>();
		System.out.println("객체생성" + list1);
		
		/**2. 자료등록*/
		System.out.println("자료등록");
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		System.out.println("자료등록 결과 = "+list1);
		
		/**자료수정*/
		System.out.println("자료수정 set()");
		list1.set(0, "A");
		list1.set(1, "B");
		System.out.println("자료수정 결과 = "+list1);
		
		/**자료삭제*/
		System.out.println("자료삭제");
		list1.remove(0); //0인덱스 자료 삭제
		System.out.println("자료삭제 결과 = "+list1);
		
		list1.remove("c"); // 첫 번째 자료 b 를 삭제
		System.out.println("자료삭제 'c' 결과 = "+list1);
		
		/**자료포함여부*/
		System.out.println("자료포함여부");
		boolean contains = list1.contains("B");
		System.out.println("자료포함여부 = "+contains);
		
		
	}
}