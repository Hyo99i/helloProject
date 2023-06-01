package com.yedam.control;

public class ControlEx3 {
	public static void main(String[] args) {

		for (int cal = 4; cal <= 6; cal++) {
			System.out.printf("\t <2023년 %d월> \n", cal);
			String days = "Sun Mon Tue Wed Thr Fri Sat";
			System.out.println(days);
			System.out.println("===========================");

			for (int i = 0; i < getFirstDate(cal); i++) {
				System.out.printf("%3s ", "");
			}
			for (int day = 1; day <= getLastDate(cal); day++) {
				System.out.printf("%3d ", day);
				switch (cal) {
				case 4:
					if (day % 7 == 1) {
						System.out.println();
					}
					break;
				case 5:
					if (day % 7 == 6) {
						System.out.println();
					}
					break;
				case 6:
					if (day % 7 == 3) {
						System.out.println();
					}
					break;
				}
			}
			System.out.println();
		}
	}

	// 4,5,6월 달력. switch ~ case 구문.
	public static int getFirstDate(int month) {
		int result = 0;
		switch (month) {
		case 4:
			result = 6;
			break;
		case 5:
			result = 1;
			break;
		case 6:
			result = 4;
			break;
		}
		return result;
	}

	public static int getLastDate(int month) {
		int result = 0;
		switch (month) {
		case 4:
			result = 30;
			break;
		case 5:
			result = 31;
			break;
		case 6:
			result = 30;
			break;
		}
		return result;
	}

	public static void method1() {
		// 반복문 : for, while, do~while
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1)
				System.out.printf("i의 값은 %d \n", i);
			else
				System.out.println("짝수입니다.");
		}
	}

	public static void method2() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 5; j++) {
				System.out.printf("%d x %d = %d \t", j, i, j * i);
			}
			System.out.println();
		}
	}
}
