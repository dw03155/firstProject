package reference;

import java.util.Scanner;

public class ArrayExample {
//	public static void intExam() {
//		int score1 = 70;
//		int score2 = 75;
//		int score3 = 80;
//		int score4 = 85;
//		int score5 = 90;
//		int sum = 0;
//		sum = score1 + score2 + score3 + score4 + score5;
//		double avg = sum / 5.0;
//		System.out.println("평균 : " + avg);
//	}

//	public static void aryExam() {
//		int [] scores = new int[5]; // scores = int형 배열
//		scores[0] = 70;
//		scores[1] = 75;
//		scores[2] = 80;
//		scores[3] = 85;
//		scores[4] = 90;
//		int sum = 0;
//		for(int i=0; i<5; i++) {
//			System.out.println(scores[i]);
//			sum +=scores[i];
//		}
//		double avg = sum / 5.0;
//		System.out.println("평균 : " + avg);
//	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int[] intAry = new int[3]; // 배열의 크기만 정해줌
		intAry = new int[] { 55, 65, 75 }; // 배열의 값만 정해줌
		intAry[2] = 88; // 배열 3번째 위치의 값 바꿔줌
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum = sum + intAry[i];
		}
		System.out.println("배열1의 합:" + sum);

		int[] intAry2 = { 1, 2, 3, 4, 5 }; // 배열의 크기와 값 같이 정해줌
		intAry2 = new int[] { 81, 82, 83, 84, 85 }; //배열 바꿔줌
		sum = 0;
		for (int i = 0; i < intAry2.length; i++) { // length는 배열의 크기
			sum = sum + intAry2[i];
		}
		System.out.println("배열2의 합:" + sum);

//		for (int i = 0; i < 3; i++) {
//			int num = scn.nextInt();
//			intAry[i] = num;
//		}
//		System.out.println(intAry[0]);
//		System.out.println(intAry[1]);
//		System.out.println(intAry[2]);
	}
}
