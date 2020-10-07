package db연결.copy;

import javax.swing.JOptionPane;

public class 회원가입UI2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String id = JOptionPane.showInputDialog("id 입력");
		String pw = JOptionPane.showInputDialog("pw 입력");
		String name = JOptionPane.showInputDialog("name 입력");
		String tel = JOptionPane.showInputDialog("tel 입력");
		
		MemeberVO bag = new MemeberVO(); //가방을 만들
		bag.setId(id); //set메서드를 통해서 가방에 각 값들을 하나씪 넣으세요.
		bag.setPw(pw);
		bag.setName(name);
		bag.setTel(tel);
	
		MemeberDAO dao = new MemeberDAO();
		dao.create(bag);
	}

}
