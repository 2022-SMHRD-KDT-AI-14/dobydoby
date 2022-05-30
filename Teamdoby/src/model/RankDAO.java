package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RankDAO {
	
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	
	public void rank() {
		
		conn();
		
		String sql = "select * from ranking order by SCORE desc";
		
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			
			while(rs.next()) {
				String name = rs.getString(1);
				String id = rs.getString(2);
				String score = rs.getString(3);
				System.out.println(name+"\t"+id+"\t"+score);
			}
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
		
	
	
		
		
	}
	public void conn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
			
			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String db_id = "campus_e_0516_1";
			String db_pw = "smhrd1";
			
			conn = DriverManager.getConnection(url, db_id, db_pw);
			if(conn!=null)
			{
				System.out.println("DB ���� ����");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("����̹� �ε� ����");
		} catch (SQLException e) {
			System.out.println("DB ���� ����");
		}
	}

	
	
}