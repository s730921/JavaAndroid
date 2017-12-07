import java.awt.Checkbox;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxTest extends JFrame {
	JLabel		Label;
	Checkbox	Box1, Box2, Box3;
	
	//생성자 구현
	public CheckBoxTest() {
		setTitle("체크 박스 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Label = new JLabel("취미 체크");
		Box1 = new Checkbox("등산", false);
		Box2 = new Checkbox("게임", false);
		Box3 = new Checkbox("영화감상", false);
		
		setLayout(new FlowLayout());
		add(Label); add(Box1); add(Box2); add(Box3);
		
		setSize(350, 200);
		setLocation(500, 250);
		setVisible(true);		
	}
		
	public static void main(String[] args) {
		new CheckBoxTest();

	}

}
