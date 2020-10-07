package 배열정리;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 짜짬우 {
	private static JTextField input;

	static int sum = 0;
	static int jjam = 4000;
	static int udon = 4500;
	static int jja = 5000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.ORANGE);
		f.setSize(1100, 800);
		f.getContentPane().setLayout(null);

		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon("D:\\mb\\Dropbox\\workspace\\java09\\jjajang.png"));
		img.setBounds(313, 200, 496, 355);
		f.getContentPane().add(img);

		input = new JTextField();
		input.setBounds(809, 10, 223, 71);
		f.getContentPane().add(input);
		input.setColumns(10);
		
		JLabel output = new JLabel();
		output.setForeground(Color.RED);
		output.setFont(new Font("굴림", Font.BOLD, 50));
		output.setBounds(497, 621, 365, 71);
		f.getContentPane().add(output);
		
		JButton btnNewButton = new JButton("짬뽕");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String x = input.getText();
				int num = Integer.parseInt(x);
				sum = num * jjam;
				output.setText(Integer.toString(sum));
			}
		});
		btnNewButton.setBackground(new Color(255, 140, 0));
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 30));
		btnNewButton.setBounds(12, 10, 131, 71);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("우동");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String x = input.getText();
				int num = Integer.parseInt(x);
				sum = num * udon;
				output.setText(Integer.toString(sum));
			}
		});
		btnNewButton_1.setBackground(new Color(128, 0, 128));
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 30));
		btnNewButton_1.setBounds(205, 10, 131, 71);
		f.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("짜장");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String x = input.getText();
				int num = Integer.parseInt(x);
				sum = num * jja;
				output.setText(Integer.toString(sum));
			}
		});
		btnNewButton_2.setBackground(new Color(64, 224, 208));
		btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 30));
		btnNewButton_2.setBounds(391, 10, 131, 71);
		f.getContentPane().add(btnNewButton_2);

		JLabel lblNewLabel = new JLabel("개수 입력");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(695, 35, 102, 29);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("지불할 총 금액");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 50));
		lblNewLabel_1.setBounds(86, 621, 365, 71);
		f.getContentPane().add(lblNewLabel_1);


		f.setVisible(true);
	}
}
