import java.awt.Checkbox;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxTest extends JFrame {
	JLabel		Label;
	Checkbox	Box1, Box2, Box3;
	
	//������ ����
	public CheckBoxTest() {
		setTitle("üũ �ڽ� �׽�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Label = new JLabel("��� üũ");
		Box1 = new Checkbox("���", false);
		Box2 = new Checkbox("����", false);
		Box3 = new Checkbox("��ȭ����", false);
		
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
