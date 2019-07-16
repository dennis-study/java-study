package src.main.jarvis;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import jdk.nashorn.internal.parser.JSONParser;

public class UserManager {
	private ArrayList<Users> users = new ArrayList<Users>();
	
	public UserManager(){}
	
	public void manageRun()
	{		
		do{
			System.out.println("회원 정보 관리");
			System.out.println("0) 유저 아이디 조회");
			System.out.println("1) 성별 조회");
			
			System.out.println("메뉴를 입력하세요.");
			
			Scanner sc = new Scanner(System.in);
			int menucode =sc.nextInt();
			
			switch(menucode){
				case 0 :
					searchUser(sc);
					break;
				case 1 :
					
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
		}while(true);
	}
	
	private void searchUser(Scanner sc)
	{
		String userid = sc.nextLine();
	}
	
	private Users getUserInfo(String userid)
	{
		for(Users user : users){
			if(user.getUserid() == userid){
				return user;
			}
		}
		return null;
	}
	
	private ArrayList<Users> getGender(String gender)
	{
		ArrayList<Users> u = new ArrayList<Users>();
		
		for(Users user : users){
			if(user.getGender() == gender){
				u.add(user);
			}
		}
		
		return u;
	}
	
	
	
//	public void manageRun()
//	{		
//		do{
//			System.out.println("회원 정보 관리");
//			System.out.println("0) 목록보기");
//			System.out.println("1) 상세조회");
//			System.out.println("2) 회원추가");
//			System.out.println("3) 회원삭제");
//			System.out.println("4) 회원 정보 수정");
//			System.out.println("5) 종료");
//			
//			System.out.println("메뉴를 입력하세요.");
//			
//			Scanner sc = new Scanner(System.in);
//			int menucode =sc.nextInt();
//			
//			switch(menucode){
//				case 0 :
//					memberList();
//					break;
//				case 1 :
//					memberInfo(sc);
//					break;
//				case 2 :
//					addMember(sc);
//					break;
//				case 3 :
//					deleteMember(sc);
//					break;
//				case 4 :
//					break;
//				default : menucode = -1;
//					break;
//			}
//			
//			if(menucode == -1){
//				System.out.println("종료되었습니다.");
//				break;
//			}
//		}while(true);
//	}
//	
//	private void memberList()
//	{
//		int length = members.size();
//		
//		if(length == 0){
//			System.out.println("회원 리스트 없음.");
//		}else{
//			System.out.println("<<회원 리스트>>");
//			for(int i=0; i<length; i++){
//				Member mb = members.get(i);
//				System.out.print(mb.getNo() + " | ");
//				System.out.print(mb.getName() + " | ");
//				System.out.print(mb.getAge() + " | ");
//				System.out.print(mb.getGender() + " | ");
//				System.out.println();
//			}
//		}
//	}
//	
//	private void memberInfo(Scanner sc)
//	{
//		System.out.print("회원 상세 정보 메뉴. 회원 번호 입력 : ");
//		int userno = sc.nextInt();
//		
//		Member mb = members.get(userno);
//		System.out.print(mb.getNo() + " | ");
//		System.out.print(mb.getName() + " | ");
//		System.out.print(mb.getAge() + " | ");
//		System.out.print(mb.getGender() + " | ");
//		System.out.println();
//	}
//	
//	private void addMember(Scanner sc)
//	{
//		System.out.print("이름 : ");
//		String name = sc.next();
//		
//		System.out.print("나이 : ");
//		int age = sc.nextInt();
//		
//		System.out.print("성별 (남/여) : ");
//		String gender = sc.next();
//		
//		Member mb = new Member();
//		mb.setNo(members.isEmpty() ? 0 : members.size());
//		mb.setName(name);
//		mb.setAge(age);
//		mb.setGender(gender);
//		
//		members.add(mb);
//		
//		System.out.println("추가 되었습니다.");
//	}
//	
//	private void deleteMember(Scanner sc)
//	{
//		System.out.print("삭제할 회원 번호를 입력하세요 : ");
//		int userno = sc.nextInt();
//		members.remove(userno);
//	}
//	
//	private void modifyMemberInfo(Scanner sc)
//	{
//		memberList();
//		
//		System.out.print("수정할 회원 번호: ");
//		int userno = sc.nextInt();
//	}
}
