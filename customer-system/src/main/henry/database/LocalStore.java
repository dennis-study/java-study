package main.henry.database;

import java.util.ArrayList;
import main.henry.model.User;


/**
 * LocalStore
 */
public class LocalStore {
    public static ArrayList<User> UserList;

    LocalStore() {
        if(UserList != null) {
            UserList = new ArrayList<>();
        }
    }
}