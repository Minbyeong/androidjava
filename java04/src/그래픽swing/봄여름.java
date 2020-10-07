package 그래픽swing;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 봄여름 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f = new JFrame();
		JButton b1 = new JButton();
		b1.setBounds(135, 43, 212, 182);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "선선해요");
			}
		});
		b1.setForeground(Color.BLUE);
		b1.setBackground(Color.YELLOW);
		b1.setFont(new Font("굴림", Font.PLAIN, 99));
		JButton b2 = new JButton();
		b2.setBounds(72, 248, 336, 168);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "더워요");
			}
		});
		b2.setForeground(Color.GREEN);
		b2.setBackground(Color.PINK);
		b2.setFont(new Font("굴림", Font.PLAIN, 99));
		
		f.setSize(500,500);
		
		b1.setText("봄");
		b2.setText("여름");
		f.getContentPane().setLayout(null);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		
		f.setVisible(true);
		
	}

}
