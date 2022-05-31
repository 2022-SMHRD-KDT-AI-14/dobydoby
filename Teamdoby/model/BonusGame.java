package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

public class BonusGame {
	
	Connection conn = null; 
	PreparedStatement psmt = null; 
	ResultSet rs = null;
	Random r = new Random();
	Scanner sc = new Scanner(System.in);
	String qui = "";
	String ans = "";
	String input = "";
	int eventresult= 0;
	
	public int bonusevent() {
		
		int bonus = r.nextInt(5)+1;
		if(bonus==5) {
			System.out.println("[이벤트] 보너스 게임 발동!!");
			eventresult = 1;
		}else eventresult = 2;
		return eventresult;
	}
	public String bonusAns() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// 2. DB연결

		String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe"; // 주소
		String db_id = "campus_e_0516_1"; // id
		String db_pw = "smhrd1"; // pw

		// DB연결을 위한 객체(클래스) => Connection
		try {
			conn = DriverManager.getConnection(url, db_id, db_pw);

			if (conn != null) {
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String sql = "select ans from bonusQuiz where num = ?";
		
		try {
			int a = r.nextInt(3)+1;
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, a);
			rs = psmt.executeQuery();
			if(rs.next()) {
			ans = rs.getString(1);
			}
			
			
	
	} catch (SQLException e) {
		e.printStackTrace();
		
		
		
			
				
		// 4. 연결 종료
	} finally {
		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
		return ans;
	}
		
		
		

	
	public String bonusQuiz() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// 2. DB연결

		String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe"; // 주소
		String db_id = "campus_e_0516_1"; // id
		String db_pw = "smhrd1"; // pw

		// DB연결을 위한 객체(클래스) => Connection
		try {
			conn = DriverManager.getConnection(url, db_id, db_pw);

			if (conn != null) {
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String sql = "select qui from bonusQuiz where num = ?";
		
		
		int a = r.nextInt(3)+1;
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, a);
			
			rs = psmt.executeQuery();
			if(rs.next()) {
				qui = rs.getString(1);
				System.out.println(qui);
					
			}
			sql = "select ans from bonusQuiz where num = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, a);
			rs = psmt.executeQuery();
			if(rs.next()) {
			ans = rs.getString(1);}
						
		}catch (SQLException e) {
			e.printStackTrace();
	
				
			// 4. 연결 종료
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}return ans;
		}
		
}
