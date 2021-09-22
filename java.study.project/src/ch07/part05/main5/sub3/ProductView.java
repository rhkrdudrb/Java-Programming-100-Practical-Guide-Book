package ch07.part05.main5.sub3;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ProductView extends JFrame {
	public ProductView() {
		/** 화면 사이즈 설정 */
		this.setSize(300, 300);

		/** 테이블 자료 */
		ProductVo product1 = new ProductVo("a001", "아메리카노", 4000);
		ProductVo product2 = new ProductVo("a002", "까페라떼", 4300);
		ProductVo product3 = new ProductVo("a003", "까페모카", 4500);

		/** 테이블 정보 만들기 */
		String[] header = product1.getHeaderInfo();
		Object[][] data = new Object[][] { product1.getData(), product2.getData(), product3.getData() };

		/** 테이블 컴포넌트 구성하기 */
		JTable table = new JTable(data, header);
		JScrollPane pane = new JScrollPane();
		pane.setViewportView(table);

		/** 화면에 추가하기 */
		this.add(pane);
	}

	public static void main(String[] args) {
		ProductView view = new ProductView();
		view.setVisible(true);
	}
}