package personman.controller;

import java.util.ArrayList;
import java.util.List;

import personman.model.ReadFromDB;

public class DealWithDataReaded {
	
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
	}

}
