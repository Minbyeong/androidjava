package db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//CRUD중심으로 기능을 정의
//데이터와 관련된 작업(data access object: DAO)
public class MemeberDAO {
	// 기능을 정의할 때는 메서드(함수)를 사용
	// create 메서드 호출시 입력값을 받아주는 중간 매개체 역할의 변수
	// => 매개변수(parameter)
	public void create(String id, String pw, String name, String tel) throws Exception {
		// db프로그램 절차에 맞추어서 코딩
		// 1. connector설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공.");

		// 2. db연결
		// String url = "연결하는 방법: //ip:port/db명";
		String url = "jdbc:mysql://localhost:3306/shop";
		String user = "root";
		String password = "";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db연결 성공.");

		// 3. sql문을 만들어서
		// ""안에 ""를 쓰면 안됨, ''을 써야
		String sql = "insert into memeber values(?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3. sql생성 성공.");

		// 4. sql문 전송
		ps.executeUpdate();
		System.out.println("4. sql전송 성공.");
	}

	public void create(MemeberVO vo) throws Exception {
		// 괄호 안 매개변수를 타입에 맞게 바꿔주기 위해 memeberVO 변수 를 넣어준다.

		// db프로그램 절차에 맞추어서 코딩
		// 1. connector설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공.");

		// 2. db연결
		// String url = "연결하는 방법: //ip:port/db명";
		String url = "jdbc:mysql://localhost:3306/shop";
		String user = "root";
		String password = "";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db연결 성공.");

		// 3. sql문을 만들어서
		// ""안에 ""를 쓰면 안됨, ''을 써야
		String sql = "insert into memeber values(?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vo.getId());
		ps.setString(2, vo.getPw());
		ps.setString(3, vo.getName());
		ps.setString(4, vo.getTel());
		System.out.println("3. sql생성 성공.");

		// 4. sql문 전송
		ps.executeUpdate();
		System.out.println("4. sql전송 성공.");
	}

	// id, pw 맞는지 로그인 처
	public boolean read(String id, String pw) throws Exception {
		// db프로그램 절차에 맞추어서 코딩
		// 1. connector설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공.");

		// 2. db연결
		// String url = "연결하는 방법: //ip:port/db명";
		String url = "jdbc:mysql://localhost:3306/shop";
		String user = "root";
		String password = "";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db연결 성공.");

		// 3. sql문을 만들어서
		// ""안에 ""를 쓰면 안됨, ''을 써야
		String sql = "select * from memeber where id = ? and pw = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		System.out.println("3. sql생성 성공.");

		// 4. sql문 전송
		// select의 결과는 검색결과가 담긴 테이블(항목+내용)
		// 내용에는 없을수도 있고, 많을 수도 있
		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql전송 성공.");
		boolean result = false; // 로그인이 not인 상태!
		if (rs.next() == true) {// 결과가 있는지 없는지 체크해주는 메서드
			System.out.println("로그인 ok");
			result = true; // 있음
		} else {
			System.out.println("로그인 not");
		}
		return result;
		// false면 로그인 not.
		// true면 로그인 ok.
	}

	// id중복체
	public int read(String id) throws Exception {
		// db프로그램 절차에 맞추어서 코딩
		// 1. connector설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공.");

		// 2. db연결
		// String url = "연결하는 방법: //ip:port/db명";
		String url = "jdbc:mysql://localhost:3306/shop";
		String user = "root";
		String password = "";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db연결 성공.");

		// 3. sql문을 만들어서
		// ""안에 ""를 쓰면 안됨, ''을 써야
		String sql = "select * from memeber where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. sql생성 성공.");

		// 4. sql문 전송
		// select의 결과는 검색결과가 담긴 테이블(항목+내용)
		// 내용에는 없을수도 있고, 많을 수도 있
		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql전송 성공.");
		int result = 0; // 없음
		if (rs.next() == true) {// 결과가 있는지 없는지 체크해주는 메서드
			// if (rs.next())와 동일함.
			// if문은 rs.next()가 true일 때만 실행되므로!
			System.out.println("검색결과가 있");
			result = 1; // 있음
			String id2 = rs.getString("id");
			String pw = rs.getString("pw");
			String name = rs.getString("name");
			String tel = rs.getString("tel");
			System.out.println("검색결과 id: " + id2);
			System.out.println("검색결과 pw: " + pw);
			System.out.println("검색결과 name: " + name);
			System.out.println("검색결과 tel: " + tel);
		} else {
			System.out.println("검색결과가 없");
		}
		return result;
		// 0이 넘어가면 검색결과 없음.
		// 1이 넘어가면 검색결과 있음.
	}

	// id중복체
	public MemeberVO one(String id) throws Exception {
		// db프로그램 절차에 맞추어서 코딩
		// 1. connector설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공.");

		// 2. db연결
		// String url = "연결하는 방법: //ip:port/db명";
		String url = "jdbc:mysql://localhost:3306/shop";
		String user = "root";
		String password = "";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db연결 성공.");

		// 3. sql문을 만들어서
		// ""안에 ""를 쓰면 안됨, ''을 써야
		String sql = "select * from memeber where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. sql생성 성공.");

		// 4. sql문 전송
		// select의 결과는 검색결과가 담긴 테이블(항목+내용)
		// 내용에는 없을수도 있고, 많을 수도 있
		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql전송 성공.");
		MemeberVO bag = new MemeberVO();
		if (rs.next() == true) {// 결과가 있는지 없는지 체크해주는 메서드
			// if (rs.next())와 동일함.
			// if문은 rs.next()가 true일 때만 실행되므로!
			System.out.println("검색결과가 있");
			String id2 = rs.getString("id");
			String pw = rs.getString("pw");
			String name = rs.getString("name");
			String tel = rs.getString("tel");
			// 가방에 넣기(주소를 전달)
			bag.setId(id2);
			bag.setPw(pw);
			bag.setName(name);
			bag.setTel(tel);

			System.out.println("검색결과 id: " + id2);
			System.out.println("검색결과 pw: " + pw);
			System.out.println("검색결과 name: " + name);
			System.out.println("검색결과 tel: " + tel);
		} else {
			System.out.println("검색결과가 없");
		}
		return bag;
		// bag은 참조형 변수, 주소를 전달.
	}

	public void update(String tel, String id) throws Exception {
		// db프로그램 절차에 맞추어서 코딩
		// 1. connector설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공.");

		// 2. db연결
		// String url = "연결하는 방법: //ip:port/db명";
		String url = "jdbc:mysql://localhost:3306/shop";
		String user = "root";
		String password = "";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db연결 성공.");

		// 3. sql문을 만들어서
		// ""안에 ""를 쓰면 안됨, ''을 써야
		String sql = "update memeber set tel = ? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, tel);
		ps.setString(2, id);
		System.out.println("3. sql생성 성공.");

		// 4. sql문 전송
		ps.executeUpdate();
		System.out.println("4. sql전송 성공.");
	}

	public void delete(String id) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/shop";
		String user = "root";
		String password = "";
		Connection con = DriverManager.getConnection(url, user, password);

		String sql = "delete from memeber where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);

		ps.executeUpdate();
	}
}
