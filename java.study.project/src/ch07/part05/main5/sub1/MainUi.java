package ch07.part05.main5.sub1;

import javax.swing.JFrame;
public class MainUi extends JFrame { /** 절차1 : JFrame 상속 */
    public MainUi() {
        /** 절차2 : 화면 사이즈를 조정한다. */
        this.setSize(300,300);
    }
    public static void main(String[] args) {
        /** 절차3 : 객체생성  */
        MainUi mainUi = new MainUi();
        /** 절차4 : 화면이 보이지 않도록 기본 설정된 값을 변경  */
        mainUi.setVisible(true);
    }
}