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
			System.out.println("[�̺�Ʈ] ���ʽ� ���� �ߵ�!!");
			eventresult = 1;
		}else eventresult = 2;
		return eventresult;
	}
	
	public void bonusQuiz() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// 2. DB����

		String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe"; // �ּ�
		String db_id = "campus_e_0516_1"; // id
		String db_pw = "smhrd1"; // pw

		// DB������ ���� ��ü(Ŭ����) => Connection
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
		}catch (SQLException e) {
			e.printStackTrace();
		
			
			// 4. ���� ����
		} 
		
		sql = "select ans from bonusQuiz where num = ?";
			
			try {
				
				psmt = conn.prepareStatement(sql);
				psmt.setInt(1, a);
				rs = psmt.executeQuery();
				if(rs.next()) {
				ans = rs.getString(1);
				}
				
				
		
		} catch (SQLException e) {
			e.printStackTrace();
			
			
			
				
					
			// 4. ���� ����
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
		}
		
}
