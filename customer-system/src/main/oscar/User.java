package src.main.oscar;

public class User {

    private Integer id;
    private String name;
    private Integer age;
    public enum Gender {
        MAIL('M'),
        FEMAIL('F'),
        UNDEFINED('U');
        char type;
        Gender(char type) {
            this.type = type;
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() { return age; }

    public void setAge(Integer age) { this.age = age; }
}
