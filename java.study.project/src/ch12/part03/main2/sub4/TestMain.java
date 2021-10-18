package ch12.part03.main2.sub4;

import java.util.HashSet;
import java.util.Set;

public class TestMain {
	public static void main(String[] args) {
		
		/**객체생성 및 자료등록*/
		Set<String> set = new HashSet<String>();
		set.add("a"); set.add("b"); set.add("c");
		System.out.println("set = " + set);
		System.out.println();
		
		/**자료추출 subList(int 시작인덱스, int 종료인덱스) 함수 존재안함*/
		
		/** 일괄자료 등록 - addAll()*/
		Set<String> set2 = new HashSet<String>();
		set2.add("a"); set2.add("b"); set2.add("c");
		set.addAll(set2);
		System.out.println( "set = " + set);
		System.out.println("일괄자료등록 set.addAll(set2)");
		System.out.println("set" + set);
		System.out.println();
		
		/**자료포함 여부*/
		Set<String> set3 = new HashSet<String>();
		set3.add("a"); set3.add("b"); set3.add("c");
		boolean containsAll = set.containsAll(set3);
		System.out.println( "set3 = " + set3);
		System.out.println("일괄자료포함여부 containsAll(set3)");
		System.out.println("set" + set);
		System.out.println();
		
		/** 일괄자료 삭제 -removeAll*/
		Set<String> set4 = new HashSet<String>();
		set4.add("a"); set4.add("b"); set4.add("c");
		set.removeAll(set4);
		System.out.println( "set4 = " + set4);
		System.out.println("일괄자료삭제 removeAll(set4)");
		System.out.println("set =" + set);
		System.out.println();
		
		/** 5 . 일괄공통자료 외 삭제 -> 공통자료만 남기기*/
		Set<String> set5 = new HashSet<String>();
		set5.add("a"); set5.add("b"); set5.add("c");
		set.retainAll(set5);
		System.out.println( "set5 = " + set5);
		System.out.println("일괄공통자료 외 삭제 retainAll(set5)");
		System.out.println("set = " + set);

	}
}