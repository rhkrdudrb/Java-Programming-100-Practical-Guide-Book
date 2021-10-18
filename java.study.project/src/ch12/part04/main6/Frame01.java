package ch12.part04.main6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Frame01 extends JFrame  {

	private JTextField text = new JTextField();
	public String getText() {return text.getText();}
	public void setText(String msg) {text.setText(msg);}
	
	public Frame01() {
		
		/** 화면 기본 구성*/
		setTitle("Frame01");
		setLayout(null);
		setBounds(0,0,300,300);
		
		/**컴포넌트(텍스트) 생성*/
		//JTextField text = new JTextField(); //전연변수로 변경
		
		text.setBounds(10,10,200,30);
		this.add(text);
		
		/** 컴포넌트(버튼) 생성*/
		JButton btn = new JButton("현재시간");
		btn.setBounds(10,10,200,30);
		this.add(btn);
		
		/** 버튼클릭 이벤트 생성*/
		/** 버튼 이벤트 생성 */
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				/** 공유데이터에서 frame02 객체 가져오기 */
				Frame02 bean = DataContainer.getBean("frame02", Frame02.class);
				Calendar calendar = Calendar.getInstance();
				Date time = calendar.getTime();
				bean.setText(time.toString());
			}
		});
	}
}