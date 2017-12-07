import java.awt.Color;
import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class LottoGetNumber extends JFrame implements ActionListener {

	//참조변수 생성
	JTextField	Tf1, Tf2, Tf3, Tf4, Tf5, Tf6;
	JButton		Btn;
	
	//생성자 구현
	public LottoGetNumber() {
		setTitle("행운의 로또번호 발생기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Tf1 = new JTextField(2);
		Tf2 = new JTextField(2);
		Tf3 = new JTextField(2);
		Tf4 = new JTextField(2);
		Tf5 = new JTextField(2);
		Tf6 = new JTextField(2);
		
		Btn = new JButton("Lotto Get");
		Btn.setBackground(Color.YELLOW);
		
		setLayout(new FlowLayout());
		add(Tf1); add(Tf2); add(Tf3); add(Tf4); add(Tf5); add(Tf6); add(Btn);
		
		//이벤트 연결
		Btn.addActionListener(this);
		
		setSize(300, 200);
		setLocation(600, 200);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		List<Integer> list = new ArrayList<Integer>();	//기본이 10개
		
		//1단계
		for(int i = 1; i <= 45; i++) {
			list.add(i);
		}
		
		//2단계 -> 객체를 흔든다
		Collections.shuffle(list);
		
		//3단계
		List<Integer> Sub = list.subList(0, 6);
		
		//4단계 -> 객체 정렬
		Collections.sort(Sub);
		
		//출력
		Tf1.setText(String.valueOf(Sub.get(0)));
		Tf2.setText(String.valueOf(Sub.get(1)));
		Tf3.setText(String.valueOf(Sub.get(2)));
		Tf4.setText(String.valueOf(Sub.get(3)));
		Tf5.setText(String.valueOf(Sub.get(4)));
		Tf6.setText(String.valueOf(Sub.get(5)));		
	}
	
	public static void main(String[] args) {
		new LottoGetNumber();

	}

}
