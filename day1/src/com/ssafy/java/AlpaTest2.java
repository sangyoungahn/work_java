package com.ssafy.java;

public class AlpaTest2 {

	public static void main(String[] args) {
		int alpa = 65;

		for(int i = 0; i < 5; i++) {
			for(int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for(int k = 0 ; k <= i ; k++) {
				System.out.print((char)alpa);
				alpa++;
			}
			System.out.println();
		}
	}

}