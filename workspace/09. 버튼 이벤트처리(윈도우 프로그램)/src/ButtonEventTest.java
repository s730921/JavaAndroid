import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;


//�ֻ��� Ŭ���� ����, �̺�Ʈ ó���� ������ Ŭ����
public class ButtonEventTest extends JFrame implements ActionListener {
	//�������� ����
	JButton		Btn;
	JTextArea	Txt;
	
	//������ ����
	public ButtonEventTest() {
		setTitle("��ư �̺�Ʈ ó��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Btn = new JButton("��ư�� ����");
		Btn.setBackground(Color.YELLOW);
		Txt = new JTextArea();
		Txt.setBackground(Color.lightGray);
		
		setLayout(new BorderLayout());	//���̾ƿ� ������ ����
		add(Btn, BorderLayout.NORTH);
		add(Txt, BorderLayout.CENTER);
		
		//�̺�Ʈ ����
		Btn.addActionListener(this);
		setSize(300, 300);
		setLocation(500, 200);
		setVisible(true);		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Txt.setText(Txt.getText() + "��ư�� ���Ⱦ��" + "\n");
		
	}
	
	public static void main(String[] args) {
		new ButtonEventTest();	//��ü ������ ���ÿ� ������ ȣ��

	}
}
