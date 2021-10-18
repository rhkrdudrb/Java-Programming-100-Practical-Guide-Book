package ch12.part03.main2.sub2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestMain {
	public static void main(String[] args) {
		/** 객체생성*/
		Set<String> set = new HashSet<String>();
		System.out.println("객체생성" + set);
		
		/** 자료등록*/
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("a");
		System.out.println("자료등록" + set);
		
		/** 자료조회1 */
		System.out.println("자료조회3");
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String data = iter.next();
			System.out.println("자료" + data);
		}
		
		/** 자료조회 향상된 for문*/
		System.out.println("자료조회4");
		for(String data : set) {
			System.out.println("자료" + data);
		}
		
	}
}