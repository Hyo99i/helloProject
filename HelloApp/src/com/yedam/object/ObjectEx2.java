package com.yedam.object;

import java.util.Scanner;

public class ObjectEx2 {
	public static void main(String[] args) {
		// int[] {0,0,0}, Bank[] {null,null,null}
		Scanner scn = new Scanner(System.in);

		Bank[] accounts = new Bank[3];

		boolean run = true;
		int selectNo = 0;

		while (run) {
			System.out.println("1.등록 2.조회(계좌번호) 3.입금 4.출금 5.종료");
			System.out.print("선택> ");
			selectNo = Integer.parseInt(scn.nextLine());

			if (selectNo == 1) {
				
				
				System.out.print("계좌번호> ");
				accounts[0].accountNo = scn.nextLine();
				System.out.print("예금주명> ");
				accounts[0].owner = scn.nextLine();
				System.out.print("잔고> ");
				accounts[0].balance = Integer.parseInt(scn.nextLine());
				
			} else if (selectNo == 2) {

			} else if (selectNo == 3) {

			} else if (selectNo == 4) {

			} else if (selectNo == 5) {
				break;
			}
		}

		System.out.println("end of prog.");
	}
}
