package com.yedam.operator;

import java.util.Scanner;

public class OperatorEx3 {
	public static void main(String[] args) {

		// 변수 balance 선언.
		// balance가 0 ~ 100,000 범위내에서만 추가, 차감이 되도록.
		// 입력값을 판단 1)balance 값을 추가. 2)balance 값을 빼기. 3)현재 balance 값을 콘솔출력. 4) 종료.

		Scanner scn = new Scanner(System.in);
		int balance = 0;

		while (true) {
			System.out.println("1)추가 2)차감 3)출력 4)종료");
			int menu = scn.nextInt();

			if (menu == 1) {
				System.out.println("추가할 값을 입력하세요.");
				int plus = scn.nextInt();
				if (balance + plus > 100000) {
					System.out.println("100,000 값을 초과할 수 없습니다.");
					System.out.printf("현재 값은 %d 입니다. %d는 추가할 수 없습니다.\n", balance, plus);
				} else {
					balance = balance + plus;
				}
			} else if (menu == 2) {
				System.out.println("차감할 값을 입력하세요.");
				int minus = scn.nextInt();
				if (balance - minus < 0) {
					System.out.println("0미만 값으로 차감할 수 없습니다.");
					System.out.printf("현재 값은 %d 입니다. %d는 차감할 수 없습니다.\n", balance, minus);
				} else {
					balance = balance - minus;
				}
			} else if (menu == 3) {
				System.out.println("현재 값은 " + balance + " 입니다.");
				System.out.printf("현재 값은 %d 입니다.\n", balance);
			} else if (menu == 4) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("메뉴에 없는 값을 선택하였습니다.");
			}
		}
		System.out.println("end of prog");

	}

	public static void method1() {
		// 반복처리. while (condition) {}
		int num1 = 1;

//		while(num1 <= 10) {
//			System.out.println(num1++);
//		}

		boolean isOK = false;
		isOK = true;
		num1 = 1;
		while (isOK) {
			System.out.println(num1++);
			if (num1 >= 10) {
				isOK = false;
			}
		}

		Scanner scn = new Scanner(System.in);
		// quit 구문을 입력하면 반복종료.
		isOK = true;
		while (isOK) {
			System.out.println("문장을 입력하세요.");
			String str = scn.nextLine();

			if (str.equals("quit")) {
//				isOK = false;
				break; // while 탈출.
			}
			System.out.println("입력값은 " + str + "입니다.");

		}

		System.out.println("end of prog.");
		scn.close();
	}

}
