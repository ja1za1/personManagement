package personman.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import personman.model.Person;
import personman.model.ReadFromDB;

public class DealWithDataReaded {
	
<<<<<<< HEAD
	public static final int INCONSISTENT_DATA = 0,
							SUCCESS = 1,
							DB_CONNECTION_FAILED = -1;
	
	public static int verifyLogin(String user, String password) {
		List <String> userAndPassword = new ArrayList<>();
		userAndPassword = ReadFromDB.searchUserPassword();
		if(userAndPassword != null){
			if(!userAndPassword.isEmpty() ) {
				int indexOfUser = userAndPassword.indexOf(user);
				if(indexOfUser % 2 != 0) {
					return INCONSISTENT_DATA;
				}
				else if(userAndPassword.contains(user) && userAndPassword.get(indexOfUser+1).toString().compareTo(password) == 0) {
					return SUCCESS;
				}
			}
		}
		return DB_CONNECTION_FAILED;
=======
	public static boolean verifyLogin(String user, String password) {
		List <String> userAndPassword = new ArrayList<>();
		userAndPassword = ReadFromDB.searchUserPassword();
		if(!userAndPassword.isEmpty()) {
			int indexOfUser = userAndPassword.indexOf(user);
			if(indexOfUser % 2 != 0) {
				return false;
			}
			else if(userAndPassword.contains(user) && userAndPassword.get(indexOfUser+1).toString().compareTo(password) == 0) {
				return true;
			}
		}
		return false;
>>>>>>> 0ecdab9b45cd177b6c9d95523072ae6c389f9510
	}//boolean verifyLogin()
	
	public static boolean verifyRegistration(String[] userData, LocalDate userBirthday) {
		Person person = ReadFromDB.transformPersonData(userData, userBirthday);
		if(verifyUserDataIsBlank(person) == false){
			return true;
		}
		
		return false;
	}//boolean verifyRegistration()
	
	private static boolean verifyUserDataIsBlank(Person person) {
		if(person.getName().isBlank() || person.getEmail().isBlank() || person.getTelephone().isBlank() || 
		   person.getCpf().isBlank() || person.getCity().isBlank() || person.getBirthday() == null) {
			return true;
		}
		return false;
	}//boolean verifyUserDataIsBlank()

}//class DealWithDataReaded
