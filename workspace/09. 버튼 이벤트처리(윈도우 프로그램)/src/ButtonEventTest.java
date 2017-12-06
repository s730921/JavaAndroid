import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;


//최상위 클래스 역할, 이벤트 처리가 가능한 클래스
public class ButtonEventTest extends JFrame implements ActionListener {
	//참조변수 선언
	JButton		Btn;
	JTextArea	Txt;
	
	//생성자 구현
	public ButtonEventTest() {
		setTitle("버튼 이벤트 처리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Btn = new JButton("버튼을 누름");
		Btn.setBackground(Color.YELLOW);
		Txt = new JTextArea();
		Txt.setBackground(Color.lightGray);
		
		setLayout(new BorderLayout());	//레이아웃 관리자 생성
		add(Btn, BorderLayout.NORTH);
		add(Txt, BorderLayout.CENTER);
		
		//이벤트 연결
		Btn.addActionListener(this);
		setSize(300, 300);
		setLocation(500, 200);
		setVisible(true);		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Txt.setText(Txt.getText() + "버튼이 눌렸어요" + "\n");
		
	}
	
	public static void main(String[] args) {
		new ButtonEventTest();	//객체 생성과 동시에 생성자 호출

	}
}
