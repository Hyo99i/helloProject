package com.yedam.object;

import java.util.Scanner;

public class ObjectEx1 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		Member[] members = new Member[3];

		for (int i = 0; i < members.length; i++) {
			Member m1 = new Member();

			loop :
			while (true) {
				System.out.print("아이디를 입력> ");
				String id = scn.nextLine();
				m1.memberId = id;
				if (i == 0) {
					break;
				} else if (i != 0) {
					for (int j = 0; j < i; j++) {
						if (members[j].memberId.equals(id)) {
							System.out.println("이미 존재하는 아이디입니다.");
						}
					}
					break loop;
				}
			}

			System.out.print("이름을 입력> ");
			m1.memberName = scn.nextLine();
			System.out.print("point를 입력> ");
			m1.point = Integer.parseInt(scn.nextLine());

			members[i] = m1;
		}

		// memberId 조회 후 point 를 변경.
		System.out.println("조회할 아이디를 입력.");
		String searchId = scn.nextLine();
		System.out.println("변경할 point를 입력.");
		int newPoint = Integer.parseInt(scn.nextLine());

		for (int i = 0; i < members.length; i++) {
			if (members[i].memberId.equals(searchId)) {
				members[i].point = newPoint;
			}
		}

		// 출력
		for (int i = 0; i < members.length; i++) {
			System.out.printf("아이디: %s, 이름: %s, point: %d \n", members[i].memberId, members[i].memberName,
					members[i].point);
		}
	}
}
