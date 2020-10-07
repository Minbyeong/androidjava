package db연결.copy;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 회원CRUDUI {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.ORANGE);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblNewLabel.setBounds(63, 42, 83, 47);
		f.getContentPane().add(lblNewLabel);

		JLabel lblPw = new JLabel("PW");
		lblPw.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblPw.setBounds(63, 89, 83, 47);
		f.getContentPane().add(lblPw);

		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblName.setBounds(63, 136, 89, 47);
		f.getContentPane().add(lblName);

		JLabel lblTel = new JLabel("Tel");
		lblTel.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblTel.setBounds(63, 183, 83, 47);
		f.getContentPane().add(lblTel);

		t1 = new JTextField();
		t1.setBounds(240, 58, 130, 26);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(240, 105, 130, 26);
		f.getContentPane().add(t2);

		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(240, 152, 130, 26);
		f.getContentPane().add(t3);

		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(240, 199, 130, 26);
		f.getContentPane().add(t4);

		JButton create = new JButton("회원가입");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 회원가입할 정보 4개의 입력값을 가지고 와서,
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				// db처리 (memeberDAO), create()메서드 호출
				MemeberDAO dao = new MemeberDAO();
				try {
					dao.create(id, pw, name, tel);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		create.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		create.setBackground(Color.GRAY);
		create.setBounds(52, 330, 89, 57);
		f.getContentPane().add(create);

		JButton read = new JButton("중복체크");
		read.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText(); // id로 검색
				MemeberDAO dao = new MemeberDAO();
				try {
					int result = dao.read(id);
					if (result == 1) { // 검색결과 있음.

					} else {
						t1.setText("없음");
						t2.setText("없음");
						t3.setText("없음");
						t4.setText("없음");
						t1.setBackground(Color.blue);
						t2.setBackground(Color.blue);
						t3.setBackground(Color.blue);
						t4.setBackground(Color.blue);
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		read.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		read.setBackground(Color.GRAY);
		read.setBounds(57, 253, 89, 57);
		f.getContentPane().add(read);

		JButton update = new JButton("회원수정");
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String tel = t4.getText();
				MemeberDAO dao = new MemeberDAO();
				try {
					dao.update(tel, id);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		update.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		update.setBackground(Color.GRAY);
		update.setBounds(254, 330, 89, 57);
		f.getContentPane().add(update);

		JButton delete = new JButton("회원삭제");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				MemeberDAO dao = new MemeberDAO();
				try {
					dao.delete(id);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		delete.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		delete.setBackground(Color.GRAY);
		delete.setBounds(355, 330, 89, 57);
		f.getContentPane().add(delete);

		JLabel Label = new JLabel("New label");
		Label.setBackground(Color.WHITE);
		Label.setBounds(267, 270, 103, 26);
		f.getContentPane().add(Label);

		JButton login = new JButton("로그인");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String pw = t2.getText();
				MemeberDAO dao = new MemeberDAO();
				try {
					boolean result = dao.read(id, pw);
					if (result) {
						Label.setText("로그인 ok");
					} else {
						Label.setText("로그인 not");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		login.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		login.setBackground(Color.GRAY);
		login.setBounds(153, 253, 89, 57);
		f.getContentPane().add(login);

		JButton read_1 = new JButton("회원검색");
		read_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				MemeberDAO dao = new MemeberDAO();
				try {
					MemeberVO bag = dao.one(id);
					t1.setText(bag.getId());
					t2.setText(bag.getPw());
					t3.setText(bag.getName());
					t4.setText(bag.getTel());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		read_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		read_1.setBackground(Color.GRAY);
		read_1.setBounds(153, 330, 89, 57);
		f.getContentPane().add(read_1);

		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
