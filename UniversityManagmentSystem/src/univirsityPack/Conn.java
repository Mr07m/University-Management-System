package univirsityPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
	Connection connection;
	Statement statement;
	Conn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "root");
			statement=connection.createStatement();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
