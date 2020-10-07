package db연결.copy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BbsDAO {

	public void create(BbsVO vo) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결.");
		
		String url = "jdbc:mysql://localhost:3306/shop";
		String user = "root";
		String password = "";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db연결.");
		
		String sql = "insert into bbs values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, vo.getNo());
		ps.setString(2, vo.getTitle());
		ps.setString(3, vo.getContent());
		ps.setString(4, vo.getWriter());
		System.out.println("3. sql생성.");
		
		ps.executeUpdate();
		System.out.println("4. sql전송.");
	}

	public void read() {

	}

	public void update() {

	}

	public void delete() {

	}
}
