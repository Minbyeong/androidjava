package book;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BookDAO {

	Connection con;
	DBConnectionMgr dbcp;

	public BookDAO() throws Exception {
		dbcp = DBConnectionMgr.getInstance();
	}
	
	public boolean create(BookDTO vo) throws Exception {
		con = dbcp.getConnection();
		String sql = "insert into book_product values (?, ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vo.getId());
		ps.setString(2, vo.getBook_name());
		ps.setString(3, vo.getBook_content());
		ps.setString(4, vo.getPublisher());
		ps.setString(5, vo.getWriter());
		
		int row = ps.executeUpdate();

		boolean result = false;
		if (row == 1) {
			result = true;
		}
		dbcp.freeConnection(con, ps);
		return result;
	}
}
