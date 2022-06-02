package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class user_infoDAO {
	
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	int cnt = 0;
	int log = 0;
	
	public int login(user_infoDTO dto) {
		
		conn();
		
		
		try {
			String sql = "select pw from user_info where id = ?";
			String id = dto.getId();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				String result = rs.getString(1);
				if(dto.getPw().equals(result)) {
					log= 1;
				}else {
					log= 2;
				}
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return log;
		
		
		
	}
public String name_select(user_infoDTO dto) {
	String result = null;
		conn();
		
		
		try {
			String sql = "select name from user_info where id = ?and pw=?";
			String id = dto.getId();
			String pw = dto.getPw();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				 result = rs.getString(1);
				
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
		
		
		
	}
	public int insert(user_infoDTO dto) {
		
		conn();
		
		String sql = "insert into user_info values(?, ?, ?)";
		
		String id = dto.getId();
		String pw = dto.getPw();
		String name = dto.getName();
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			
			cnt = psmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("ID가 중복되었습니다.");
		} 
		finally {
			
			try {
				if (psmt != null)
					psmt.close();
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
		}
				
		return cnt;
		
	}

	public void conn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			
			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String db_id = "campus_e_0516_1";
			String db_pw = "smhrd1";
			
			conn = DriverManager.getConnection(url, db_id, db_pw);
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
		}
	}

}
