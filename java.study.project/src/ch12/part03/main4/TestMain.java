package ch12.part03.main4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestMain {
	public static void main(String[] args) {

		/** 숫자 자료구조 생성 */
		System.out.println("[set1]정렬");
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(55);
		set1.add(3);
		set1.add(44);
		set1.add(1);
		set1.add(22);
		
		/**자료정렬*/
		ArrayList arry = new ArrayList(set1);
		System.out.println("정렬전 " + arry);
		Collections.sort(arry);
		System.out.println("정렬후 " + arry);
	}
}