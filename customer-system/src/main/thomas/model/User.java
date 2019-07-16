package model;

public class User {

    private static int curIdx = 0;
    private int idx;
    private String id;
    private String name;
    private int age;
    private SexType sex;

    public enum SexType {
        MALE, FEMALE, UNDEFINED;
    }

    public User(String id, String name, int age, String sex) {
        this.idx = curIdx++;
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = this.getSexEnumType(sex);
    }

    public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public SexType getSex() {
        return sex;
    }

    public void setSex(SexType sex) {
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getIdx() {
        return idx;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public SexType getSexEnumType(String type) {
        if("male".equals(type)) {
            return SexType.MALE; 
        }else if("female".equals(type)) {
            return SexType.FEMALE;
        }else {
            return SexType.UNDEFINED;
        }
    }

}