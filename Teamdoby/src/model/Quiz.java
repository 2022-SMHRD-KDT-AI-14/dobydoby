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

			// 3. SQL문 실행
			String sql = "select qui from quizL where no = ?";
			try {
				psmt.setInt(1, a);
				psmt = conn.prepareStatement(sql);
				rs = psmt.executeQuery();

				System.out.println(rs);

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

		}

		

	public void QuizNormal(int a) {
		
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

		// 3. SQL문 실행
		String sql = "select qui from quizM where no = ?";
		try {
			psmt.setInt(1, a);
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			System.out.println(rs);

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
	

	}

	public void QuizHard(int a) {
		
	

	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
	} catch (ClassNotFoundException e) {
		
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

	// 3. SQL문 실행
	String sql = "select qui from quizH where no = ?";
	try {
		psmt.setInt(1, a);
		psmt = conn.prepareStatement(sql);
		rs = psmt.executeQuery();

		System.out.println(rs);

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
	}
}
