package ch12.part04.main5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMain {
	public static void main(String[] args) {

		/** 객체생성 */
		System.out.println("객체생성 및 자료등록");
		Map<String, String> map1 = new HashMap<String,String>();
		map1.put("1","a");
		map1.put("2","b");
		map1.put(null,"e");
		map1.put("3",null);
		System.out.println("map1 = " + map1);
		System.out.println();
		
		/** key 조회*/
		System.out.println("key 조회");
		Set<String> keySet = map1.keySet();
		System.out.println("keySet = " + keySet);
		
		/** key 값이 존재함*/
		boolean containKey1 = map1.containsKey("3");
		boolean containKey2 = map1.containsKey(null);
		/** key 값이 존재 안 함 */
		boolean containKey3 = map1.containsKey("4");
		
		System.out.println("containKey1 '3' 조회" + containKey1);
		System.out.println("containKey2  null 조회" + containKey2);
		System.out.println("containKey3 '4' 조회" + containKey3);
		
		/**Value 조회*/
		System.out.println("value 조회");
		Collection<String> values = map1.values();
		System.out.println("value" + values);
		
		/**value 값 존재함*/
		boolean containsValue1 = map1.containsValue("a");
		boolean containsValue2 = map1.containsKey(null);
		/** value 값이 존재 안 함 */
		boolean containsValue3 = map1.containsKey("f");
		
		System.out.println("containsValue1 'a' 조회 " + containsValue1);
		System.out.println("containsValue1 null 조회 " + containsValue2);
		System.out.println("containsValue1 'f' 조회 " + containsValue3);
	}
}