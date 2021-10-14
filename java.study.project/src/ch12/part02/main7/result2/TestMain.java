package ch12.part02.main7.result2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestMain {
	public static void main(String[] args) {

		/** 자료구조 객체생성 */
		List<Integer> list = new ArrayList<Integer>();

		/** 자료의 추가 */
		for(int i = 1; i<=10; i++){
			list.add(i*10);
		}

		/** 체크된 인덱스 파악 */
		int[] removeIndexArr = {0, 2, 4, 7, 9};

		/**Iterator 를 이용한 자료조회 및 자료삭제*/
		Iterator<Integer> iterator = list.iterator();
		int index = 0;
		while(iterator.hasNext()){
			/**자료조회*/
			Integer next = iterator.next();
			
			/**해당 인덱스와 같을 경우 삭제*/
			for(int i : removeIndexArr){
				if(index==i){
					iterator.remove();
					break;
				}
			}

			index++;
		}
		/** 결과자료 조회 */
		System.out.println(list);
	}
}