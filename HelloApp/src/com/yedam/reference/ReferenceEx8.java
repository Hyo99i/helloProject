package com.yedam.reference;

import java.util.Scanner;
import java.util.Arrays;

public class ReferenceEx8 {
	public static void main(String[] args) {
		// 학생수 => 점수 입력. 점수출력, 최고점수, 평균점수.

		Scanner scn = new Scanner(System.in);
		int studentNum = 0; // 학생수 지정.
		int[] scores = null; // scores = new int[3]
		boolean run = true;

		while (run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석(최고,평균) 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택> ");

			int selectNo = Integer.parseInt(scn.nextLine());
			if (selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(scn.nextLine());
				scores = new int[studentNum];

			} else if (selectNo == 2) {
				for (int i = 0; i < studentNum; i++) {
					System.out.printf("scores[%d]>", i);
					scores[i] = Integer.parseInt(scn.nextLine());
				}

			} else if (selectNo == 3) {
				for (int i = 0; i < studentNum; i++) {
					System.out.printf("scores[%d]> %d \n", i, scores[i]);
				}

			} else if (selectNo == 4) {
				Arrays.sort(scores);
				double sum = 0;
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
				}
				System.out.printf("최고 점수: %d \n", scores[scores.length - 1]);
				System.out.printf("평균 점수: %f \n", sum / scores.length);
			} else if (selectNo == 5) {
				run = false;
			}
		}

		System.out.println("end of prog.");
	} // end of main().
}
