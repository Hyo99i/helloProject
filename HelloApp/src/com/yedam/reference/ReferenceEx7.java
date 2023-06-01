package com.yedam.reference;

public class ReferenceEx7 {
	public static void main(String[] args) {
		// 학생의 키. a반(2), b반(4), c반(3).
		double[][] heightAry = { 
				{ 173.5, 168.3 },
				{ 176.5, 163.3, 190.3, 188.3 },
				{ 173.5, 168.3, 202.2 } 
		};
		System.out.println(heightAry[1].length);
		
		String[] classAry = { "a", "b", "c" };
		
		for (int i=0; i<heightAry.length; i++) {
			double heightSum = 0;
			for (int j=0; j<heightAry[i].length; j++) {
				heightSum += heightAry[i][j];
			}
			String result = "%s반의 평균 키: %.1fcm \n";
			System.out.printf(result, classAry[i], heightSum/heightAry[i].length);
		}
		
		// 각 반별로 키의 평균 => 1번째반의 평균 키: ...
		
		
	} // end of main().
}
