package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class True_answer {
	int a ;
	Connection conn = null; 
	PreparedStatement psmt = null; 
	ResultSet rs = null;
	String rs2 = null;
	String result = "";
	public int answer_number(int a) {
		this.a=a;
		return a;
	}
	
	
	public String answer_easy(int a) {
			

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
		String sql = "select ans from quizL where num = ?";
		
		try {
			
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, a);
			rs = psmt.executeQuery();
			if(rs.next()) {
				result = rs.getString(1);
				
			}
			
//			rs2 = rs.getString(1);
			

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
	
		return result;
	}

	

public String answer_normal(int a) {
	
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
	String sql = "select ans from quizL where num = ?";
	try {
		psmt = conn.prepareStatement(sql);
		psmt.setInt(1, a);
		rs = psmt.executeQuery();
		if(rs.next()) {
			result = rs.getString(1);	// result 를 지역변수로 설정해놓음 그래서 return result 값이 null로 나옴
//			System.out.println(result);
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
return result;

}
	
public String answer_hard(int a) {
		
	

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
	String sql = "select ans from quizL where num = ?";
	try {
		psmt = conn.prepareStatement(sql);
		psmt.setInt(1, a);
		rs = psmt.executeQuery();
		if(rs.next()) {
			result = rs.getString(1);
//			System.out.println(result);
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
	return result;
}
}
