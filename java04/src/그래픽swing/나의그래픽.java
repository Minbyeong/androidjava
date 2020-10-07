package 그래픽swing;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의그래픽 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ctrl + D 한줄삭제
		// ctrl + shift + O 자동import
		// 자바는 부품조립식 코드 => 객체지향형프로그래밍(OOP)
		// new는 복사를 해놓은 것
		JFrame f = new JFrame();
		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "집에 가는게 어때?");
			}
		});
		JButton b2 = new JButton();
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "집에 가도록 하자!");
			}
		});
		JButton b3 = new JButton();
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "빼애애애애애앸");
			}
		});
		// String img = "sky.png"; -> 인식 x
		ImageIcon img = new ImageIcon("wantgohome.png");
		
		b1.setText("나를 눌러요");
		b2.setText("나도 눌러요");
		b3.setIcon(img);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		
		f.setSize(1500,500);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		//setvisible은 항상 맨 아래로 가야함 -> 아래부분이 짤릴 수 있음
		f.setVisible(true);
	}//main

}//class
