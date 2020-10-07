package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//CRUD 중김으로 기능을 정의
//데이터와 관련된 작업(Data Access object: DAO)
public class MemberDAO2 {
	//2. db연결
	//String url = "연결하는 방법://ip:port/db명";
	String url = "jdbc:mysql://localhost:3306/shop";
	String user = "root";
	String password = "1234";
	Connection con;
	//DB프로그램 절차에 맞춰 코딩
	public MemberDAO2() throws Exception {
			//1. connector설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector 연결 성공.!!");
			//2. db연결
			
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 성공.!!");
	// 기능을 정의 할떄는 메서드(함수)를 사용
	// create메서드 호출시 입력값을 받아주는 중간 매개체 역할의 변수
	//public static void main(String[] s) throws ClassNotFoundException, SQLException {
	}
	
	
	//회원가입2
	public boolean create(MemberVO2 vo) throws Exception {
		//3. sql문을 만들다.
		String sql = "insert into member2 values (?, ?, ?, ?, ?, ?)";//값이 없으면 null을 넣어주면됨
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vo.getId());
		ps.setString(2, vo.getFirst_name());
		ps.setString(3, vo.getLast_name());
		ps.setString(4, vo.getEmail());
		ps.setString(5, vo.getGender());
		ps.setString(6, vo.getIp_address());
		System.out.println("3. SQL문 생성 성공.!!");
		//4. sql문은 전송
		int row = ps.executeUpdate();
		System.out.println("4. SQL문 정송 성공.!!");
		boolean result = false;
		if (row==1) {
			result = true;
		}
		ps.close();
		con.close();
		return result;
	}
}