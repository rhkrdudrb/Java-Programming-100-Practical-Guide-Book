package ch09.part02.main1;

import javax.swing.JComponent;
import javax.swing.JOptionPane;

public class ConfirmUtil {
	public static void confirmWindow(MainView component, ConfirmWindowWork confirm) {

		/** 확인창 : 1('예' 선택), 2('아니오' 선택), 3('취소' 선택) */
		String msg = "자료저장할래요?";
		int showConfirmDialog = JOptionPane.showConfirmDialog(component, msg);
		
		/**'예'선택 시 업무처리*/
		if(showConfirmDialog == 0) {
			JOptionPane.showMessageDialog(component, "예쓰예쓰예쓰!");
		}
	 	/**'아니오'선택 시 업무처리*/
		else if (showConfirmDialog ==1) {
			JOptionPane.showMessageDialog(component, "아니오~~~~~~~~~~!!!!!!!!");
		}
		/**'취소'선택 시 업무처리*/
		else {
			JOptionPane.showMessageDialog(component, "취소요");
			
		}
	}
	/**모듈 사용 시 기능목록을 사용자가 정의할 수 있도록 인터페이스 정의*/
	public interface ConfirmWindowWork{
		/**팝업에서 '예'를 클랙할 때 처리하기위한 함수정의*/
		public String yesWork();
		/**팝업에서 '아니오'를 클릭할 때 처리하기 위한 함수정의*/
		public String noWork();
	}
 
}
