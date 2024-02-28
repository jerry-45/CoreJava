import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.CallableStatement;

public class UserManagement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Step 1 - Load the JDBC Driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Step 2 - Establish the connection
		String url = "jdbc:mysql://localhost:3306/feb28";
		String uname = "root";
		String password = "root";
		
		// Step 3 - Connect with database
		Connection conn = DriverManager.getConnection(url, uname, password);
		
		// Step 4 - Inserting record using preparedStatement()
		String insertQuery = "INSERT INTO user(uid, uname, location) VALUES(?, ?, ?);";
//		
//		PreparedStatement ps = conn.prepareStatement(insertQuery);
//		
//		ps.setInt(1, 100);
//		ps.setString(2, "Neeraj");
//		ps.setString(3, "Kharegaon");
//		
//		int i = ps.executeUpdate();
		
		// Callable Statement Example
		CallableStatement cs = (CallableStatement) conn.prepareCall(insertQuery);
		
		cs.setInt(1, 106);
		cs.setString(2, "Anish");
		cs.setString(3, "Kharegaon");
		cs.execute();
		
		System.out.println("Data Inserted Successfully");
	}
}