package 그래픽swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 연습1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//프레임
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.ORANGE);
		//라벨2
		JLabel l1 = new JLabel();
		l1.setFont(new Font("굴림", Font.PLAIN, 20));
		JLabel l2 = new JLabel();
		l2.setFont(new Font("굴림", Font.PLAIN, 20));
		//결과를 받을 라벨 1
		JLabel result = new JLabel();
		result.setBackground(Color.WHITE);
		result.setFont(new Font("굴림", Font.PLAIN, 20));
		
		//텍스트 입력2
		JTextField t1 = new JTextField(10); //괄호 안에 몇글자를 쓸지 설정
		t1.setBackground(Color.PINK);
		t1.setFont(new Font("굴림", Font.PLAIN, 30));
		JTextField t2 = new JTextField(10);
		t2.setBackground(Color.PINK);
		t2.setFont(new Font("굴림", Font.PLAIN, 30));
		//버튼
		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//t1 t2 값을 가져와서
				String s1 = t1.getText();
				String s2 = t2.getText();
				//숫자로 변환하고
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);

				//숫자를 비교
				//처리한 결과를 출력
				if (i1>i2) {
					result.setText(s1);
				} else {
					result.setText(s2);
				}
			}
		});
		b1.setBackground(Color.WHITE);
		b1.setFont(new Font("굴림", Font.PLAIN, 20));
		b1.setText("출력");
		
		//레이아웃
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		f.setSize(300,500);
		
		//화면 구성
		l1.setText("숫자 입력1");
		f.getContentPane().add(l1);
		f.getContentPane().add(t1);

		l2.setText("숫자 입력2");
		f.getContentPane().add(l2);
		f.getContentPane().add(t2);
		
		
		f.getContentPane().add(b1);
		f.getContentPane().add(result);

		
		//화면 보이게
		f.setVisible(true);
		
	}

}
