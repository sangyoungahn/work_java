package com.ssafy.algo;

import java.util.Arrays;
import java.util.Scanner;

public class DigitTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numArr = new int[100];	//�Է¹޴� ������ �����ϴ� �迭
		int[] tenArr = new int[100];	//�����ڸ� ���� �����ϴ� �迭
		int[] idxArr = new int[10];		//0~9������ ���� �ε����� �����ϴ� �迭
		int cnt = 0;

		//���� �Է¹���
		for(int i=0; i<100; i++) {
			int inputNum = sc.nextInt();
			cnt++;
			if(inputNum == 0) {
				break;
			}
			else
				numArr[i] = inputNum;
		}

		//���� �ڸ� ���� Ƚ���� �迭�� ����
		for(int i=0; i<cnt-1; i++) {	//cnt-1????
			int idx = numArr[i]/10;
			idxArr[idx]++;
		}

		System.out.println(Arrays.toString(idxArr));

		//���� �ڸ� ���ڸ� ���
		for(int i=0; i<idxArr.length; i++) {
			if(idxArr[i] != 0) {
				System.out.println(i + " : " + idxArr[i] + "��");

			}
		}
	}

}
