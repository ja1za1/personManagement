package personman.model;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class ReadFromDB {
	
<<<<<<< HEAD
	private static final String IP = "192.168.0.113",
								DATABASEURL = "jdbc:postgresql://"+IP+":5432/peopleManagement",
								DATABASEUSER = "read_only",
								DATABASEPASSWORD = "garlic2468",
								SEARCHLOGINQUERY = "SELECT * FROM login";
=======
	private static final String CLASSNAME = "org.postgresql.Driver",
						 IP = "192.168.0.114",
						 DATABASEURL = "jdbc:postgresql://"+IP+":5432/peopleManagement",
						 DATABASEUSER = "read_only",
						 DATABASEPASSWORD = "garlic2468",
						 SEARCHLOGINQUERY = "SELECT * FROM login";
>>>>>>> 0ecdab9b45cd177b6c9d95523072ae6c389f9510
	
	private static final int NAME = 0,
							 EMAIL = 1,
							 TELEPHONE = 2,
							 CPF = 3,
							 CITY = 4;
<<<<<<< HEAD
						 
=======
							 
>>>>>>> 0ecdab9b45cd177b6c9d95523072ae6c389f9510
							 
	public static List<String> searchUserPassword() {
		List <String> userPassword = new ArrayList<>();
		try {
<<<<<<< HEAD
=======
			Class.forName(CLASSNAME);
>>>>>>> 0ecdab9b45cd177b6c9d95523072ae6c389f9510
			Connection conection = DriverManager.getConnection(DATABASEURL,DATABASEUSER,DATABASEPASSWORD);
			if(conection != null) {
				Statement statement = conection.createStatement();
				ResultSet rs = statement.executeQuery(SEARCHLOGINQUERY); 
				while(rs.next()) {
					userPassword.add(rs.getString(1));
					userPassword.add(rs.getString(2));
				}
			}
		}catch (Exception e) {
<<<<<<< HEAD
			return null;
=======
			System.out.println(e);
>>>>>>> 0ecdab9b45cd177b6c9d95523072ae6c389f9510
		}
		return userPassword;
	}//List<String> searchUserPassword()
	
	public static Person transformPersonData(String[] userData, LocalDate userBirthday) {
		Person person = new Person(userData[NAME],userData[EMAIL],userData[TELEPHONE],userData[CPF],userData[CITY],userBirthday);
		return person;
	}//Person transformPersonData()

}//class ReadFromDB
