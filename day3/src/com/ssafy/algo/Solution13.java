package com.ssafy.algo;

import java.util.Arrays;
import java.util.Scanner;

public class Solution13 {
	public static int checkB(char[][] arr, int i, int j, int N) {
		int[] di = {-1,-1,0,1,1,1,0,-1};
		int[] dj = {0,1,1,1,0,-1,-1,-1};
		for(int k=0; k<8; k++) {
			if(i+di[k] >= N || i+di[k] < 0 || j+dj[k] >= N || j+dj[k] < 0)
				continue;
			
			if(arr[i+di[k]][j+dj[k]] == 'G')	//�ֺ��� �ϳ��� G�� �ִ� ���
				return 0;
		}
		return 1;	//�ֺ��� ��� B�� ���
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();	//�׽�Ʈ���̽�
		int N = sc.nextInt();	//�迭�� ũ��
		char[][] arr = new char[N][N];	//2���� �迭
		int max = 0;	//���� �� �ִ� ���� ���� ����
		int cnt = 0;



		//�׽�Ʈ���̽���ŭ �ݺ�
		for(int t=0; t<T; t++) {
			max = 0;

			//2���� �迭 ����
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					arr[i][j] = sc.next().charAt(0);
				}
			}

			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					//G�̸� �Ⱥ�
					if(arr[i][j] == 'G') {
						continue;
					}
					//B�̸� ����
					else if(arr[i][j] == 'B') {
						//di, dj�� �Ἥ 8������ ����
						int temp = checkB(arr, i, j, N);

						//G�� ������ ���� 2��
						if(temp == 0) {
							cnt = 2;
							if(cnt>max) {// max�� ���ؼ� max �ֱ�
								max = cnt;
							}
						}

						//��� B��
						else {
							//�ش���ġ�� ����(i), ����(j)�� B�� ������ ��(�ߺ�����)
							cnt =0;	//cnt - ������ ����
							for(int ii=0; ii<N; ii++) {
								if(arr[ii][j] == 'B') {
									cnt++;
								}
							}
							for(int jj=0; jj<N; jj++) {
								if(arr[i][jj] == 'B') {
									cnt++;
								}
							}
							cnt--;

							if(cnt>max) {// max�� ���ؼ� max �ֱ�
								max = cnt;
							}

						}

					}
				}
			}

			System.out.println("#" + t+1 + " " + max);
		}
	}
}