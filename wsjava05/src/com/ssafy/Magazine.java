package com.ssafy;

public class Magazine extends Book {
	public static final int M_YEAR = 2019;
	public static final int M_MONTH = 5;
	private int year;
	private int month;

	//년, 월 정보가 없을 때 년, 월을 초기화 하기 위해 호출되는 생성자
	public Magazine(int isbn, String title, String author, String publisher, int price, String desc) {
		this(isbn,title,author,publisher,price,desc,M_YEAR,M_MONTH);	//다른 생성자를 호출
	}

	public Magazine(int isbn, String title, String author, String publisher, int price, String desc, int year, int month) {
		super(isbn, title, author, publisher, price, desc);
		this.year = year;
		this.month = month;
	}

	public Magazine() {	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	@Override
	public String toString() {
		return super.toString() + "Magazine [year=" + year + ", month=" + month + "]";
	}

	
}
