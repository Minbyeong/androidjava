package 배열정리;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 영화앨범 {

	static int now = 2; // 현재위치를 체크할 수 있는 변수

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 영화 제목, 이미지, 감독목록, 평점목록
		String[] titles = { "다만 악에서 구하소서", "강철비2:정상회담", "테넷", "극장판 짱구는 못말려:신혼여행 허리케인", "오케이 마담" };
		String[] images = { "daman.png", "iron.png", "tenet.png", "jjang.png", "ok.png" };
		String[] directors = { "홍원찬", "양우석", "크리스토퍼 놀란", "하시모토 마사카즈", "이철하" };
		Double[] rates = { 8.60, 8.02, 8.63, 9.42, 8.12 };

		JFrame f = new JFrame();
		f.setTitle("나의 영화 앨범");
		f.getContentPane().setBackground(Color.ORANGE);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);

		JLabel title = new JLabel(titles[2]);
		title.setFont(new Font("굴림", Font.PLAIN, 60));
		title.setBounds(40, 10, 397, 69);
		f.getContentPane().add(title);

		JLabel img = new JLabel("New label");
		img.setIcon(new ImageIcon(images[2]));
		img.setBounds(40, 80, 199, 288);
		f.getContentPane().add(img);

		JLabel lblNewLabel_2 = new JLabel("감독");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_2.setBounds(263, 94, 46, 41);
		f.getContentPane().add(lblNewLabel_2);

		JLabel director = new JLabel(directors[2]);
		director.setForeground(Color.RED);
		director.setFont(new Font("굴림", Font.PLAIN, 20));
		director.setBounds(263, 144, 152, 44);
		f.getContentPane().add(director);

		JLabel lblNewLabel_2_1 = new JLabel(rates[2] + ""); // 스트링값만 들어갈 수 있어서 +""해서 스트링으로 만들어줌
		lblNewLabel_2_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(263, 227, 46, 41);
		f.getContentPane().add(lblNewLabel_2_1);

		JLabel rate = new JLabel("8.63");
		rate.setForeground(Color.RED);
		rate.setFont(new Font("굴림", Font.PLAIN, 20));
		rate.setBounds(263, 277, 152, 44);
		f.getContentPane().add(rate);

		JButton btnNewButton = new JButton("<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (now == 0) {
					now = 5;
				}
				now--; // 클릭을 했을 때 연산을 해야하는 경우 변수를 main 밖으로 빼고 변수 앞에 static을 붙임
				title.setText(titles[now]);
				ImageIcon icon = new ImageIcon(images[now]);
				img.setIcon(icon);
				director.setText(directors[now]);
				rate.setText(rates[now] + "");
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton.setBounds(0, 378, 182, 83);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton(">");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (now == 4) {
					now = -1;
				}
				now++; // 클릭을 했을 때 연산을 해야하는 경우 변수를 main 밖으로 빼고 변수 앞에 static을 붙임
				title.setText(titles[now]);
				ImageIcon icon = new ImageIcon(images[now]);
				img.setIcon(icon);
				director.setText(directors[now]);
				rate.setText(rates[now] + "");
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton_1.setBounds(302, 378, 182, 83);
		f.getContentPane().add(btnNewButton_1);

		f.setVisible(true);
	}
}
