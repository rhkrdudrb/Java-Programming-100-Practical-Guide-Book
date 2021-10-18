package ch12.part04.main2.sub4;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMain {
	public static void main(String[] args) {

		/** 1. 객체생성 및 자료등록 */
		System.out.println("객체생성 및 자료등록");
		Map<String,String> map1 = new HashMap<String,String>();
		map1.put("1","a");
		map1.put("2","b");
		map1.put("3","c");
		map1.put("4","d");
		System.out.println("map1 = " + map1);
		System.out.println();
		
		/** 2. 일괄자료등록*/
		System.out.println("일괄자료등록 - map.putAll(map2)");
		Map<String,String> map2 = new HashMap<String,String>();
		map2.put("1","e");
		map2.put("2","f");
		map2.put("3","g");
		map2.put("4","h");
		map1.putAll(map2);
		System.out.println("map2 = " + map2);
		System.out.println("map1 = " + map1);
		System.out.println();
		
		/** 3. 전체 Key 자료조회*/
		System.out.println("전체 Key 자료조회 map1.keySet()");
		Set<String> keySet = map1.keySet();
		for(String s : keySet) {
			System.out.println(" key 검색 = [" + s +"]");
		}
		System.out.println("map1 = " + map1);
		System.out.println();
		
		/** 4. 전체 value 자료조회*/
		System.out.println("전체 value 자료조회 map1.values()");
		Collection<String> valuses = map1.values();
		for(String s : valuses) {
			System.out.println(" value 검색 = [" + s +"]");
		}
		System.out.println("map1 = " + map1);
	}
}