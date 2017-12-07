import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JCheckBoxEvent extends JFrame implements ItemListener{
	JLabel		Fruit = new JLabel("��� 1000��, �� 1500��, ü�� 3000��");
	JCheckBox	Fruits[] = new JCheckBox[3];
	String 		Names[] = {"���", "��", "ü��"};
	JLabel		SumLabel;
	int Sum = 0;
	
	//������ ����
	public JCheckBoxEvent() {
		setTitle("üũ�ڽ� �̺�Ʈ ó��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		add(Fruit);
		
		for(int i = 0; i < Fruits.length; i++) {
			Fruits[i] = new JCheckBox(Names[i]);			
			Fruits[i].setBorderPainted(true);
			Fruits[i].setBackground(Color.YELLOW);
			add(Fruits[i]);
			
			//�̺�Ʈ ����
			Fruits[i].addItemListener(this);
		}
		SumLabel = new JLabel("���� 0�� �Դϴ�.");
		add(SumLabel);
		
		setSize(250, 200);
		setLocation(500, 250);
		setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		int Selected = 0;
		
		if(e.getStateChange() == ItemEvent.SELECTED) {
			Selected = 1;
		} else {
			Selected = -1;
		}
		
		if(e.getSource() == Fruits[0]) {	//��� üũ�ڽ� �̺�Ʈ �߻�
			Sum = Sum + (Selected * 1000);
		} else if(e.getSource() == Fruits[1]) {	//�� üũ�ڽ� �̺�Ʈ �߻�
			Sum = Sum + (Selected * 1500);
		} else {
			Sum = Sum + (Selected * 3000);
		}
		
		SumLabel.setText("����" + Sum + "�� �Դϴ�.");		
	}
	
	public static void main(String[] args) {
		new JCheckBoxEvent();

	}

}
