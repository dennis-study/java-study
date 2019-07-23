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
			System.out.println("회원 정보 관리");
			System.out.println("0) 유저 아이디 조회");
			System.out.println("1) 성별 조회");
			System.out.println("2) 삭제");
			System.out.println("3) 수정");
			System.out.println("4) 등록");
			
			System.out.println("메뉴를 입력하세요.");
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
				System.out.println("종료되었습니다.");
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
		System.out.print("아이디를 입력해주세요. ");
		String userid = sc.next();
		
		List<Users> found_user = findUserById(userid);

		if(found_user.size() > 0){
			for(Users u : found_user){
				displayUserInfo(u);
			}
		}else{
			System.out.println("검색된 아이디가 없습니다.");
		}
	}
	
	private void searchGender(Scanner sc)
	{
		System.out.print("검색할 성별을 입력해주세요. ");
		String gender = sc.next();
		List<Users> user_list = getGenderList(gender);
		
		for(Users user : user_list){
			displayUserInfo(user);
		}
	}
}
