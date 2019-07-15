package main.henry.database;

import java.util.List;

/**
 * Helper
 */
public abstract class Helper<T> {
    private List<T> db;

    Helper() {
        db = setDb();
    }

    public abstract List<T> setDb();

    protected List<T> getDb() {
        return db;
    }

    public boolean insert(T item) {
        return db.add(item);
    };

    public boolean update(T before, T after) {
        int idx = db.indexOf(before);
        if (idx == -1)
            return false;

        db.add(idx, after);
        return this.delete(before);
    };

    public boolean delete(T item) {
        if (item == null)
            return false;

        return db.remove(item);
    };
}