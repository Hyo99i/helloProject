package com.yedam.operator;

import java.util.Scanner;

public class OperatorEx2 {
	public static void main(String[] args) {

//		firstMethod();
//		secondMethod();
		Scanner scn = new Scanner(System.in);
		System.out.println("첫번째 값을 입력하세요");
		int num1 = scn.nextInt();
		System.out.println("두번째 값을 입력하세요");
		int num2 = scn.nextInt();
		thirdMethod(num1, num2);
		scn.close();
		
	}

	public static void firstMethod() {

		// Scanner 사용해서 입력값을 2개.
		// 3, 4 => 3의 4제곱에 값을 출력.

		Scanner scn = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;
		int result = 1;

		try {
			System.out.println("밑을 입력하세요");
			num1 = scn.nextInt();
			System.out.println("지수를 입력하세요");
			num2 = scn.nextInt();

			for (int i = 0; i < num2; i++) {
				result *= num1;
			}
		} catch (Exception e) {
			System.out.println("숫자가 아닌 값을 입력했습니다");
		}
		System.out.println(result);
		scn.close();

	}

	public static void secondMethod() {

		// Scanner 활용.
		// "I am a boy", 6 => 문장을 입력받은 숫자의 횟수만큼 반복출력.
		
		Scanner scn = new Scanner(System.in);

		String str = "";
		int num = 0;

		System.out.println("문장을 입력하세요");
		str = scn.nextLine();
		System.out.println("숫자를 입력하세요");
		num = scn.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.println(str);
		}
		scn.close();

	}
	
	public static void thirdMethod(int a, int b) {
		
		// 매개로 받은 2개의 수를 더하고 결과를 출력.
		int result = a + b;
		System.out.println("결과값은 :" + result);
		
	}
}
