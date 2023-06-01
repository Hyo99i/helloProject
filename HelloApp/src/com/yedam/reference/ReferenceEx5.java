package com.yedam.reference;

public class ReferenceEx5 {
	public static void main(String[] args) {
		int a = (int) (Math.random() * 100);
		int b = (int) (Math.random() * 100);
		int c = (int) (Math.random() * 100);

		// 제일 큰 수 intAry 의 첫번째: 제일 큰 값... 제일 작은 값.

		int[] intAry = { a, b, c };

		for (int i = 0; i < intAry.length; i++) {

			for (int j = 0; j < intAry.length; j++) {
				if (intAry[i] < intAry[j]) {
					int num = intAry[i];
					intAry[i] = intAry[j];
					intAry[j] = num;
				}
			}
		}
		
//		for (int i = 0; i < intAry.length; i++) {
//				if (intAry[i] < intAry[i+1]) {
//					int num = intAry[i];
//					intAry[i] = intAry[i+1];
//					intAry[i+1] = num;
//				}
//			
//		}

		for (int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i]);
		}

	}
}
