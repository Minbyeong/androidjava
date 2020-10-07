package 순차문;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class 나의윈도우 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//틀역할을 하는 부품이 필요
		JFrame f = new JFrame(); //스윙 JFrame
		f.setSize(500, 500);
		
		JButton btnNewButton = new JButton("나를 눌러요");
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f,"나를 눌렀네");
			}
		});
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		f.setVisible(true);
		
		// 파일 오른쪽 마우스 open with -> window build editor
		
		// 에디터 틀어서 하단에 디자인 탭
	}

}
