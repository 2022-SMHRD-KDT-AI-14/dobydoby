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
	
		return result;
	}

	

public String answer_normal(int a) {
	
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
	String sql = "select ans from quizL where num = ?";
	try {
		psmt = conn.prepareStatement(sql);
		psmt.setInt(1, a);
		rs = psmt.executeQuery();
		if(rs.next()) {
			result = rs.getString(1);	// result �� ���������� �����س��� �׷��� return result ���� null�� ����
//			System.out.println(result);
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
return result;

}
	
public String answer_hard(int a) {
		
	

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
	return result;
}
}
