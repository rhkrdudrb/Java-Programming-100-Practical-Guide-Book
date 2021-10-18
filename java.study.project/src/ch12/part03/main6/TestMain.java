package ch12.part03.main6;

import java.util.HashSet;
import java.util.Set;

public class TestMain {
	public static void main(String[] args) {
		
		/** Set 타입 객체생성 및 자료등록*/
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(new Integer(10));
		set.add(new Integer(100));
		System.out.println("set 객체생성 및 자료등록");
		System.out.println(set);
		System.out.println();
		
		/**자료삭제 1*/
		set.remove(10);
		System.out.println("자료삭제 : 10");
		System.out.println(set);
		System.out.println();
		
		/**자료삭제 2*/
		set.remove(new Integer(100));
		System.out.println("자료삭제 : new Integer(100)");
		System.out.println(set);
	}
}
