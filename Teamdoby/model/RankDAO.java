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
	int score=0;
	String id=null;
	String name=null;
	
	public void score_save(int score) {
		this.score=score;
	}
	public void id_save(String id) {
		this.id=id;
	}
	public void name_save(String name) {
		this.name=name;
	}
	
	
	public void rank_view() {
		
		conn();
		
		String sql = "select * from ranking order by SCORE desc";
		
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			int i = 1;;
			while(rs.next()) {
				
				String name = rs.getString(1);
				String id = rs.getString(2);
				String score = rs.getString(3);
				System.out.println(i+"\t"+name+"\t"+id+"\t"+score);
				i++;
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
public void rank_save(String name, String id, int score) { //rank_save 구현파트. //테스트
		
		conn();
		
		String sql = "insert into ranking values(?,?,?)";
		System.out.println(name);
		System.out.println(id);
		System.out.println(score);
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			psmt.setString(2, id);
			psmt.setInt(3, score);
			int cnt = psmt.executeUpdate();
			
			
						
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
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
		
	
	
		
		
	}
	public void conn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			
			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String db_id = "campus_e_0516_1";
			String db_pw = "smhrd1";
			
			conn = DriverManager.getConnection(url, db_id, db_pw);
			if(conn!=null)
			{
				
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			
		} catch (SQLException e) {
			
		}
	}

	
	
}
