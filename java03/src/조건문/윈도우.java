package 조건문;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class 윈도우 {

	public static void main(String[] args) {
		JFrame name = new JFrame();
		name.setSize(500, 500);
		
		JButton btnNewButton = new JButton("수요일");
		name.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		name.setVisible(true);
	}

}
