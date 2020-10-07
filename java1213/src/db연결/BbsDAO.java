package db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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

	public BbsVO one(int no) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공.!!");

		String url = "jdbc:mysql://localhost:3306/shop";
		String user = "root";
		String password = "";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db연결 성공.!!");

		String sql = "select * from bbs where no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, no);

		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문 전송 성공.!!");
		BbsVO bag = new BbsVO();// 가방만들어서,
		if (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
			System.out.println("검색결과가 있어요.");
			int no2 = rs.getInt("no");
			String title = rs.getString("title");
			String content = rs.getString("content");
			String writer = rs.getString("writer");
			bag.setNo(no2);
			bag.setTitle(title);
			bag.setContent(content);
			bag.setWriter(writer);
			System.out.println("검색결과 ino2: " + no2);
			System.out.println("검색결과 title: " + title);
			System.out.println("검색결과 content: " + content);
			System.out.println("검색결과 writer: " + writer);
		} else {
			System.out.println("검색결과가 없어요.");
		}
		return bag;
	}

	public ArrayList<BbsVO> all() throws Exception {
		// 가방을 넣는 컨테이너 역할을 하게 됨.
		// <>안에는 컨테이너에 무엇을 넣을지 지정.
		ArrayList<BbsVO> list = new ArrayList<BbsVO>();
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공.!!");

		String url = "jdbc:mysql://localhost:3306/shop";
		String user = "root";
		String password = "";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db연결 성공.!!");

		String sql = "select * from bbs";
		PreparedStatement ps = con.prepareStatement(sql);

		ResultSet rs = ps.executeQuery(); // 검색 결과를 받아온다.4
		System.out.println("4. SQL문 전송 성공.!!");
		while (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
			BbsVO bag = new BbsVO();// 가방만들어서, 항목마다 가방을 만들어야해서 while문 안에다가 가방 생성을 넣어줌.
			int no2 = rs.getInt("no");
			String title = rs.getString("title");
			String content = rs.getString("content");
			String writer = rs.getString("writer"); // 데이터를 하나씩 꺼내오는 코드.
			bag.setNo(no2); // 커서(위치알려주는 역할)
			bag.setTitle(title);
			bag.setContent(content);
			bag.setWriter(writer); // 가방에다가 넣어주는 과정.

			// 가방에 넣기.
			list.add(bag);
//			System.out.println("검색결과 ino2: " + no2);
//			System.out.println("검색결과 title: " + title);
//			System.out.println("검색결과 content: " + content);
//			System.out.println("검색결과 writer: " + writer);
		}
		return list;
	}

//	public void read() {
//
//	}

	public void update(BbsVO vo) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결.");

		String url = "jdbc:mysql://localhost:3306/shop";
		String user = "root";
		String password = "";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db연결.");

		String sql = "update bbs set content = ? where no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vo.getContent());
		ps.setInt(2, vo.getNo());
		System.out.println("3. sql생성.");

		ps.executeUpdate();
		System.out.println("4. sql전송.");
	}

	public void delete(BbsVO vo) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결.");

		String url = "jdbc:mysql://localhost:3306/shop";
		String user = "root";
		String password = "";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db연결.");

		String sql = "delete from bbs where no =?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, vo.getNo());
		System.out.println("3. sql생성.");

		ps.executeUpdate();
		System.out.println("4. sql전송.");
	}
}
