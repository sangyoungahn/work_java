package com.ssafy.java;

import java.util.Scanner;

public class GameTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;	//5�� 3��, 3�� 2��, 1�� 1��
		String myScanString;	//�Է¹��� ����������
		int myIntValue = 0;		//�Է¹��� ������������ ���ڷ� �ٲ� ����
		int computerIntValue = 0;		//��ǻ�� ��(����)
		
		System.out.println(">>���������� ������ �����մϴ�. �Ʒ� ���� �� �ϳ��� ��������.");
		System.out.println("5�� 3��");
		System.out.println("3�� 2��");
		System.out.println("1�� 1��");
		System.out.print("��ȣ�� �Է��ϼ���. ");
		num = sc.nextInt();
		
		if(num == 1) {		//5�� 3��
			int myWinCnt = 0;	//���� �̱� Ƚ�� ī��Ʈ
			int comWinCnt = 0;	//��ǻ�Ͱ� �̱� Ƚ�� ī��Ʈ
			
			for(int i = 0; i < 5; i++) {
				System.out.print("���������� �� �ϳ� �Է� : ");
				//���� �� �Է�
				myScanString = sc.next();
				if(myScanString.equals("����"))
					myIntValue = 1;
				else if(myScanString.equals("����"))
					myIntValue = 2;
				else if(myScanString.equals("��"))
					myIntValue = 3;
				
				//��ǻ�� ���� ����
				computerIntValue = (int)(Math.random() * 3) + 1;
				switch(myIntValue) {
				case 1:		//�Է¹��� ���� ������ ��
					if(computerIntValue == 1) {
						System.out.println("�����ϴ�!!!");
					} else if(computerIntValue == 2) {
						System.out.println("�����ϴ�!!!");
						comWinCnt += 1;
					} else if(computerIntValue == 3) {
						System.out.println("�̰���ϴ�!!!");
						myWinCnt += 1;
					}
					break;
					
				case 2:		//�Է¹��� ���� ������ ��
					if(computerIntValue == 1) {
						System.out.println("�̰���ϴ�!!!");
						myWinCnt += 1;
					} else if(computerIntValue == 2) {
						System.out.println("�����ϴ�!!!");
					} else if(computerIntValue == 3) {
						System.out.println("�����ϴ�!!!");
						comWinCnt += 1;
					}
					break;
					
				case 3:		//�Է¹��� ���� ���� ��
					if(computerIntValue == 1) {
						System.out.println("�����ϴ�!!!");
						comWinCnt += 1;
					} else if(computerIntValue == 2) {
						System.out.println("�̰���ϴ�!!!");
						myWinCnt += 1;
					} else if(computerIntValue == 3) {
						System.out.println("�����ϴ�!!!");
					}
					break;
				}
				
				if(myWinCnt == 3 || comWinCnt == 3) {
					if(myWinCnt == 3) {
						System.out.println("###�̰���ϴ�!!!");
						break;
					}
					else if(comWinCnt == 3) {
						System.out.println("###��ǻ�� ��!!!");
						break;
					}
				}
			}
			
			if(myWinCnt > comWinCnt)
				System.out.println("###�̰���ϴ�!!!");
			else if(myWinCnt < comWinCnt)
				System.out.println("###��ǻ�� ��!!!");
			else
				System.out.println("###�����ϴ�!!!");
		}
		
		//3�� 2��
		else if(num == 2) {
			int myWinCnt = 0;	//���� �̱� Ƚ�� ī��Ʈ
			int comWinCnt = 0;	//��ǻ�Ͱ� �̱� Ƚ�� ī��Ʈ
			
			for(int i = 0; i < 3; i++) {
				System.out.print("���������� �� �ϳ� �Է� : ");
				//���� �� �Է�
				myScanString = sc.next();
				if(myScanString.equals("����"))
					myIntValue = 1;
				else if(myScanString.equals("����"))
					myIntValue = 2;
				else if(myScanString.equals("��"))
					myIntValue = 3;
				
				//��ǻ�� ���� ����
				computerIntValue = (int)(Math.random() * 3) + 1;
				switch(myIntValue) {
				case 1:		//�Է¹��� ���� ������ ��
					if(computerIntValue == 1) {
						System.out.println("�����ϴ�!!!");
					} else if(computerIntValue == 2) {
						System.out.println("�����ϴ�!!!");
						comWinCnt += 1;
					} else if(computerIntValue == 3) {
						System.out.println("�̰���ϴ�!!!");
						myWinCnt += 1;
					}
					break;
					
				case 2:		//�Է¹��� ���� ������ ��
					if(computerIntValue == 1) {
						System.out.println("�̰���ϴ�!!!");
						myWinCnt += 1;
					} else if(computerIntValue == 2) {
						System.out.println("�����ϴ�!!!");
					} else if(computerIntValue == 3) {
						System.out.println("�����ϴ�!!!");
						comWinCnt += 1;
					}
					break;
					
				case 3:		//�Է¹��� ���� ���� ��
					if(computerIntValue == 1) {
						System.out.println("�����ϴ�!!!");
						comWinCnt += 1;
					} else if(computerIntValue == 2) {
						System.out.println("�̰���ϴ�!!!");
						myWinCnt += 1;
					} else if(computerIntValue == 3) {
						System.out.println("�����ϴ�!!!");
					}
					break;
				}
				
				if(myWinCnt == 2 || comWinCnt == 2) {
					if(myWinCnt == 2) {
						System.out.println("###�̰���ϴ�!!!");
						break;
					}
					else if(comWinCnt == 2) {
						System.out.println("###��ǻ�� ��!!!");
						break;
					}
				}
			}
			
			if(myWinCnt > comWinCnt)
				System.out.println("###�̰���ϴ�!!!");
			else if(myWinCnt < comWinCnt)
				System.out.println("###��ǻ�� ��!!!");
			else
				System.out.println("###�����ϴ�!!!");
		}
		
		//1�� 1��
		else {		
			int myWinCnt = 0;	//���� �̱� Ƚ�� ī��Ʈ
			int comWinCnt = 0;	//��ǻ�Ͱ� �̱� Ƚ�� ī��Ʈ
			
			for(int i = 0; i < 1; i++) {
				System.out.print("���������� �� �ϳ� �Է� : ");
				//���� �� �Է�
				myScanString = sc.next();
				if(myScanString.equals("����"))
					myIntValue = 1;
				else if(myScanString.equals("����"))
					myIntValue = 2;
				else if(myScanString.equals("��"))
					myIntValue = 3;
				
				//��ǻ�� ���� ����
				computerIntValue = (int)(Math.random() * 3) + 1;
				switch(myIntValue) {
				case 1:		//�Է¹��� ���� ������ ��
					if(computerIntValue == 1) {
						System.out.println("�����ϴ�!!!");
					} else if(computerIntValue == 2) {
						System.out.println("�����ϴ�!!!");
						comWinCnt += 1;
					} else if(computerIntValue == 3) {
						System.out.println("�̰���ϴ�!!!");
						myWinCnt += 1;
					}
					break;
					
				case 2:		//�Է¹��� ���� ������ ��
					if(computerIntValue == 1) {
						System.out.println("�̰���ϴ�!!!");
						myWinCnt += 1;
					} else if(computerIntValue == 2) {
						System.out.println("�����ϴ�!!!");
					} else if(computerIntValue == 3) {
						System.out.println("�����ϴ�!!!");
						comWinCnt += 1;
					}
					break;
					
				case 3:		//�Է¹��� ���� ���� ��
					if(computerIntValue == 1) {
						System.out.println("�����ϴ�!!!");
						comWinCnt += 1;
					} else if(computerIntValue == 2) {
						System.out.println("�̰���ϴ�!!!");
						myWinCnt += 1;
					} else if(computerIntValue == 3) {
						System.out.println("�����ϴ�!!!");
					}
					break;
				}
				
				if(myWinCnt > comWinCnt) {
					System.out.println("###�̰���ϴ�!!!");
					break;
				}
				else if(myWinCnt < comWinCnt) {
					System.out.println("###��ǻ�� ��!!!");
					break;
				}	
				else {
					System.out.println("###�����ϴ�!!!");
					break;
				}
			}
			
		}
	}
	
}

