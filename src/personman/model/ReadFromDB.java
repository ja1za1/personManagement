package personman.model;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ReadFromDB {
	
	public static List<String> searchUserPassword() {
		List <String> userPassword = new ArrayList<>();
		try {
			Class.forName("org.postgresql.Driver");
			String ip = "192.168.0.114";
			Connection conection = null;
			conection = DriverManager.getConnection("jdbc:postgresql://"+ip+":5432/peopleManagement","read_only","garlic2468");
			if(conection != null) {
				Statement statement = null;
				ResultSet rs = null;
				String query = "SELECT * from login";
				statement = conection.createStatement();
				rs = statement.executeQuery(query); 
				while(rs.next()) {
					userPassword.add(rs.getString(1));
					userPassword.add(rs.getString(2));
				}
			}
		}catch (Exception e) {
			System.out.println(e);
		}
		
		return userPassword;
	}

}
