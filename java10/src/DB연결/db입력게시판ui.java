package DB연결;

import javax.swing.JOptionPane;

public class db입력게시판ui {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String title = JOptionPane.showInputDialog("title 입력");
		String content = JOptionPane.showInputDialog("content 입력");
		String writer = JOptionPane.showInputDialog("writer 입력");
		DB처리게시판전담 db = new DB처리게시판전담();
		db.create(title, content, writer);
	}

}
