package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;



public class Quiz {

	
	Connection conn = null; 
	PreparedStatement psmt = null; 
	ResultSet rs = null;



	public Quiz() {
		// TODO Auto-generated constructor stub
	}



	public void QuizEasy(int a) {

		
		

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
			
			// 3. SQL�� ����
			String sql = "select qui from quizL where num = ? ";
			try {
				psmt = conn.prepareStatement(sql);
				psmt.setInt(1, a);
				
				rs = psmt.executeQuery();
				if(rs.next()) {
					String result = rs.getString(1);
					System.out.println(result);
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

		

	public void QuizNormal(int a) {
		
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

		// 3. SQL�� ����
		String sql = "select qui from quizL where num = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, a);
			rs = psmt.executeQuery();

			if(rs.next()) {
				String result = rs.getString(1);
				System.out.println(result);
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

	public void QuizHard(int a) {
		
	

	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
	} catch (ClassNotFoundException e) {
		
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

	// 3. SQL�� ����
	String sql = "select qui from quizL where num = ?";
	try {
		
		psmt = conn.prepareStatement(sql);
		psmt.setInt(1, a);
		rs = psmt.executeQuery();

		if(rs.next()) {
			String result = rs.getString(1);
			System.out.println(result);
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
