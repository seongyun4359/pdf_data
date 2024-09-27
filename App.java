package package1;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		User[] userList=new User[5];
		Scanner input =new Scanner(System.in);
		userList[0]=new User("aa","11");
		userList[1]=new User("bb","22");
		userList[2]=new User("cc","33");
		userList[3]=new User("dd","44");
		userList[4]=new User("ee","55");
		
		while(true){
			boolean end_flag=false;
			
			System.out.println("아이디를 입력하세요");
			String id=input.nextLine();
			System.out.println("패스워드를 입력하세요");
			String pw=input.nextLine();
			boolean flag=false;
			
			for(int i=0; i<userList.length; i++) {
				if(id.equals(userList[i].getId())) {
					flag=true;
					if(pw.equals(userList[i].getPw())){
						System.out.println("로그인성공!!");
						end_flag=true;
					}
					else {
						System.out.println("패스워드 에러!!");
					}
					break;
				}			
			}
			
			if(flag==false) {
				System.out.println("없는 아이디입니다.");
			}
			
			if(end_flag) {
				break;
			}
		}	
	}
}
