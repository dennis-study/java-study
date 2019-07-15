package main.henry.model;

enum Gender {
    UNDEFINED(-1), MAN(0), WOMAN(1);

    int type;

    Gender(int type) {
        this.type = type;
    }
}

/**
 * User
 */
public class User {
    private long no;
    private String name;
    private int age;
    private Gender gender;

    User() {
        gender = Gender.UNDEFINED;
    }

    /**
     * @param no the no to set
     */
    public User setNo(long no) {
        this.no = no;
        return this;
    }

    /**
     * @param name the name to set
     */
    public User setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * @param age the age to set
     */
    public User setAge(int age) {
        this.age = age;
        return this;
    }

    /**
     * @param gender the gender to set
     */
    public User setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    /**
     * @return the no
     */
    public long getNo() {
        return no;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @return the gender
     */
    public Gender getGender() {
        return gender;
    }
}