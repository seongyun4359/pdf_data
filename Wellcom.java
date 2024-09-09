package package1;

import java.util.Scanner;

public class Wellcom {
	public static String[][] bookList() {
		String[][] mBook=new String[3][7];
		mBook[0][0] = "ISBN1234";
		mBook[0][1] = "쉽게 배우는 JSP 웹프로그래밍";
		mBook[0][2] = "27000";
		mBook[0][3] = "송미영";
		mBook[0][4] = "단계별로 구현하여 배우는 JSP 프로그래밍 ";
		mBook[0][5] = "IT전문서";
		mBook[0][6] = "2018/10/08";

		mBook[1][0] = "ISBN1235";
		mBook[1][1] = "안드로이드 프로그래밍";
		mBook[1][2] = "33000";
		mBook[1][3] = "우재남";
		mBook[1][4] = "실습단계별 명확한 멘토링!";
		mBook[1][5] = "IT전문서";
		mBook[1][6] = "2022/01/22";

		mBook[2][0] = "ISBN1236";
		mBook[2][1] = "스크래치";
		mBook[2][2] = "22000";
		mBook[2][3] = "고광일";
		mBook[2][4] = "컴퓨팅 사고력을 키우는 블록 코딩";
		mBook[2][5] = "컴퓨터 입문";
		mBook[2][6] = "2019/06/10";
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<7; j++) {
				System.out.print(mBook[i][j]+" | ");
			}
			System.out.println("");
		}	
		
		return mBook;
	}
	
	public static void menuIntroduction() {
		System.out.println("*****************************************");
		System.out.println("\tWelcome to Shopping mall");
		System.out.println("\tWelcome to Book Market!");
		System.out.println("*****************************************");
		System.out.println("1. 고객정보확인하기\t\t4. 바구니에 항목추가하기");
		System.out.println("2. 장바구니 상품 목록 보기\t5. 장바구니에 항목 수량 줄이기");
		System.out.println("3. 장바구니 비우기\t\t6. 장바구니의 항목 삭제하기");
		System.out.println("7. 영수증 표시하기\t\t8. 종료");
		System.out.println("*****************************************");		
	}
	
	public static void menuGuestInfo(String name, String phone) {
		System.out.println("현재 고객 정보 :");
		System.out.println("이름:" + name + "   " + "연락처:" + phone);
	}

	public static void menuCartItemList() {
		System.out.println("장바구니 상품 목록 보기");
	}

	public static void menuCartClear() {
		System.out.println("장바구니 비우기");
	}

	public static void menuCartAddItem() {
		System.out.println("바구니에 항목추가하기");
		String[][] mBook=bookList();
		
		while(true) {
			System.out.println("장바구니에 추가할 도서의 ID를 입력하세요");
			Scanner input=new Scanner(System.in);
			String str=input.nextLine();
			
			int search_index=-1;
			
			for(int i=0; i<3;i++) {
				if(str.equals(mBook[i][0])) {
					search_index=i;
					break;
				}
			}
			
			if(search_index==-1) {
				System.out.println("도서의 ID를 확인해 주세요..");
				continue;
			}
			
			System.out.println("장바구니에 추가하겠습니까?(Y|N)");
			String yn=input.nextLine();
			
			if(yn.toLowerCase().equals("y")) {
				System.out.println(mBook[search_index][1]+"가 장바구니에 추가되었습니다.");
			}	
			break;		
		}		
	}

	public static void menuCartRemoveItemCount() {
		System.out.println("장바구니에 항목 수량 줄이기");
	}

	public static void menuCartRemoveItem() {
		System.out.println("장바구니의 항목 삭제하기");
	}

	public static void menuCartBill() {
		System.out.println("영수증 표시하기");
	}

	public static void menuExit() {

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("당신의 이름을 입력하세요 : ");
		String name = input.next();

		System.out.print("연락처를 입력하세요 : ");
		String phone = input.next();
		boolean end_flag = false;

		while (true) {
			menuIntroduction();
			System.out.print("메뉴번호를 선택해 주세요 : ");
			int number = input.nextInt();

			if (number < 1 || number > 8) {
				System.out.println("메뉴번호가 틀렸습니다.다시 선택해 주세요..");
				continue;
			}

			switch (number) {
			case 1:
				menuGuestInfo(name, phone);
				break;
			case 2:
				menuCartItemList();
				break;
			case 3:
				menuCartClear();
				break;
			case 4:
				menuCartAddItem();
				break;
			case 5:
				menuCartRemoveItemCount();
				break;
			case 6:
				menuCartRemoveItem();
				break;
			case 7:
				menuCartBill();
				break;
			case 8:
				end_flag = true;
				break;
			default:
			}

			if (end_flag) {
				break;
			}
		}
		
		System.out.println("Book maket 종료");
	}

}
