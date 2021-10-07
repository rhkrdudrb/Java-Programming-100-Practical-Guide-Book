package ch09.part02.main1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import ch09.part02.main1.ConfirmUtil.ConfirmWindowWork;

public class TestView extends MainView {
	public TestView() {
		/**버튼 컴포넌트 객체생성 및 크기, 위치지정*/
		JButton btn = new JButton("저장");
		btn.setBounds(10, 10, 100, 30);
		/**버튼 클릭 시 이벤트처리를 위한 객체생성*/
		ButtonAction action = new ButtonAction();
		/**버튼 클릭 이벤트 설정*/
		btn.addActionListener(action);
		/**화면에 버튼 컴포넌트 추가하기*/
		this.add(btn);
	}
	/**ActionListener 인터페이스 - 이벤트 구현을 위한 클래스*/
	public class ButtonAction implements ActionListener {
		/**버튼클릭시 actionPerformed 함수 실행*/
		@Override
		public void actionPerformed(ActionEvent e) {

			/** 모듈 사용 */
			ConfirmUtil.confirmWindow(TestView.this, new ConfirmWindowWork() {
				@Override
				public String yesWork() {
					/** '예' 처리를 위한 로직 구현 (생략) */
					return "";
				}

				@Override
				public String noWork() {
					/** '아니오' 처리를 위한 로직 구현 (생략) */
					return "'아니오'를 선택하였습니다.";
				}
			});
		}
	}
	/**메인함수 실행*/
	public static void main(String[] args) {
		TestView view = new TestView();
		view.setVisible(true);
	}
}