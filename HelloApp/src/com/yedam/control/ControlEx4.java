package com.yedam.control;

public class ControlEx4 {
	public static void main(String[] args) {
		// 1부터 100까지의 수중에서 3의 배수의 합계. method1()
		// Math.random() 의 2번 실행 => 두 수의 합이 5가 되는 경우 반복 중단. method2()
		// 반복문 for를 활용. 피라미드 별찍기. method3()
		method1();
		method2();
		method3();
	}

	public static void method1() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	public static void method2() {
		while (true) {
			int dice1 = (int) (Math.random() * 6) + 1;
			int dice2 = (int) (Math.random() * 6) + 1;
			System.out.printf("첫번째 주사위: %d, 두번째 주사위: %d, 합계: %d", dice1, dice2, dice1 + dice2);
			System.out.println();
			if (dice1 + dice2 == 5) {
				break;
			}
		}
	}

	public static void method3() {
//		for (int star = 0; star < 5; star++) {
//			for (int i = 0; i < 9; i++) {
//
//				for (int j = 0; j < Math.abs(4 - i); j++) {
//					System.out.printf(" ");
//				}
//				for (int k = 0; k < 9 - Math.abs(2 * (4 - i)); k++) {
//					System.out.printf("*");
//				}
//
//				for (int re = 0; re < star; re++) {
//
//					for (int j = 0; j < Math.abs(4 - i) * 2; j++) {
//						System.out.printf(" ");
//					}
//					for (int k = 0; k < 9 - Math.abs(2 * (4 - i)); k++) {
//						System.out.printf("*");
//					}
//				}
//				System.out.println();
//
//			}
//		}

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i >= j) {
					System.out.printf("%s", "*");
				} else {
					System.out.printf("%s", " ");
				}
			}
			System.out.println();
		}
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i+j >=5) {
					System.out.printf("%s", "*");
				} else {
					System.out.printf("%s", " ");
				}
			}
			System.out.println();
		}
	}
}
