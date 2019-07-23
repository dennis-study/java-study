package src.main.jarvis;

public class Users {
	private int no;
	private String id;
	private String name;
	private int age;
	private String gender;
	
	public Users(){}
	public Users(int no, String userid, String name, int age, String gender) {
		this.no = no;
		this.id = userid;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
