import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxGroupTest extends JFrame{
	JLabel			Label;
	CheckboxGroup	Group;
	Checkbox		Box1, Box2, Box3;
	
	//������ ����
	public CheckBoxGroupTest() {
		setTitle("üũ�ڽ� �׷� �׽�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Label = new JLabel("�ϳ��� ���� ���ð���");
		//�׷�ȭ
		Group = new CheckboxGroup();
		Box1 = new Checkbox("JSP", false, Group);
		Box2 = new Checkbox("PHP", false, Group);
		Box3 = new Checkbox("ASP", false, Group);
		
		setLayout(new FlowLayout());
		add(Label); add(Box1); add(Box2); add(Box3);
		
		setSize(350, 200);
		setLocation(500, 250);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CheckBoxGroupTest();

	}

}
