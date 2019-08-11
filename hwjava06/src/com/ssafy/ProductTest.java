package com.ssafy;

import java.util.Scanner;

public class ProductTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProductMgr mgr = ProductMgr.getInstance();
		
		mgr.add(new TV(632,"LG와이드",100,420,52,"LCD"));
		mgr.add(new TV(251,"삼성TV",200,100,24,"OLED"));
		mgr.add(new TV(685,"대우TV",150,200,42,"평면"));
		mgr.add(new Refrigerator(854,"딤채",80,10,500,"블랙"));
		mgr.add(new Refrigerator(125,"시크냉장고",140,300,300,"블루"));
		
		
		outer:while(true) {
			showMenu();
			int inputNum = sc.nextInt();
			switch(inputNum) {
			case 0:	//종료
				break outer;
		
			case 1:	//데이터 전체 검색
				Product[] plist = mgr.search();	//plist에 배열의 주소값이 전달됨
				for(Product p : plist) {
					if(p==null)	break;
					System.out.println(p);
				}
				System.out.println();
				break;
				
			case 2:	//상품번호로 정보 검색
				System.out.print("찾고 싶은 상품번호 입력 : ");
				int searchNum = sc.nextInt();
				System.out.println(mgr.searchByNum(searchNum));
				break;
				
			case 3:	//상품명으로 정보 검색
				System.out.print("찾고 싶은 상품명 입력(부분 검색 가능) : ");
				String searchName = sc.next();
				System.out.println(mgr.searchByName(searchName));
				break;
				
			case 4:	//TV만 검색
				System.out.println(mgr.getOnlyTV());
				break;
				
			case 5:	//Refrigerator만 검색
				System.out.println(mgr.getOnlyRefrigerator());
				break;
				
			case 6:	//상품번호로 상품을 삭제하는 기능
				System.out.print("삭제하고 싶은 상품번호 : ");
				int deleteNum = sc.nextInt();
				mgr.delete(deleteNum);
				System.out.println("삭제가 완료되었습니다.");
				break;
				
			case 7:	//전체 재고 상품 금액을 구하는 기능
				int sum = mgr.getAllPrice();
				System.out.println("전체 재고 상품 금액 : " + sum);
				break;
				
			case 8:	//TV인지 냉장고인지 전달받아 각 항목의 재고금액을 반환하는 기능
				System.out.print("TV와 Refrigerator 둘 중 하나를 입력하세요 : ");
				String priceCategory = sc.next();
				int priceSum = mgr.getItemPrice(priceCategory);
				System.out.println("입력하신 상품 카테고리의 총 가격의 합 : " + priceSum);
				break;
				
			case 9:	//TV인지 냉장고인지 전달받아 각 항목의 재고수량을 반환하는 기능
				System.out.print("TV와 Refrigerator 둘 중 하나를 입력하세요 : ");
				String stockCategory = sc.next();
				int priceStock = mgr.getItemPrice(stockCategory);
				System.out.println("입력하신 상품 카테고리의 총 재고수량의 합 : " + priceStock);
				break;
				
			case 10:	//TV재고의 평균인치를 반환하는 기능
				double avgInch = mgr.getTVInchAvg();
				System.out.println("총 보유 중인 TV의 평균 인치 : " + avgInch);
				break;
				
			case 11:	//냉장고 리터의 합계를 반환하는 기능
				int sumVolume = mgr.getRefriVolumeSum();
				System.out.println("총 보유 중인 냉장고 리터의 합계 : " + sumVolume);
				break;
				
			case 12:	//전달된 상품명을 포함하는 상품 중에서 파라미터로 전달된 금액보다 적은 금액의 상품을 반환하는 기능
				System.out.print("찾고 싶은 상품명 입력 : ");
				String searchByName = sc.next();
				System.out.println();
				System.out.print("기준 가격 입력(해당 상품 중에서 특정 가격보다 낮은 상품을 찾아주는 기능) : ");
				int searchByPrice = sc.nextInt();
				Product[] lowList = mgr.searchLowPriceByName(searchByName, searchByPrice);
				
				for(Product p : lowList) {
					if(p==null)	break;
					System.out.println(p);
				}
				break;
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("<<< 냉장고/TV 관리 프로그램 >>>");
		System.out.println("1. 상품정보 전체 검색 기능");
		System.out.println("2. 상품번호로 상품을 검색하는 기능");
		System.out.println("3. 상품명으로 상품을 검색하는 기능(상품명 부분 검색 가능)");
		System.out.println("4. TV정보만 검색");
		System.out.println("5. Refrigerator만 검색");
		System.out.println("6. 상품번호로 상품을 삭제하는 기능");
		System.out.println("7. 전체 재고 상품 금액을 구하는 기능");
		System.out.println("8. TV인지 냉장고인지 전달받아 각 항목의 재고금액을 반환하는 기능");
		System.out.println("9. TV인지 냉장고인지 전달받아 각 항목의 재고수량을 반환하는 기능");
		System.out.println("10. TV재고의 평균인치를 반환하는 기능");
		System.out.println("11. 냉장고 리터의 합계를 반환하는 기능");
		System.out.println("12. 전달된 상품명을 포함하는 상품 중에서 파라미터로 전달된 금액보다 적은 금액의 상품을 반환하는 기능");
		System.out.println("0. 종료");
		System.out.println("[원하는 번호를 선택하세요]");
	}
}
