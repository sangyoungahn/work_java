package com.ssafy;

import java.util.Arrays;
import java.util.Scanner;

public class MovieTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MovieMgr mgr = new MovieMgr();
		
		String title;   
		String director;
		int grade;      
		String genre;   
		String summary;
		int num;
		
		String searchTitleInput;
		String searchGenreInput;
		String deleteTitleInput;
		Movie[] allMovie = mgr.search();
		
		outer:while(true) {
			showMenu();
			num = sc.nextInt();
			switch(num) {
			case 1:	//영화 정보 입력
				title=sc.next();
				director=sc.next();
				grade=sc.nextInt();
				genre = sc.next();
				summary = sc.next();
				mgr.add(new Movie(title, director, grade, genre, summary));
				System.out.println("\n");
				break;
				
			case 2:	//영화 정보 전체 검색
				allMovie = mgr.search();
				for(int i=0; i<mgr.getSize(); i++) {
					if(allMovie[i]==null) break;
					System.out.println(allMovie[i]);
				}
				System.out.println("\n");
				break;
				
			case 3:	//영화명 검색
				System.out.print("검색하고 싶은 영화명 : ");
				searchTitleInput = sc.next();
				
				Movie[] searchTitleArr = mgr.search(searchTitleInput);	//mgr.search(searchTitle)을 한 결과가 객체 배열로 리턴되므로 임시의 객체 배열로 받아야 함
				for(Movie m : searchTitleArr) {
					if(m==null)	break;
					else	System.out.println(m);
				}ㄴ
				System.out.println("\n");
				break;
				
			case 4:	//영화 장르별 검색
				System.out.print("검색하고 싶은 영화의 장르명 : ");
				searchGenreInput = sc.next();
				Movie[] searchGenreArr = mgr.searchGenre(searchGenreInput);
				for(Movie m : searchGenreArr) {
					if(m==null) break;
					else	System.out.println(m);
				}
				System.out.println("\n");
				break;
				
			case 5:	//영화 정보 삭제
				System.out.print("삭제하고 싶은 영화명 : ");
				deleteTitleInput = sc.next();
				mgr.delete(deleteTitleInput);	//입력받은 제목의 영화가 지워짐(리턴 타입 없음)
//				Movie[] movies = mgr.search();	//모든 영화 객체 받음
//				System.out.println(movies);		//영화 객체 출력
				System.out.println("\n");
				break;
			case 0:	//종료
				break outer;
			}
		}
		
	}
	public static void showMenu() {
		System.out.println("<<< 영화 관리 프로그램 >>>");
		System.out.println("1. 영화 정보 입력");
		System.out.println("2. 영화 정보 전체 검색");
		System.out.println("3. 영화명 검색");
		System.out.println("4. 영화 장르별 검색");
		System.out.println("5. 영화 정보 삭제");
		System.out.println("0. 종료");
		System.out.println("원하는 번호를 선택하세요.");
	}
}
