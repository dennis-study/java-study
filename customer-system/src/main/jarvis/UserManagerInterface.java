package src.main.jarvis;

import java.util.List;

public interface UserManagerInterface {
	List<Users> findUserById(String userid);
	List<Users> getGenderList(String gender);
}