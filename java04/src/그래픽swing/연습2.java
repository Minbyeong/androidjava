package 그래픽swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class 연습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 프레임 1
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.ORANGE);
		// 라벨 이름 1 태어난 년도 1 현재년도1 결과1
		JLabel l1 = new JLabel();
		l1.setFont(new Font("굴림", Font.PLAIN, 20));
		JLabel l2 = new JLabel();
		l2.setFont(new Font("굴림", Font.PLAIN, 20));
		JLabel l3 = new JLabel();
		l3.setFont(new Font("굴림", Font.PLAIN, 20));
		JLabel result = new JLabel();
		result.setFont(new Font("굴림", Font.PLAIN, 20));
		// 텍스트 2
		JTextField t1 = new JTextField(10); // 괄호안에 몇글자를 쓸지 설정
		t1.setFont(new Font("굴림", Font.PLAIN, 30));
		JTextField t2 = new JTextField(10);
		t2.setFont(new Font("굴림", Font.PLAIN, 30));
		JTextField t3 = new JTextField(10);
		t3.setFont(new Font("굴림", Font.PLAIN, 30));
		// 버튼1
		JButton b1 = new JButton();
		b1.setBackground(Color.WHITE);
		b1.setFont(new Font("굴림", Font.PLAIN, 20));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// t1 t2 값을 가져와서
				String s1 = t1.getText();
				String s2 = t2.getText();
				String s3 = t3.getText();
				// t1은 그냥 출력
				// t2의 값은 나이로 변화
				int i2 = Integer.parseInt(s2);
				int i3 = Integer.parseInt(s3);
				int age = (i3 - i2) + 1;
				// t2의 값을 18살과 비교해서
				// 이상이면 성인을 출력	
				if (age >= 18) {
					result.setText(s1+"은 "+age+"살 성인입니다.");
				} else {
					result.setText(s1+"은 "+age+"살 성인이 아닙니다.");
				}
			}
		});

		// 레이아웃
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		f.setSize(300, 500);

		// 화면에 구성
		l1.setText("이름");
		f.getContentPane().add(l1);
		f.getContentPane().add(t1);

		l2.setText("태어난 년도");
		f.getContentPane().add(l2);
		f.getContentPane().add(t2);

		l3.setText("현재 년도");
		f.getContentPane().add(l3);
		f.getContentPane().add(t3);

		b1.setText("출력");
		f.getContentPane().add(b1);
		f.getContentPane().add(result);

		// 화면 보이게
		f.setVisible(true);
	}

}
