package DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement; // import java.sql 인지 잘 확인

import javax.swing.JOptionPane;

public class DB처리게시판전담 {
	public void create(String title, String content, String writer) throws Exception {
		System.out.println("DB에 저장 처리 함");
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 설정 성공.!");
		String url = "jdbc:mysql://localhost:3366/shop";
		String user = "root";
		String passward = "1234";
		Connection con = DriverManager.getConnection(url, user, passward);
		System.out.println("2. db연결 성공!");

		String sql = "insert into dbs values (null, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, title);
		ps.setString(2, content);
		ps.setString(3, writer);
		System.out.println("3. sql문 연결 성공!");

		ps.executeUpdate();
		System.out.println("4. sql문을 mysql로 전송 성공!");

	}

	public void read() { // 혼자만 디비에서 가져오는 애
		JOptionPane.showMessageDialog(null, "DB에 검색 처리 함.");
	}

	public void update() {
		JOptionPane.showMessageDialog(null, "DB에 수정 처리 함.");
	}

	public void delete() {
		JOptionPane.showMessageDialog(null, "DB에 삭제 처리 함.");
	}
}
