package com.ssafy;

import java.util.Scanner;

public class MovieMgr {
	Scanner sc = new Scanner(System.in);
	
	Movie[] movies = new Movie[10];
	int index = 0;
	
	public void add(Movie m) {
		movies[index++] = m;
	}
	
	public Movie[] search() {
		return movies;
	}
	
	public Movie[] search(String title) {
		Movie[] temp = new Movie[10];
		int cnt = 0;
		
		for(Movie m : movies) {
			if(m==null) break;
			else if(m.getTitle().equals(title)) {
				temp[cnt++] = m;	//객체에 해당하는 Movie클래스를 넣음
				break;
			}
		}
		return temp;	//배열을 반환
	}
	
	public Movie[] searchDirector(String name) {
		Movie[] temp = new Movie[10];
		int cnt = 0;
		
		for(Movie m : movies) {
			if(m==null) break;
			else if(m.getDirector().equals(name)) {
				temp[cnt++] = m;
				break;
			}
		}
		return temp;
	}
	
	public Movie[] searchGenre(String genre) {
		Movie[] temp = new Movie[10];
		int cnt = 0;
		
		for(Movie m : movies) {
			if(m==null) break;
			else if(m.getGenre().equals(genre)) {
				temp[cnt++] = m;
//				break;
			}
		}
		return temp;
	}
	
	public void delete(String title) {
		for(int i=0; i<index; i++) {		//index값은??
			if(movies[i].getTitle().equals(title)) {
				for(int j=i; j<index-1; j++) {
					movies[j] = movies[j+1];
				}
				index--;
				break;
			}
			
		}
	}
	
	public int getSize() {
//		int cnt=0;
//		
//		for(Movie m : movies) {
//			if(m==null) break;
//			else	cnt++;
//		}
		return index;
	}
}
