package package1;
import java.util.Scanner;

public class ClassExample02 {

	public static void main(String[] args) {
		String[][] person=new String[10][3];
		String[] title= {"이름: ","전화번호: ","주소: "};
		Scanner input=new Scanner(System.in);
		int cnt=0;
		while(true){
			for(int i=0; i<3; i++){
				System.out.print(title[i]);
				person[cnt][i]=input.nextLine();				
			}
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
			for(int j=0; j<3; j++){
				System.out.println(title[j]+person[i][j]);						
			}
		}
	}
}
