package ch07.part05.main5.sub5;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import ch07.part05.main5.sub4.DefaultVo;

public class TableGroup<T extends DefaultVo> {

	private JScrollPane pane = new JScrollPane();

	/** 리플렉션으로 객체생성을 위해 Class<T> 타입 파라미터 추가 */
	public TableGroup(Class<T> clazz, T... array) {

		/** null을 고려하여 자료목록정보 구성 */
		Object[][] data = null;
		if (array == null) { // null 일 경우의 처리
			data = new Object[0][];
		} else { // null이 아닐 경우 처리
			data = new Object[array.length][];
			for (int i = 0; i < data.length; i++) {
				T t = array[i];
				data[i] = t.getData();
			}
		}
		/** null과 배열의 길이를 고려하여 헤더정보 구성 */
		String[] header = null;
		if (array == null || array.length == 0) {
			/** 리플렉션을 이용한 클래스 객체생성 */
			try {
				T t = clazz.newInstance();
				header = t.getHeaderInfo();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		} else {
			header = array[0].getHeaderInfo();
		}
		/** 테이블 구성 */
		JTable table = new JTable(data, header);
		pane.setViewportView(table);
	}

	public JScrollPane getTablePanel() {
		return pane;
	}
}