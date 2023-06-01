package com.yedam.reference;

public class ReferenceEx2 {
	public static void main(String[] args) {
		// int s1 = 90; int s2 = 80; ... int s20 = 90;
		int[] intAry = { 30, 40, 50 };
		double[] dblAry = { 30, 40, 50 };
		String[] strAry = { "H", "E", "L", "L", "O" };
		int[] intAry2 = new int[3]; // 0, 0, 0

//		// 배열의 크기는 한번 정해지면 불변.
//		intAry[3] = 33;
		
		System.out.println(intAry[0]);
		intAry[0] = 33;
		System.out.println(intAry[0]);

		int sum1 = intAry[0] + intAry[1] + intAry[2];
		for (int i=0; i<3; i++) {
			sum1 += intAry[i];
		}
		// 확장 for.
		for (String str : strAry) {
			System.out.println(str);
		}
		
		System.out.println(sum1);
		double sum2 = dblAry[0] + dblAry[1] + dblAry[2];

	}
}
