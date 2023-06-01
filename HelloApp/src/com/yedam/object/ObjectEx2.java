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
				for (int i = 0; i < accounts.length; i++) {
					Bank bk = new Bank();
					System.out.print("계좌번호> ");
					bk.accountNo = scn.nextLine();
					System.out.print("예금주명> ");
					bk.owner = scn.nextLine();
					System.out.print("잔고> ");
					bk.balance = Integer.parseInt(scn.nextLine());

					accounts[i] = bk;
				}

			} else if (selectNo == 2) {
				boolean back = true;
				int count = -1;
				while (back) {
					System.out.println("조회할 계좌번호를 입력해주세요.");
					String searching = scn.nextLine();

					for (int i = 0; i < accounts.length; i++) {
						if (accounts[i].accountNo.equals(searching)) {
							count = i;
							back = false;
							break;
						}
					}
					if (count >= 0) {
						System.out.printf("예금주: %s님의 계좌잔액은 %d원 입니다.\n", accounts[count].owner, accounts[count].balance);
					} else {
						System.out.println("등록되지 않은 계좌번호입니다. 다시 시도해주세요.");
					}
				}

			} else if (selectNo == 3) {

				boolean back = true;
				int count = -1;
				while (back) {
					System.out.println("입금하실 계좌번호를 입력해주세요.");
					String searching = scn.nextLine();
					System.out.println("입금하실 금액을 입력해주세요.");
					int dep = Integer.parseInt(scn.nextLine());

					for (int i = 0; i < accounts.length; i++) {
						if (accounts[i].accountNo.equals(searching)) {
							count = i;
							back = false;
							break;
						}
					}
					if (count >= 0) {
						accounts[count].balance += dep;
						System.out.printf("%d원 입금 정상처리 되었습니다.\n 예금주: %s님의 계좌잔액은 %d원 입니다.\n", dep, accounts[count].owner,
								accounts[count].balance);
					} else {
						System.out.println("등록되지 않은 계좌번호입니다. 다시 시도해주세요.");
					}
				}

			} else if (selectNo == 4) {

				boolean back = true;
				int count = -1;
				while (back) {
					System.out.println("출금하실 계좌번호를 입력해주세요.");
					String searching = scn.nextLine();
					System.out.println("출금하실 금액을 입력해주세요.");
					int wit = Integer.parseInt(scn.nextLine());

					for (int i = 0; i < accounts.length; i++) {
						if (accounts[i].accountNo.equals(searching)) {
							count = i;
							back = false;
							break;
						}
					}
					if (count >= 0) {
						if (accounts[count].balance >= wit) {
							accounts[count].balance -= wit;
							System.out.printf("%d원 출금 정상처리 되었습니다.\n 예금주: %s님의 계좌잔액은 %d원 입니다.\n", wit,
									accounts[count].owner, accounts[count].balance);
						} else {
							System.out.println("계좌잔액이 부족합니다.");
						}

					} else {
						System.out.println("등록되지 않은 계좌번호입니다. 다시 시도해주세요.");
					}
				}

			} else if (selectNo == 5) {
				break;
			}
		}

		System.out.println("end of prog.");
	}
}
