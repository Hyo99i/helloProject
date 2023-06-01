package com.yedam.reference;

import java.util.Scanner;

public class ReferenceEx6 {
	public static void main(String[] args) {

		int[][] intAry = { 
				new int[] { 80, 90 }, // 홍길동: 영어, 수학
				new int[] { 85, 95 }, // 김길동: 영어, 수학
				new int[] { 70, 80 } // 박길동: 영어, 수학
		};

//		intAry[0] = new int[] { 22, 23 };
		System.out.printf("김길동의 수학점수: %d \n", intAry[1][1]);
		int engSum = 0;
		int mathSum = 0;
		for (int i = 0; i < intAry.length; i++) {
			engSum += intAry[i][0];
		}
		for (int i = 0; i < intAry.length; i++) {
			mathSum += intAry[i][1];
		}
		System.out.printf("영어점수의 합계 %d \n", engSum);
		System.out.printf("수학점수의 합계 %d \n", mathSum);

		int totalSum = 0;
		for (int i = 0; i < intAry.length; i++) {
			for (int j = 0; j < intAry[i].length; j++) {
				totalSum += intAry[i][j];
			}
		}
		System.out.printf("총점수의 합계 %d \n", totalSum);

		String[] nameAry = { "홍길동", "김길동", "박길동" };
		Scanner scn = new Scanner(System.in);
		System.out.println("학생이름을 입력하세요.");
		String searchName = scn.nextLine();

//		switch (searchName) {
//		case "홍길동":
//			System.out.printf("%s의 영어점수는 %d, 수학점수는 %d \n", nameAry[0], intAry[0][0], intAry[0][1]);
//			break;
//		case "김길동":
//			System.out.printf("%s의 영어점수는 %d, 수학점수는 %d \n", nameAry[1], intAry[1][0], intAry[1][1]);
//			break;
//		case "박길동":
//			System.out.printf("%s의 영어점수는 %d, 수학점수는 %d \n", nameAry[2], intAry[2][0], intAry[2][1]);
//			break;
//		default:
//			System.out.println("입력한 학생의 정보가 없습니다.");
//			break;
//		}
		boolean isExist = false;
		for (int i = 0; i < nameAry.length; i++) {
			if (nameAry[i].equals(searchName)) {
				System.out.printf("%s의 영어점수는 %d, 수학점수는 %d \n", nameAry[i], intAry[i][0], intAry[i][1]);
				isExist = true;
			}
		}
		if (isExist == false) {
			System.out.println("입력한 학생의 정보가 없습니다.");
		}
		System.out.println("end of prog.");
		scn.close();

	} // end of main().
}
