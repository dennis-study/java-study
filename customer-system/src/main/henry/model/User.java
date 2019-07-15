package main.henry.model;


enum Gender {
    MAN(0),
    GENDER(1);

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

    /**
     * @param no the no to set
     */
    public void setNo(long no) {
        this.no = no;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    /**
     * @param gender the gender to set
     */
    public void setGender(Gender gender) {
        this.gender = gender;
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