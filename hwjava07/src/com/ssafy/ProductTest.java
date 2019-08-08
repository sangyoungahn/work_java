package com.ssafy;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProductMgrImpl mgr = ProductMgrImpl.getInstance();
		
		outer:while(true) {
			showMenu();
			int inputNum = sc.nextInt();
			switch(inputNum) {
			case 0:	//종료
				break outer;
			case 1:	//데이터 저장
				System.out.print("번호를 입력하세요(1번 - Refrgerator / 2번 - TV) : ");
				int kindOfBook = sc.nextInt();
				if(kindOfBook<0 || 2<kindOfBook)
					continue;
				
				System.out.println("num(int타입)");
				int num = sc.nextInt();
				System.out.println("name(String타입)");
				String name = sc.next();
				System.out.println("price(int타입)");
				int price = sc.nextInt();
				System.out.println("stock(int타입)");
				int stock = sc.nextInt();
				
				//Refrigerator
				if(kindOfBook==1) {
					System.out.println("volume(int타입)");
					int volume = sc.nextInt();
					System.out.println("doorColor(String타입)");
					String doorColor = sc.next();
					
					Refrigerator ref = new Refrigerator(num, name, price, stock, volume, doorColor);
					mgr.add(ref);
				}
				
				//TV
				else if(kindOfBook==2) {
					System.out.println("inch(int타입)");
					int inch = sc.nextInt();
					System.out.println("displayType(String타입)");
					String displayType = sc.next();
					
					TV tv = new TV(num, name, price, stock, inch, displayType);
					mgr.add(tv);
				}
				break;

			case 2:	//데이터 전체 검색
				ArrayList<Product> plist = mgr.search();
				for(Product p : plist) {
					System.out.println(p);
				}
				break;
				
			case 3:	//상품번호로 정보 검색
				System.out.print("찾고 싶은 상품번호 입력 : ");
				int searchNum = sc.nextInt();
				System.out.println(mgr.search(searchNum));
				break;
				
			case 4:	//상품명으로 정보 검색
				System.out.print("찾고 싶은 상품명 입력(부분 검색 가능) : ");
				String searchName = sc.next();
				System.out.println(mgr.searchByName(searchName));
				break;
				
			case 5:	//TV만 검색
				System.out.println(mgr.getOnlyTV());
				break;
				
			case 6:	//Refrigerator만 검색
				System.out.println(mgr.getOnlyRefrigerator());
				break;
				
			case 7:	//400L 이상의 Refrigerator 검색
				ArrayList<Product> tempVolum = new ArrayList<>();
				System.out.print("400L 이상의 Refrigerator 검색 : ");
				int searchVolume = 400;
				for(Product p : mgr.searchByVolume(searchVolume)) {
					tempVolum.add(p);
				}
				System.out.println(tempVolum);
				break;
				
			case 8:	//50inch 이상의 TV 검색
				ArrayList<Product> tempInch = new ArrayList<>();
				System.out.print("50inch 이상의 TV 검색 : ");
				int searchInch = 50;
				for(Product p : mgr.searchByInch(searchInch)) {
					tempInch.add(p);
				}
				System.out.println(tempInch);
				break;
				
			case 9:	//상품번호와 가격을 입력 받아 상품 가격을 변경할 수 있는 기능
				System.out.println("상품번호와 가격을 입력 받아 해당 번호의 상품 가격을 변경 ");
				System.out.print("가격을 변경하고 싶은 상품번호  : ");
				int updateNum = sc.nextInt();
				System.out.print("변경하고 싶은 가격  : ");
				int updatePrice = sc.nextInt();
				mgr.updatePrice(updateNum, updatePrice);
				System.out.println("변경이 완료되었습니다.");
				break;
				
			case 10:	//상품번호로 상품을 삭제하는 기능
				System.out.print("삭제하고 싶은 상품번호 : ");
				int deleteNum = sc.nextInt();
				mgr.delete(deleteNum);
				System.out.println("삭제가 완료되었습니다.");
				break;
				
			case 11:	//전체 재고 상품 금액을 구하는 기능
				int sum = mgr.getAllPrice();
				System.out.println("전체 재고 상품 금액 : " + sum);
				break;
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("<<< 냉장고/TV 관리 프로그램 >>>");
		System.out.println("1. 상품정보 저장 기능");
		System.out.println("2. 상품정보 전체 검색 기능");
		System.out.println("3. 상품번호로 상품을 검색하는 기능");
		System.out.println("4. 상품명으로 상품을 검색하는 기능(상품명 부분 검색 가능)");
		System.out.println("5. TV정보만 검색");
		System.out.println("6. Refrigerator만 검색");
		System.out.println("7. 400L 이상의 Refrigerator 검색");
		System.out.println("8. 50inch 이상의 TV 검색");
		System.out.println("9. 상품번호와 가격을 입력 받아 상품 가격을 변경할 수 있는 기능");
		System.out.println("10. 상품번호로 상품을 삭제하는 기능");
		System.out.println("11. 전체 재고 상품 금액을 구하는 기능");
		System.out.println("0. 종료");
		System.out.println("[원하는 번호를 선택하세요]");
	}
}
