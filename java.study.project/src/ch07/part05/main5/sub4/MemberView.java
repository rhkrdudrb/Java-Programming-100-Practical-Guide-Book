package ch07.part05.main5.sub4;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MemberView extends JFrame {
	public MemberView() {

		/** 화면 사이즈 설정 */
		this.setSize(300, 300);

		/** 테이블 자료 */
		MemberVo member1 = new MemberVo("a001", "강감찬");
		MemberVo member2 = new MemberVo("a001", "이순신");
		MemberVo member3 = new MemberVo("a001", "홍길동");

		/** 모듈을 이용하여 테이블 정보 만들기 */
		MemberVo[] members = {member1, member2, member3};
		TableGroup<MemberVo> tableGroup	= new TableGroup<MemberVo>(members);

		/** 화면에 추가하기 */
		this.add( tableGroup.getTablePanel() );
	}

	public static void main(String[] args) {
		MemberView memberView = new MemberView();
		memberView.setVisible(true);
	}
}