package src.main.jarvis;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDAO user_dao = new UserDAO();
		ArrayList<Users> users = user_dao.readJsonData();
		
		UserManager mg = new UserManager(users);
		mg.manageRun();
	}

}
