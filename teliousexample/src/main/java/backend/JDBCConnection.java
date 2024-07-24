package backend;

import java.sql.*;

public class JDBCConnection {

	public Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/items", "root", "");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

}
