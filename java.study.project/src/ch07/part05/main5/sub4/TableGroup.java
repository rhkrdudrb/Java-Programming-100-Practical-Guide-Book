package ch07.part05.main5.sub4;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TableGroup<T extends DefaultVo> {

	private JScrollPane pane = new JScrollPane();

	public TableGroup(T... array) {
		
		/** 헤더정보와 자료목록정보를 가져와서 테이블에 처리 */
		String[] header = array[0].getHeaderInfo();
		Object[][] data = new Object[array.length][];

		for (int i = 0; i < data.length; i++) {
			T t = array[i];
			data[i] = t.getData();
		}

		/** 테이블 구성 */
		JTable table = new JTable(data, header);
		pane.setViewportView(table);
	}

	public JScrollPane getTablePanel() {
		return pane;
	}
}