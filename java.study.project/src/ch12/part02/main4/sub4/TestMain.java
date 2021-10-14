package ch12.part02.main4.sub4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ch12.part02.main4.sub4.TestMain.MemberVo;

public class TestMain {
	public static void main(String[] args) {

	System.out.println("list 사용자 기준 정렬 - 이름 내림차순정렬");
	List<MemberVo> list = new ArrayList<MemberVo>();
	list.add(new MemberVo("p001","아메리카노",4000));
	list.add(new MemberVo("p002","까페모카",8000));
	list.add(new MemberVo("p003","까페라떼",12000));
	System.out.println("정렬전" + list);
	
	/** 이름으로 내림차순정렬 */
	Collections.sort(list, new Comparator<MemberVo>(){
		@Override
		public int compare(MemberVo o1, MemberVo o2) {
			String name1 = o1.productName;
			String name2 = o2.productName;
			if(name1==null && name2==null){ return 0; }
			else if(name1==null && name2!=null){ return -1; }
			else if(name1!=null && name2==null){ return 1; }
			else if(name1!=null && name2!=null){
				return name1.compareTo(name2);
			}
			return 0;
		}
	});
	System.out.println("정렬 후"+list);
	}
	/**MemberVo 내부클래스 정의*/
	
	public static class MemberVo{
		
		private String productld;
		private String productName;
		private int price;
		
		/**생성자 함수 정의*/
		public MemberVo(String productld, String productName, int price) {
			this.productld = productld;
			this.productName = productName;
			this.price = price;
		}
	
		@Override
		public String toString() {
			return "["+productld +","+productName+ ","+price+"]";
			}
	}
}