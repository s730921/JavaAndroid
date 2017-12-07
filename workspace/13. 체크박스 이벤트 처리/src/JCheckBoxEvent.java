import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JCheckBoxEvent extends JFrame implements ItemListener{
	JLabel		Fruit = new JLabel("사과 1000원, 배 1500원, 체리 3000원");
	JCheckBox	Fruits[] = new JCheckBox[3];
	String 		Names[] = {"사과", "배", "체리"};
	JLabel		SumLabel;
	int Sum = 0;
	
	//생성자 구현
	public JCheckBoxEvent() {
		setTitle("체크박스 이벤트 처리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		add(Fruit);
		
		for(int i = 0; i < Fruits.length; i++) {
			Fruits[i] = new JCheckBox(Names[i]);			
			Fruits[i].setBorderPainted(true);
			Fruits[i].setBackground(Color.YELLOW);
			add(Fruits[i]);
			
			//이벤트 연결
			Fruits[i].addItemListener(this);
		}
		SumLabel = new JLabel("현재 0원 입니다.");
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
		
		if(e.getSource() == Fruits[0]) {	//사과 체크박스 이벤트 발생
			Sum = Sum + (Selected * 1000);
		} else if(e.getSource() == Fruits[1]) {	//배 체크박스 이벤트 발생
			Sum = Sum + (Selected * 1500);
		} else {
			Sum = Sum + (Selected * 3000);
		}
		
		SumLabel.setText("현재" + Sum + "원 입니다.");		
	}
	
	public static void main(String[] args) {
		new JCheckBoxEvent();

	}

}
