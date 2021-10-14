package ch12.part02.main3.sub2;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
	public static void main(String[] args) {

		/** 자료구조 객체생성 */
		ArrayList<MemberVo> list1 = new ArrayList<MemberVo>();

		/** MemberVo 객체생성 */
		MemberVo member1 = new MemberVo("a001", "홍길동");
		MemberVo member2 = new MemberVo("a002", "곽영규");
		
		/**자료추가*/
		list1.add(member1);
		list1.add(member2);
		System.out.println("최초자료등록");
		System.out.println("list1" + list1);
		System.out.println();
		
		/**자료복사 - Deep Copy*/
		ArrayList<MemberVo> list2 = (ArrayList<MemberVo>) list1.clone();
		System.out.println("자료복사 Deep Copy");
		System.out.println("list2" + list2);
		System.out.println();
		
		/**자료 member1 속성 변경 */
		member1.memberld = "p001";
		System.out.println("member1 속성 변경");
		System.out.println("list1" + list1);
		System.out.println("list2" + list2);
		System.out.println();
		
		/**자료의 추가*/
		MemberVo member3 = new MemberVo("a003", "강감찬");
		list1.add(member3);
		System.out.println("member3 객체자료 등록");
		System.out.println("list1" + list1);
		System.out.println("list2" + list2);
	}
	
	/**MemberVo 내부클래스 정의*/
	public static class MemberVo{
		/**생성자 함수 정의*/
		public MemberVo(String memberld, String memberName) {
			this.memberld = memberld;
			this.memberName = memberName;
		}
		/**memberld,memberName 전역변수 정의 */
		private String memberld;
		private String memberName;
		public String toString() {
			return "["+memberld +","+memberName+ "]";
			}
	}
}