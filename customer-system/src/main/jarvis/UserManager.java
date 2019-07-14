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
			System.out.println("ȸ�� ���� ����");
			System.out.println("0) ���� ���̵� ��ȸ");
			System.out.println("1) ���� ��ȸ");
			
			System.out.println("�޴��� �Է��ϼ���.");
			
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
				System.out.println("����Ǿ����ϴ�.");
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
//			System.out.println("ȸ�� ���� ����");
//			System.out.println("0) ��Ϻ���");
//			System.out.println("1) ����ȸ");
//			System.out.println("2) ȸ���߰�");
//			System.out.println("3) ȸ������");
//			System.out.println("4) ȸ�� ���� ����");
//			System.out.println("5) ����");
//			
//			System.out.println("�޴��� �Է��ϼ���.");
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
//				System.out.println("����Ǿ����ϴ�.");
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
//			System.out.println("ȸ�� ����Ʈ ����.");
//		}else{
//			System.out.println("<<ȸ�� ����Ʈ>>");
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
//		System.out.print("ȸ�� �� ���� �޴�. ȸ�� ��ȣ �Է� : ");
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
//		System.out.print("�̸� : ");
//		String name = sc.next();
//		
//		System.out.print("���� : ");
//		int age = sc.nextInt();
//		
//		System.out.print("���� (��/��) : ");
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
//		System.out.println("�߰� �Ǿ����ϴ�.");
//	}
//	
//	private void deleteMember(Scanner sc)
//	{
//		System.out.print("������ ȸ�� ��ȣ�� �Է��ϼ��� : ");
//		int userno = sc.nextInt();
//		members.remove(userno);
//	}
//	
//	private void modifyMemberInfo(Scanner sc)
//	{
//		memberList();
//		
//		System.out.print("������ ȸ�� ��ȣ: ");
//		int userno = sc.nextInt();
//	}
}
