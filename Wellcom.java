package package1;

import java.util.Scanner;

public class Wellcom {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.print("당신의 이름을 입력하세요 : ");
		String name= input.next();
		
		System.out.print("연락처를 입력하세요 : ");
		String phone= input.next();
		boolean end_flag=false;
		
		while(true){
			System.out.println("*****************************************");
			System.out.println("\tWelcome to Shopping mall");
			System.out.println("\tWelcome to Book Market!");
			System.out.println("*****************************************");
			System.out.println("1. 고객정보확인하기\t\t4. 바구니에 항목추가하기");
			System.out.println("2. 장바구니 상품 목록 보기\t5. 장바구니에 항목 수량 줄이기");
			System.out.println("3. 장바구니 비우기\t\t6. 장바구니의 항목 삭제하기");
			System.out.println("7. 영수증 표시하기\t\t8. 종료");
			System.out.println("*****************************************");
			
			System.out.print("메뉴번호를 선택해 주세요 : ");
			int number=input.nextInt();
			
			if(number<1 || number>8) {
				System.out.println("메뉴번호가 틀렸습니다.다시 선택해 주세요..");
				continue;
			}
			
			switch(number) {
			case 1:
				System.out.println("현재 고객 정보 :");
				System.out.println("이름:"+name+"   "+"연락처:"+phone);
				break;
			case 2:
				System.out.println("장바구니 상품 목록 보기");
				break;
			case 3:
				System.out.println("장바구니 비우기");
				break;
			case 4:
				System.out.println("바구니에 항목추가하기");
				break;
			case 5:
				System.out.println("장바구니에 항목 수량 줄이기");
				break;
			case 6:
				System.out.println("장바구니의 항목 삭제하기");
				break;
			case 7:
				System.out.println("영수증 표시하기");
				break;
			case 8:
				end_flag=true;
				break;
			default:				
			}
			
			if(end_flag){
				break;
			}			
		}
		
		System.out.println("Book maket 종료");
		
	}

}
