package com.yedam.control;

import java.util.Scanner;

public class ControlEx2 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int num = 0;

		while (true) {
			System.out.println("가위바위보를 선택하세요.");
			String rsp = scn.nextLine();

			int result = (int) (Math.random() * 3) + 1;

			switch (result) {
			case 1:
				switch (rsp) {
				case "가위":
					System.out.println("나: " + rsp + " 상대방: 가위");
					System.out.println("무승부");
					break;
				case "바위":
					System.out.println("나: " + rsp + " 상대방: 가위");
					System.out.println("승리");
					num += 1;
					if (num > 1) {
						System.out.println(num + "연승!");
					}
					break;
				case "보":
					System.out.println("나: " + rsp + " 상대방: 가위");
					System.out.println("패배");
					num = -1;
					break;
				}
				break;
			case 2:
				switch (rsp) {
				case "가위":
					System.out.println("나: " + rsp + " 상대방: 바위");
					System.out.println("패배");
					num = -1;
					break;
				case "바위":
					System.out.println("나: " + rsp + " 상대방: 바위");
					System.out.println("무승부");
					break;
				case "보":
					System.out.println("나: " + rsp + " 상대방: 바위");
					System.out.println("승리");
					num += 1;
					if (num > 1) {
						System.out.println(num + "연승!");
					}
					break;
				}
				break;
			case 3:
				switch (rsp) {
				case "가위":
					System.out.println("나: " + rsp + " 상대방: 보");
					System.out.println("승리");
					num += 1;
					if (num > 1) {
						System.out.println(num + "연승!");
					}
					break;
				case "바위":
					System.out.println("나: " + rsp + " 상대방: 보");
					System.out.println("패배");
					num = -1;
					break;
				case "보":
					System.out.println("나: " + rsp + " 상대방: 보");
					System.out.println("무승부");
					break;
				}
				break;
			}
			if (num == -1) {
				break;
			}
		}
		System.out.println("end of prog.");
	}
}
