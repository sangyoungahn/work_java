package com.ssafy.java;

import java.util.Scanner;

public class GameTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;	//5판 3승, 3판 2승, 1판 1승
		String myScanString;	//입력받은 가위바위보
		int myIntValue = 0;		//입력받은 가위바위보를 숫자로 바꾼 변수
		int computerIntValue = 0;		//컴퓨터 값(정수)
		
		System.out.println(">>가위바위보 게임을 시작합니다. 아래 보기 중 하나를 고르세요.");
		System.out.println("5판 3승");
		System.out.println("3판 2승");
		System.out.println("1판 1승");
		System.out.print("번호를 입력하세요. ");
		num = sc.nextInt();
		
		if(num == 1) {		//5판 3승
			int myWinCnt = 0;	//내가 이긴 횟수 카운트
			int comWinCnt = 0;	//컴퓨터가 이긴 횟수 카운트
			
			for(int i = 0; i < 5; i++) {
				System.out.print("가위바위보 중 하나 입력 : ");
				//나의 값 입력
				myScanString = sc.next();
				if(myScanString.equals("가위"))
					myIntValue = 1;
				else if(myScanString.equals("바위"))
					myIntValue = 2;
				else if(myScanString.equals("보"))
					myIntValue = 3;
				
				//컴퓨터 난수 생성
				computerIntValue = (int)(Math.random() * 3) + 1;
				switch(myIntValue) {
				case 1:		//입력받은 값이 가위일 때
					if(computerIntValue == 1) {
						System.out.println("비겼습니다!!!");
					} else if(computerIntValue == 2) {
						System.out.println("졌습니다!!!");
						comWinCnt += 1;
					} else if(computerIntValue == 3) {
						System.out.println("이겼습니다!!!");
						myWinCnt += 1;
					}
					break;
					
				case 2:		//입력받은 값이 바위일 때
					if(computerIntValue == 1) {
						System.out.println("이겼습니다!!!");
						myWinCnt += 1;
					} else if(computerIntValue == 2) {
						System.out.println("비겼습니다!!!");
					} else if(computerIntValue == 3) {
						System.out.println("졌습니다!!!");
						comWinCnt += 1;
					}
					break;
					
				case 3:		//입력받은 값이 보일 때
					if(computerIntValue == 1) {
						System.out.println("졌습니다!!!");
						comWinCnt += 1;
					} else if(computerIntValue == 2) {
						System.out.println("이겼습니다!!!");
						myWinCnt += 1;
					} else if(computerIntValue == 3) {
						System.out.println("비겼습니다!!!");
					}
					break;
				}
				
				if(myWinCnt == 3 || comWinCnt == 3) {
					if(myWinCnt == 3) {
						System.out.println("###이겼습니다!!!");
						break;
					}
					else if(comWinCnt == 3) {
						System.out.println("###컴퓨터 승!!!");
						break;
					}
				}
			}
			
			if(myWinCnt > comWinCnt)
				System.out.println("###이겼습니다!!!");
			else if(myWinCnt < comWinCnt)
				System.out.println("###컴퓨터 승!!!");
			else
				System.out.println("###비겼습니다!!!");
		}
		
		//3판 2승
		else if(num == 2) {
			int myWinCnt = 0;	//내가 이긴 횟수 카운트
			int comWinCnt = 0;	//컴퓨터가 이긴 횟수 카운트
			
			for(int i = 0; i < 3; i++) {
				System.out.print("가위바위보 중 하나 입력 : ");
				//나의 값 입력
				myScanString = sc.next();
				if(myScanString.equals("가위"))
					myIntValue = 1;
				else if(myScanString.equals("바위"))
					myIntValue = 2;
				else if(myScanString.equals("보"))
					myIntValue = 3;
				
				//컴퓨터 난수 생성
				computerIntValue = (int)(Math.random() * 3) + 1;
				switch(myIntValue) {
				case 1:		//입력받은 값이 가위일 때
					if(computerIntValue == 1) {
						System.out.println("비겼습니다!!!");
					} else if(computerIntValue == 2) {
						System.out.println("졌습니다!!!");
						comWinCnt += 1;
					} else if(computerIntValue == 3) {
						System.out.println("이겼습니다!!!");
						myWinCnt += 1;
					}
					break;
					
				case 2:		//입력받은 값이 바위일 때
					if(computerIntValue == 1) {
						System.out.println("이겼습니다!!!");
						myWinCnt += 1;
					} else if(computerIntValue == 2) {
						System.out.println("비겼습니다!!!");
					} else if(computerIntValue == 3) {
						System.out.println("졌습니다!!!");
						comWinCnt += 1;
					}
					break;
					
				case 3:		//입력받은 값이 보일 때
					if(computerIntValue == 1) {
						System.out.println("졌습니다!!!");
						comWinCnt += 1;
					} else if(computerIntValue == 2) {
						System.out.println("이겼습니다!!!");
						myWinCnt += 1;
					} else if(computerIntValue == 3) {
						System.out.println("비겼습니다!!!");
					}
					break;
				}
				
				if(myWinCnt == 2 || comWinCnt == 2) {
					if(myWinCnt == 2) {
						System.out.println("###이겼습니다!!!");
						break;
					}
					else if(comWinCnt == 2) {
						System.out.println("###컴퓨터 승!!!");
						break;
					}
				}
			}
			
			if(myWinCnt > comWinCnt)
				System.out.println("###이겼습니다!!!");
			else if(myWinCnt < comWinCnt)
				System.out.println("###컴퓨터 승!!!");
			else
				System.out.println("###비겼습니다!!!");
		}
		
		//1판 1승
		else {		
			int myWinCnt = 0;	//내가 이긴 횟수 카운트
			int comWinCnt = 0;	//컴퓨터가 이긴 횟수 카운트
			
			for(int i = 0; i < 1; i++) {
				System.out.print("가위바위보 중 하나 입력 : ");
				//나의 값 입력
				myScanString = sc.next();
				if(myScanString.equals("가위"))
					myIntValue = 1;
				else if(myScanString.equals("바위"))
					myIntValue = 2;
				else if(myScanString.equals("보"))
					myIntValue = 3;
				
				//컴퓨터 난수 생성
				computerIntValue = (int)(Math.random() * 3) + 1;
				switch(myIntValue) {
				case 1:		//입력받은 값이 가위일 때
					if(computerIntValue == 1) {
						System.out.println("비겼습니다!!!");
					} else if(computerIntValue == 2) {
						System.out.println("졌습니다!!!");
						comWinCnt += 1;
					} else if(computerIntValue == 3) {
						System.out.println("이겼습니다!!!");
						myWinCnt += 1;
					}
					break;
					
				case 2:		//입력받은 값이 바위일 때
					if(computerIntValue == 1) {
						System.out.println("이겼습니다!!!");
						myWinCnt += 1;
					} else if(computerIntValue == 2) {
						System.out.println("비겼습니다!!!");
					} else if(computerIntValue == 3) {
						System.out.println("졌습니다!!!");
						comWinCnt += 1;
					}
					break;
					
				case 3:		//입력받은 값이 보일 때
					if(computerIntValue == 1) {
						System.out.println("졌습니다!!!");
						comWinCnt += 1;
					} else if(computerIntValue == 2) {
						System.out.println("이겼습니다!!!");
						myWinCnt += 1;
					} else if(computerIntValue == 3) {
						System.out.println("비겼습니다!!!");
					}
					break;
				}
				
				if(myWinCnt > comWinCnt) {
					System.out.println("###이겼습니다!!!");
					break;
				}
				else if(myWinCnt < comWinCnt) {
					System.out.println("###컴퓨터 승!!!");
					break;
				}	
				else {
					System.out.println("###비겼습니다!!!");
					break;
				}
			}
			
		}
	}
	
}


