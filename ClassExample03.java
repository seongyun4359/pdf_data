package package1;
import java.util.Scanner;

public class ClassExample03 {

	public static void main(String[] args) {
		Person[] personList=new Person[10];		
		Scanner input=new Scanner(System.in);
		int cnt=0;
		while(true){
			System.out.print("이름: ");
			String name=input.nextLine();
			System.out.print("전화번호: ");
			String phone=input.nextLine();
			System.out.print("주소: ");
			String addr=input.nextLine();
			
			personList[cnt]=new Person(name, phone, addr);			
			cnt++;
			System.out.println("계속 입력하시겠습니까?(Y/N)");
			String yn=input.nextLine();
			if(!yn.toLowerCase().equals("y")) {
				break;
			}
			if(cnt==10) {
				System.out.println("10명이 모두 저장되어 더이상 입력할 수 없습니다.");
				break;
			}
		}
				
		for(int i=0; i<cnt; i++) {
			System.out.print("이름: ");
			System.out.println(personList[i].getName());
			System.out.print("전화번호: ");
			System.out.println(personList[i].getPhone());
			System.out.print("주소: ");
			System.out.println(personList[i].getAddr());
		}
	}
}
