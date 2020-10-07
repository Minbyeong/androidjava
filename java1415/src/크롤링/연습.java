package 크롤링;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 연습 {
	private static JTextField t1;

	public static void main(String[] args) {
		String[] code = { "238090", "293490", "005930", "009830", "047820" };

		JFrame f = new JFrame();
		f.setBackground(Color.CYAN);
		f.getContentPane().setLayout(null);

		JButton b_1 = new JButton("앤디포스");
		b_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText(code[0]);
			}
		});
		b_1.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		b_1.setBounds(86, 17, 320, 71);
		f.getContentPane().add(b_1);

		JButton b_2 = new JButton("카카오게임즈");
		b_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText(code[1]);
			}
		});
		b_2.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		b_2.setBounds(86, 100, 320, 71);
		f.getContentPane().add(b_2);

		JButton b_3 = new JButton("삼성전자");
		b_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText(code[2]);
			}
		});
		b_3.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		b_3.setBounds(86, 183, 320, 71);
		f.getContentPane().add(b_3);

		JButton b_4 = new JButton("한화솔루션");
		b_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText(code[3]);
			}
		});
		b_4.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		b_4.setBounds(86, 266, 320, 71);
		f.getContentPane().add(b_4);

		JButton b_5 = new JButton("초록뱀");
		b_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText(code[4]);
			}
		});
		b_5.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		b_5.setBounds(86, 349, 320, 71);
		f.getContentPane().add(b_5);

		JLabel l_code = new JLabel("code: ");
		l_code.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		l_code.setBounds(32, 432, 118, 53);
		f.getContentPane().add(l_code);

		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		textArea.setBounds(65, 488, 377, 236);
		f.getContentPane().add(textArea);

		t1 = new JTextField();
		t1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		t1.setBounds(145, 441, 178, 35);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		JButton b_crawl = new JButton("크롤링 시작");
		b_crawl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				네이버증권크롤링2 naver = new 네이버증권크롤링2();
				String code = t1.getText();
				String[] result = naver.crawl(code);
				textArea.append("회사이름: " + result[0] + "\n" + "회사코드: " + result[1] + "\n" + "현재가: " + result[2] + "\n"
						+ "어제와의차이: " + result[3] + "\n" + "증감비율: " + result[4] + "\n" + "최고가: " + result[5] + "\n"
						+ "최저가: " + result[6] + "\n");
			}
		});
		b_crawl.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		b_crawl.setBounds(337, 432, 136, 53);
		f.getContentPane().add(b_crawl);
		f.setSize(500, 850);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
}
