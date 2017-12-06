import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ButtonEventTest extends JFrame {
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
		
		//이벤트 연결 및 핸들러 처리를 한번에 해결하자!!
		Btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Txt.setText(Txt.getText() + "버튼이 눌렸어요" + "\n");				
			}
		});
		
		setSize(300, 300);
		setLocation(500, 200);
		setVisible(true);		
	}

	public static void main(String[] args) {
		new ButtonEventTest();	//객체 생성과 동시에 생성자 호출

	}

}
