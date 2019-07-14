package src.main.dennis;

public class User {
    private Integer index;

    private String id;

    private Integer age;

    private String gender;

    public User(Integer index, String id, Integer age, String gender) {
        this.index = index;
        this.id = id;
        this.age = age;
        this.gender = gender;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}