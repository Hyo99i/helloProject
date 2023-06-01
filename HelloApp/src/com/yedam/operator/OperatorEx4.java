package com.yedam.operator;

import java.io.IOException;

public class OperatorEx4 {
	public static void main(String[] args) {
		// 기본입력. 입력값이 대문자, 소문자, 숫자 => 출력.
		// q가 113 => 종료.

		
		while (true) {
			System.out.println("값을 입력하세요.");
			try {
				int result = System.in.read();
				if (result == 113) {
					break;
				}

				if (result >= 97 && result <= 122) {
					System.out.println("소문자입니다.");
				}
				if (result >= 65 && result <= 90) {
					System.out.println("대문자입니다.");
				}
				if (result >= 48 && result <= 57) {
					System.out.println("숫자입니다.");
				}
				System.out.println(result);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("끝.");
	}
}
