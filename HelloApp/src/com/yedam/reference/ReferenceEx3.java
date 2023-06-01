package com.yedam.reference;

public class ReferenceEx3 {
	public static void main(String[] args) {
		// 학생점수: 89.5, 78.9, 90.4 값을 저장. sum, avg 구함.

		double[] scores = { 89.5, 78.9, 90.4 };
		scores = new double[] { 55.5, 66.6, 77.7, 88.8 };
		double maxVal = 0;
		double minVal = scores[0];
		double sum = 0;
		for (double score : scores) {
			sum += score;
		}
		double avg = sum / scores.length;
		for (double score : scores) {
			if (maxVal < score) {
				maxVal = score;
			}
			if (minVal > score) {
				minVal = score;
			}
		}
		System.out.printf("총합: %.2f, 평균: %.2f, 최고점수: %.2f, 최저점수: %.2f", sum, avg, maxVal, minVal);

	}
}
