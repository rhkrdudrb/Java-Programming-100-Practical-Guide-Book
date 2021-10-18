package ch12.part05.main3.sub1;

import java.util.LinkedList;
import java.util.Queue;

public class TestMain {
	public static void main(String[] args) {

		/** 객체생성 */
		Queue<String> q = new LinkedList<>();
		
		/** 자료추가 : offer() 함수를 정의하여 해당 함수에서 추가*/
		offer(q, "1"); offer(q, "b");offer(q, "3");offer(q, "c");
		
		/** 자료삭제 : 입력된 순서대로 자료가 삭제*/
		poll(q);poll(q);   poll(q);   poll(q);   poll(q);
	}

	/** 인쇄 라인번호를 나타내기 위한 변수*/
	private static int no = 0;
	
	/** 자료 저장 밒 메시지 출력*/
	private static void offer(Queue q, Object data) {
		/** 자료 저장 Queue offer() 함수 사용*/
		q.offer(data);
		no++;
		String msg = "절차" + no + "offer [" + data + "]";
		msg += "peek ["+ q.peek()+"]";
		msg += "자료구조" + q;
		System.out.println(msg);
	}
		/** 자료 삭제 및 메세지 출력*/
		private static void poll(Queue q) {
			/** 자료삭제 Queue poll() 함수사용*/
			Object data = q.poll();
			no++;
			String msg = "절차" + no + "\t  poll ["+ data+"]";
			msg += "peek ["+ q.poll()+"]";
			msg += "자료구조" + q;
			System.out.println(msg);	
		}
}