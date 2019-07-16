import java.util.ArrayList;

import controller.UserManager;
import model.User;

public class Main {
     
    public static void main(String[] args) {
        UserManager um = new UserManager();
        ArrayList<User> userList = um.getUserList();
        for(User user : userList) {
            System.out.println(user.getName());
            System.out.println(user.getAge());
            System.out.println(user.getSex());
            System.out.println(user.getId());
            
        }
    }


}