package ch09.part02.main6.sub2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyView extends JFrame {

	/** textField 전역변수 정의 - 생성자함수와 setText()의 공통사용을 위함 */
	private JTextField textField = new JTextField();

	/** setText() 함수 정의 - 외부에서 textField의 text 속성 값 변경 */
	public void setText(String text) {textField.setText(text);}

	/** MyView 생성자함수 정의 - 화면구성 */
	public MyView() {

		/** 메인화면 화면크기설정 */
		setSize(400, 200); // 메인화면 크기 – 너비 400 픽셀, 높이 200 픽셀

		/** null의 경우 컴포넌트 수동배치 설정 - 크기와 위치를 직접 설정해야 함. */
		setLayout(null);

		/** 텍스트입력 컴포넌트(JTextField) 정의 및 위치, 크기설정 */
		// JTextField textField = new JTextField(); -> 전역변수로 이동
		textField.setLocation(10, 10); // x 위치 : 10 픽셀, y 위치 : 10 픽셀
		textField.setSize(200, 30); // 너비 200 픽셀, 높이 30 픽셀

		/** 버튼 컴포넌트(JButton) 정의 및 위치, 크기설정 */
		JButton btn = new JButton("클릭");
		btn.setLocation(220, 10); // x 위치 : 220 픽셀, y 위치 : 10 픽셀
		btn.setSize(100, 30); // 너비 100 픽셀, 높이 30 픽셀

		/** 텍스트입력 컴포넌트 및 버튼을 메인화면에 추가 */
		add(textField); // 화면에 컴포넌트 추가
		add(btn); // 화면에 컴포넌트 추가

		/** 버튼클릭 이벤트 설정 - ActionEvent 인터페이스 사용 */
		ActionListener action = new ActionListenerImpl(this);
		btn.addActionListener(action);
	}

	/** 메인함수 정의 */
	public static void main(String[] args) {
		MyView myView = new MyView();
		myView.setVisible(true);
	}

}