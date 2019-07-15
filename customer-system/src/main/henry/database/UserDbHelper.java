package main.henry.database;

import java.util.List;

import main.henry.model.User;

/**
 * UserDbHelper
 */
public class UserDbHelper extends Helper<User> {
    @Override
    public List<User> setDb() {
        return LocalStore.UserDB();
    }
}