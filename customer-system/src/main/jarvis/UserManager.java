package src.main.jarvis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UserManager implements UserManagerInterface{
	private ArrayList<Users> user_list = new ArrayList<Users>();
	
	public UserManager(ArrayList<Users> users){
		this.user_list = users;
	}

	@Override
	public List<Users> findUserById(String userid) {
		// TODO Auto-generated method stub
		return this.user_list.stream().filter( a -> userid.equals(a.getId())).collect(Collectors.toList());
	}

	@Override
	public List<Users> getGenderList(String gender) {
		// TODO Auto-generated method stub
		return this.user_list.stream().filter( a -> gender.equals(a.getGender())).collect(Collectors.toList());
	}
	
	public void manageRun()
	{
		int menucode = 0;
		Scanner sc = new Scanner(System.in);
		
		while(menucode != -1){
			System.out.println("ȸ�� ���� ����");
			System.out.println("0) ���� ���̵� ��ȸ");
			System.out.println("1) ���� ��ȸ");
			System.out.println("2) ����");
			System.out.println("3) ����");
			System.out.println("4) ���");
			
			System.out.println("�޴��� �Է��ϼ���.");
			menucode = sc.nextInt();

			switch(menucode){
				case 0 :
					searchUserId(sc);
					break;
				case 1 :
					searchGender(sc);
					break;
				case 4 :
					break;
				default : menucode = -1;
					break;
			}
			
			if(menucode == -1){
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
		};
	}
	
	private void displayUserInfo(Users u)
	{
		System.out.println(u.getNo() + "|" + u.getId().toString() + "|" + u.getName() + "|" + u.getAge() + "|" + u.getGender());
	}
	
	private void searchUserId(Scanner sc)
	{
		System.out.print("���̵� �Է����ּ���. ");
		String userid = sc.next();
		
		List<Users> found_user = findUserById(userid);

		if(found_user.size() > 0){
			for(Users u : found_user){
				displayUserInfo(u);
			}
		}else{
			System.out.println("�˻��� ���̵� �����ϴ�.");
		}
	}
	
	private void searchGender(Scanner sc)
	{
		System.out.print("�˻��� ������ �Է����ּ���. ");
		String gender = sc.next();
		List<Users> user_list = getGenderList(gender);
		
		for(Users user : user_list){
			displayUserInfo(user);
		}
	}
}
