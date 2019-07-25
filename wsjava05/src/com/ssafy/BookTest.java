package com.ssafy;

public class BookTest {
	public static void main(String[] args) {
		BookManager mgr = new BookManager();	//기능을 담당하는 모듈 객체 생성
		
		mgr.addBook(new Book(123, "아프니까 청춘이다", "김난도", "문학동네", 24000, "청춘을 위한 책"));
		mgr.addBook(new Book(956, "미움 받을 용기", "이치로", "인플루엔셜", 15000, "가볍게 읽기 좋음"));
		mgr.addBook(new Book(625, "여행의 이유", "김영하", "문학동네", 19000, "여행가기 전 읽기"));
		mgr.addBook(new Magazine(868, "베스트 일레븐", "박문성", "축구협회", 12000, "축구 잡지"));
		mgr.addBook(new Magazine(375, "패션센스", "홍석천", "한빛", 9000, "패션 잡지",2018,2));
		
		Book[] allBook = mgr.getAllBook();
		
		System.out.println("<모든 책 출력>");
		for(Book b : allBook) {		//allBook 안에 있는 Book 객체가 b로 하나씩 들어감
			if(b==null)		break;
			System.out.println(b);
		}
		System.out.println("\n");
		
		System.out.println("<isbn으로 검색한 책 출력>");
		System.out.println(mgr.searchBookByIsbn(868));
		System.out.println("\n");
		
		System.out.println("<title로 검색한 책 출력>");
		System.out.println(mgr.searchBookByTitle("미움 받을 용기"));
		System.out.println("\n");
		
		System.out.println("<Book만 검색하는 기능>");
		Book[] bs1 = mgr.getOnlyBook();
		for(Book b : bs1) {
			if(b==null) break;
			System.out.println(b);
		}
		System.out.println("\n");
		
		System.out.println("<Magazine만 검색하는 기능>");
		Book[] bs2 = mgr.getOnlyMagazine();
		for(Book b : bs2) {
			if(b==null)	break;
			System.out.println(b);
		}
		System.out.println("\n");
		
		System.out.println("<출판사로 검색하는 기능>");
		Book[] bs3 = mgr.searchBookByPublisher("문학동네");
		for(Book b : bs3) {
			if(b==null)	break;
			System.out.println(b);
		}
		System.out.println("\n");
		
		System.out.println("<가격으로 검색하는 기능 - 파라미터로 주어진 가격보다 낮은 도서 정보 검색>");
		Book[] bs4 = mgr.searchBookByPrice(16000);
		for(Book b : bs4) {
			if(b==null)	break;
			System.out.println(b);
		}
		System.out.println("\n");
		
		System.out.print("<저장된 모든 도서의 금액 합계 : ");
		System.out.println(mgr.sumAllBook() + "원>");
		
		System.out.print("<저장된 모든 도서의 금액 평균 : ");
		System.out.println(mgr.avgAllBook() + "원>");
	}

}
