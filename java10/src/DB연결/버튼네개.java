package DB연결;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// ui, view
public class 버튼네개 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f = new JFrame();
		f.setSize(500, 500);
//		f.getContentPane().setLayout(new FlowLayout());

		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 입력한 값 가지고 와서 db처리 전담 클래스에게
				// db에 저장하려고 데이터를 넘김. control역할
				DB처리전담 db1 = new DB처리전담();
//				db1.create();
			}
		});
		btnNewButton.setBounds(37, 94, 149, 96);
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		btnNewButton.setText("Create");

		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DB처리전담 db2 = new DB처리전담();
				db2.read();
			}
		});
		btnNewButton_1.setBounds(287, 94, 149, 96);
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		btnNewButton_1.setText("Read");

		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DB처리전담 db2 = new DB처리전담();
				db2.update();
			}
		});
		btnNewButton_2.setBounds(37, 281, 149, 96);
		f.getContentPane().add(btnNewButton_2, BorderLayout.WEST);
		btnNewButton_2.setText("Update");

		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DB처리전담 db3 = new DB처리전담();
				db3.delete();
			}
		});
		btnNewButton_3.setBounds(287, 281, 149, 96);
		f.getContentPane().add(btnNewButton_3, BorderLayout.SOUTH);
		btnNewButton_3.setText("Delete");

		f.setVisible(true);
	}

}
