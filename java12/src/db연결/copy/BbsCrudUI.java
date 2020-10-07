package db연결.copy;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BbsCrudUI {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t4;
	private static JTextField t3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.DARK_GRAY);
		f.setSize(575, 649);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.getContentPane().setLayout(null);
		
		JLabel label_no = new JLabel("No.");
		label_no.setForeground(Color.WHITE);
		label_no.setBackground(Color.WHITE);
		label_no.setFont(new Font("Lucida Grande", Font.PLAIN, 27));
		label_no.setBounds(33, 45, 82, 44);
		f.getContentPane().add(label_no);
		
		JLabel label_title = new JLabel("Title");
		label_title.setForeground(Color.WHITE);
		label_title.setFont(new Font("Lucida Grande", Font.PLAIN, 27));
		label_title.setBackground(Color.WHITE);
		label_title.setBounds(33, 89, 82, 44);
		f.getContentPane().add(label_title);
		
		JLabel label_content = new JLabel("Content");
		label_content.setForeground(Color.WHITE);
		label_content.setFont(new Font("Lucida Grande", Font.PLAIN, 27));
		label_content.setBackground(Color.WHITE);
		label_content.setBounds(33, 134, 105, 44);
		f.getContentPane().add(label_content);
		
		JLabel label_writer = new JLabel("Writer");
		label_writer.setForeground(Color.WHITE);
		label_writer.setFont(new Font("Lucida Grande", Font.PLAIN, 27));
		label_writer.setBackground(Color.WHITE);
		label_writer.setBounds(33, 298, 82, 44);
		f.getContentPane().add(label_writer);
		
		t1 = new JTextField();
		t1.setBounds(182, 60, 130, 26);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(182, 104, 130, 26);
		f.getContentPane().add(t2);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(182, 313, 130, 26);
		f.getContentPane().add(t4);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(182, 149, 319, 132);
		f.getContentPane().add(t3);
		
		JButton create = new JButton("게시글등록");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no = t1.getText();
				String title = t2.getText();
				String content = t3.getText();
				String writer = t4.getText();
				
				BbsDAO dao = new BbsDAO();
				BbsVO bag = new BbsVO();
				bag.setNo(Integer.parseInt(no));
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(writer);
				
				try {
					dao.create(bag);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		create.setForeground(Color.BLACK);
		create.setBackground(Color.ORANGE);
		create.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		create.setBounds(54, 481, 105, 60);
		f.getContentPane().add(create);
		
		JButton read = new JButton("게시글검색");
		read.setForeground(Color.BLACK);
		read.setBackground(Color.ORANGE);
		read.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		read.setBounds(171, 481, 105, 60);
		f.getContentPane().add(read);
		
		JButton update = new JButton("게시글수정");
		update.setForeground(Color.BLACK);
		update.setBackground(Color.ORANGE);
		update.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		update.setBounds(288, 481, 105, 60);
		f.getContentPane().add(update);
		
		JButton delete = new JButton("게시글삭제");
		delete.setForeground(Color.BLACK);
		delete.setBackground(Color.ORANGE);
		delete.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		delete.setBounds(405, 481, 105, 60);
		f.getContentPane().add(delete);
		f.setVisible(true);
	}
}
