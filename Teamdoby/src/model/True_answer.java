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
	public int answer_number(int a) {
		this.a=a;
		return a;
	}
	
	
	
	public String answer_easy() {

		
		

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
		String sql = "select ans from quizL where no = ?";
		
		try {
			psmt.setInt(1, a);
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
rs2 = rs.getString(1);
			

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
		
		return rs2;
	}

	

public String answer_normal() {
	
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
	String sql = "select ans from quizL where no = ?";
	try {
		psmt.setInt(1, a);
		psmt = conn.prepareStatement(sql);
		rs = psmt.executeQuery();
rs2 = rs.getString(1);

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
return rs2;

}
	
public String answer_hard() {
		
	

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
	String sql = "select ans from quizL where no = ?";
	try {
		psmt.setInt(1, a);
		psmt = conn.prepareStatement(sql);
		rs = psmt.executeQuery();
rs2 = rs.getString(1);

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
	return rs2;
}
}
