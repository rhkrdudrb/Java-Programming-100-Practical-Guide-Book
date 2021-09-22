package ch07.part05.main5.sub4;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TableGroup2<T extends DefaultVo> {

	private JScrollPane pane = new JScrollPane();

	public TableGroup2(Class<T> clazz, T... array) {

		/** 헤더정보와 자료목록정보를 가져와서 테이블에 처리 */
		String[] header = null;
		Object[][] data = new Object[array.length][];

		if(array==null || array.length==0){
			try {
				T t = clazz.newInstance();
				header = t.getHeaderInfo();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}else{

			header = array[0].getHeaderInfo();
			for (int i = 0; i < data.length; i++) {
				T t = array[i];
				data[i] = t.getData();
			}

		}

		/** 테이블 구성 */
		JTable table = new JTable(data, header);
		pane.setViewportView(table);
	}

	public JScrollPane getTablePanel() {
		return pane;
	}
}