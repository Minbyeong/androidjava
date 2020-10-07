package 그래픽swing;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class 계산기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 프레임 1
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.CYAN);
		f.getContentPane().setForeground(Color.BLACK);
		// 이미지 1
		ImageIcon img = new ImageIcon("cal.png");
		// 라벨 3
		JLabel l1 = new JLabel();
		JLabel l2 = new JLabel();
		l2.setFont(new Font("굴림", Font.BOLD, 90));
		JLabel l3 = new JLabel();
		l3.setFont(new Font("굴림", Font.BOLD, 90));

		JLabel result = new JLabel();
		result.setFont(new Font("굴림", Font.BOLD, 90));
		// 텍스트 입력 2
		JTextField t1 = new JTextField(40); // 괄호 안에 몇글자를 쓰는지 설정
		JTextField t2 = new JTextField(40);
		// 버튼 1
		JButton b1 = new JButton();
		b1.setForeground(Color.RED);
		b1.setFont(new Font("굴림", Font.BOLD, 50));
		b1.setBackground(Color.WHITE);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// t1과 t2에 입력한 값을 가지고 와야함
				// 가지고 온 값의 데이터 타입은 무조건 string
				String s1 = t1.getText();
				String s2 = t2.getText();
				System.out.println("t1값: " + s1);
				System.out.println("t2값: " + s2);

				// 산술연산을 하려면, 숫자로 변환
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);

				// 숫자로 변환한 값들을 더하자.
				int sum = i1 + i2;

				// 처리한 결과를 사용자에게 보여줌.(출력)
				// result.setText(sum+""); // + ""를 사용해서 결합 -> 스트링으로 취급
				String sum2 = String.valueOf(sum); // int를 스트링으로 바꾸고 다시 집어넣음
				result.setText(sum2);
			}
		});
		b1.setText("+");
		// 레이아웃 1
		FlowLayout flow = new FlowLayout();

		f.setSize(500, 700); // 프레임 사이즈 지정
		f.getContentPane().setLayout(flow); // 레이아웃을 셋팅했음 -> flow한테 맡김

		l1.setIcon(img); // l1에 이미지 끼움
		f.getContentPane().add(l1); // l1 추가
		l2.setText("숫자1"); // 라벨 글자 추가
		f.getContentPane().add(l2);
		f.getContentPane().add(t1);
		l3.setText("숫자2"); // 라벨 글자 추가
		f.getContentPane().add(l3);
		f.getContentPane().add(t2);

		f.getContentPane().add(b1);
		
		JButton b2 = new JButton();
		b2.setText("-");
		b2.setForeground(Color.RED);
		b2.setFont(new Font("굴림", Font.BOLD, 50));
		b2.setBackground(Color.WHITE);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton();
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		b3.setText("*");
		b3.setForeground(Color.RED);
		b3.setFont(new Font("굴림", Font.BOLD, 50));
		b3.setBackground(Color.WHITE);
		f.getContentPane().add(b3);
		
		JButton b4 = new JButton();
		b4.setText("/");
		b4.setForeground(Color.RED);
		b4.setFont(new Font("굴림", Font.BOLD, 50));
		b4.setBackground(Color.WHITE);
		f.getContentPane().add(b4);
		f.getContentPane().add(result);
		

		f.setVisible(true);
	}

}
