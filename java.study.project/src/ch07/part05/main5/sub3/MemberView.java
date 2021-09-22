package ch07.part05.main5.sub3;

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

		/** 테이블 정보 만들기 */
		String[] header = member1.getHeaderInfo();
		Object[][] data = new Object[][] { member1.getData(), member2.getData(), member3.getData() };

		/** 테이블 컴포넌트 구성하기 */
		JTable table = new JTable(data, header);
		JScrollPane pane = new JScrollPane();
		pane.setViewportView(table);

		/** 화면에 추가하기 */
		this.add(pane);
	}

	public static void main(String[] args) {
		MemberView memberView = new MemberView();
		memberView.setVisible(true);
	}
}