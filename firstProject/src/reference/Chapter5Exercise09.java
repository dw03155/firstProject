package reference;

import java.util.Scanner;

public class Chapter5Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("-----------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------");
			System.out.println("선택>");
			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.println("학생수>");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				if (studentNum < 0) {
					System.out.println("1이상의 숫자를 입력해주세요.");
					break;
				} else {
					continue; //exam = scores[i]
				}
			} else if (selectNo == 2) {
//				if (studentNum < 0 || scores = null) {
//					System.out.println("학생수를 입력해주세요");
//					break;
//				}else {
					for (int i = 0; i < scores.length; i++) {
					System.out.println("점수" + i + ">");
					scores[i] = scanner.nextInt();
					//int exam = scanner.nextInt();
					if (scores[i] > 100) {
						System.out.println("100이하의 점수를 입력해주세요.");
						i--;
					} else {
						continue; //exam = scores[i]
					}
				}
//				}
			} else if (selectNo == 3) {
//				if (studentNum = 0) {
//					break;
//				}else
//					continue;
				for (int i = 0; i < scores.length; i++) {
					System.out.println("점수" + i + " : " + scores[i]);
				}
			} else if (selectNo == 4) {
				int max = 0;
				double avg = 0.0;
				int sum = 0;
				for (int i = 0; i < scores.length; i++) {
					sum = sum + scores[i];
					if (max < scores[i]) {
						max = scores[i];
					}
				}
				avg = (double) sum / scores.length;
				System.out.println("평균 : " + avg);
				System.out.println("최대값 : " + max);

			} else if (selectNo == 5) {
				run = false;
			}
		}System.out.println("프로그램 종료");
}
}
