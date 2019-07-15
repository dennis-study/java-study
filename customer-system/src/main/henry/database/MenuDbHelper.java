package main.henry.database;

import java.util.List;

import main.henry.model.MenuItem;
import main.henry.model.User;

/**
 * MenuDbHelper
 */
public class MenuDbHelper extends Helper<MenuItem> {
    @Override
    public List<MenuItem> setDb() {
        return LocalStore.MenuDB();
    }
}