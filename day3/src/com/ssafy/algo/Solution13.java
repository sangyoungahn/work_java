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
			
			if(arr[i+di[k]][j+dj[k]] == 'G')	//주변에 하나라도 G가 있는 경우
				return 0;
		}
		return 1;	//주변이 모두 B인 경우
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();	//테스트케이스
		int N = sc.nextInt();	//배열의 크기
		char[][] arr = new char[N][N];	//2차원 배열
		int max = 0;	//세울 수 있는 가장 높은 층수
		int cnt = 0;



		//테스트케이스만큼 반복
		for(int t=0; t<T; t++) {
			max = 0;

			//2차원 배열 생성
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					arr[i][j] = sc.next().charAt(0);
				}
			}

			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					//G이면 안봄
					if(arr[i][j] == 'G') {
						continue;
					}
					//B이면 본다
					else if(arr[i][j] == 'B') {
						//di, dj를 써서 8방향을 본다
						int temp = checkB(arr, i, j, N);

						//G가 있으면 높이 2층
						if(temp == 0) {
							cnt = 2;
							if(cnt>max) {// max랑 비교해서 max 넣기
								max = cnt;
							}
						}

						//모두 B면
						else {
							//해당위치에 가로(i), 세로(j)의 B의 개수를 셈(중복주의)
							cnt =0;	//cnt - 빌딩의 높이
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

							if(cnt>max) {// max랑 비교해서 max 넣기
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