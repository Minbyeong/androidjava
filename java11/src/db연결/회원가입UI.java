package db연결;

import javax.swing.JOptionPane;

public class 회원가입UI {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String id = JOptionPane.showInputDialog("id 입력");
		String pw = JOptionPane.showInputDialog("pw 입력");
		String name = JOptionPane.showInputDialog("name 입력");
		String tel = JOptionPane.showInputDialog("tel 입력");

		MemeberDAO db = new MemeberDAO();
		db.create(id, pw, name, tel);
	}

}
