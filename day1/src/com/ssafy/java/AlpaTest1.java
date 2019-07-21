package com.ssafy.java;

public class AlpaTest1 {

	public static void main(String[] args) {
		int alpa = 65;

		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print((char)alpa + " ");
				alpa++;
			}
			System.out.println();
		}
	}

}
