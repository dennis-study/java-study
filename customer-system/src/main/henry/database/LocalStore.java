package main.henry.database;

import java.util.ArrayList;

import main.henry.model.MenuItem;
import main.henry.model.User;

/**
 * LocalStore
 */
public class LocalStore {
    private static ArrayList<User> userList;
    private static ArrayList<MenuItem> menuList;

    LocalStore() {
        if (userList != null) {
            userList = new ArrayList<>();
        }
        if (menuList != null) {
            menuList = new ArrayList<>();
        }
    }

    public static ArrayList<User> UserDB() {
        return userList;
    }

    public static ArrayList<MenuItem> MenuDB() {
        return menuList;
    }

}