package com.ssafy;

public class BookManager {
	Book[] books = new Book[5];	//Book 객체를 저장하기 위한 배열
	int idx = 0;
	
	public void addBook(Book book) {
		books[idx++] = book;
	}
	
	public Book[] getAllBook() {	//Book 객체를 import 안해도 여기서 쓸 수 있는건지???
		//모든 배열 받아옴
		Book[] temp = new Book[5];
		for(int i=0; i<books.length; i++) {
			temp[i] = books[i];
		}
		return temp;
	}
	
	public Book searchBookByIsbn(int isbn) {
		Book book = null;	//리턴타입이 void가 아닐때, 무조건 선언을 해줘야 됨(초기화)
							//초기화를 꼭 해줘야 되는지????
							//temp 배열을 초기화 해주는 것과 마찬가지로 여기서도 Book 객체 하나만 받기 위해 초기화 해주는 것!
		for(Book b : books) {	//books 배열을 돌면서 Book 객체에 값을 넣어줌
			if(b.getIsbn() == isbn) {
				book = b;
				break;
			}
		}
		return book;
	}
	
	public Book searchBookByTitle(String title) {
		Book book = null;
		for(Book b : books) {
			if(b.getTitle().equals(title)) {
				book = b;
				break;
			}
		}
		return book;
	}
	
	public Book[] getOnlyBook() {
		Book[] temp = new Book[5];
		int cnt = 0;
		for(Book b : books) {
			if(b==null)	break;
			else if(b instanceof Book) {
				temp[cnt++] = b;
			}
		}
		return temp;
	}
	
	public Book[] getOnlyMagazine() {	//Magazine을 뽑는건데 왜 Magazine이 아닌 Book객체 배열을 리턴하는건지????
		Book[] temp = new Book[5];
		int cnt = 0;
		for(Book b : books) {
			if(b==null)	break;
			else if(b instanceof Magazine) {
				temp[cnt++] = b;
			}
		}
		return temp;
	}
	
	public Book[] searchBookByPublisher(String publisher) {
		Book[] temp = new Book[5];
		int cnt = 0;
		for(Book b : books) {
			if(b==null)	break;
			else if(b.getPublisher().equals(publisher)) {
				temp[cnt++] = b;
			}
		}
		return temp;
	}
	
	public Book[] searchBookByPrice(int price) {
		Book[] temp = new Book[5];
		int cnt = 0;
		for(Book b : books) {
			if(b==null)	break;
			else if(b.getPrice() < price) {
				temp[cnt++] = b;
			}
		}
		return temp;
	}
	
	public int sumAllBook() {
		int sum = 0;
		for(Book b : books) {
			if(b==null)	break;
			else { sum += b.getPrice(); }
		}
		return sum;
	}
	
	public double avgAllBook() {
		int sum = 0;
		double avg = 0;
		int cnt = 0;
		for(Book b : books) {
			if(b==null)	break;
			else {
				sum += b.getPrice();
				cnt++;
			}
		}
		avg = (double)sum/cnt;
		return avg;
	}
	
}
