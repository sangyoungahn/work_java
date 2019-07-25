package com.ssafy.algo;

import java.util.Scanner;

public class Solution21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[] result = new int[T];	//result ���� �����ϴ� �迭

		//�׽�Ʈ ���̽���ŭ �ݺ�
		for(int t=0; t<T; t++) {		//�׽�Ʈ���̽�
			int N = sc.nextInt();		//������ �� ���� ����
			int num = sc.nextInt();		//�ұ������� ��
			int[][] pond = new int[N][N];		//������ ũ��
			boolean check = false;	//���������� ������ �ɸ��� ������ 0����ϱ� ���� ����
			System.out.print("#" + (t+1) + " ");

			//�ұ����� ����ŭ �ݺ�
			for(int k=0; k<num; k++) {
				int x = sc.nextInt();	//x
				int y = sc.nextInt();	//y
				int dir = sc.nextInt();	//����

				//�Է� ���� x,y�� �ʱ� ��ġ�� ����
				pond[x][y] = 1;
				
				//�ʱⰪ�� 1�� ������
				if(pond[x][y] == 1) {
					result[t] = num;
				}
				
				//�ʱⰪ�� 1�� �ƴϸ�
				else {
					//dir=1�̸� ���� �迭���� �Ʒ��� �̵�(�迭�� y���� ����������)
					if(dir==1) {
						for(int j=3; j>0; j--) {
							y += j;					//y���� +3,+2,+1�� ���� ����
							if(y >= N)		//������ ������ ������ ���� ����
								break;
							else {						//������ ������ ���� �ʰ� 
								if(pond[x][y] == 1) {	//������ �� �ڸ��� ������ ������
									System.out.println(num);	//�ұ����� ��ȣ ���
									pond[x][y] = 2;
									check = true;	//��ġ�� �ұ����̰� ������ true�� ����
								}
							}
							if(pond[x][y] == 0)	{	//1�ε��� ��� ����� �� �����Ƿ�
								pond[x][y] = 1;		//������ ������ �����ʰ�, ������ ������ �� �ڸ��� 1�� ����
							}
						}
//						result[t] = 0;		//pond[x][y] ���� 1�� �ƴ϶�� ���� �ұ����̰� ������ �� ������ �ִ� �ڸ��� �����ٴ� ��
					}

					//dir=2�̸� ���� �迭���� ���������� �̵�(�迭�� x���� ����������)
					else {
						for(int j=3; j>0; j--) {
							x += j;		//x���� +3,+2,+1�� ���� ����
							if(x >= N)		//������ ������ ������ ���� ����
								break;
							else {					//������ ������ ���� �ʰ� 
								if(pond[x][y] == 1) {	//������ �� �ڸ��� ������ ������
									System.out.println(num);	//�ұ����� ��ȣ ���
									pond[x][y] = 2;
									check = true;	//��ġ�� �ұ����̰� ������ true�� ����
								}
							}
							if(pond[x][y] == 0)	{
								pond[x][y] = 1;		//������ ������ �����ʰ�, ������ ������ �� �ڸ��� 1�� ����
							}
						}
//						result[t] = 0;		//pond[x][y] ���� 1�� �ƴ϶�� ���� �ұ����̰� ������ �� ������ �ִ� �ڸ��� �����ٴ� ��
					}
				}
			}
			
			if(check == false) {
				System.out.println(0);
			}
		}
		
//		for(int t=0; t<T; t++) {
//			System.out.print("#" + t+1);
//			System.out.println(" " + result[t]);
//		}
	}
}