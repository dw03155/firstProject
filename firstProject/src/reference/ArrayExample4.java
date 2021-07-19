package reference;

import java.util.Scanner;

public class ArrayExample4 {
	// 해적룰렛 게임
	static int n = 25;//main method 안과 밖에서 모두 쓰려고
	static int[] intAry = new int[n]; //main method 안과 밖에서 모두 쓰려고
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// 중복값 제거
		for (int i = 0; i < intAry.length; i++) { // i:배열의 위치
			boolean pass = true;
			intAry[i] = (int) (Math.random() * n) + 1;

			// 이전값과 비교 : 두개의 배열을 만들어서 비교
			for (int j = 0; j < i; j++) { // j: 배열의 위치
				if (intAry[i] == intAry[j]) {
					pass = false;
					break; // 중복값이 있으면 for 반복문 나옴.
				}
			}
			if (!pass) {
				i--;
			}
//			System.out.println("i = " + i + "end");
		}
		for (int i = 0; i < intAry.length; i++) {
			show(i);
			if (i % 5 == 4) { // 5개 배열로 정렬
				System.out.println();
			}
		}
		// 배열값 각각 출력
		while (true) {
			System.out.println("1~25의 위치에서 10을 찾으세요>");
			int idx = scn.nextInt();
			
			if ((idx) >24 || (idx) <0) { //잘못된 범위의 값 입력할 때
				System.out.println("범위의 값을 입력하세요.");
				continue; //아래부분을 실행하지 않고 다시 처음으로 되돌아감
			}
			
			if (intAry[idx] == 10) {
				System.out.println("찾았습니다.");
				break;
			} else {
				intAry[idx] = 0; // '**=꽝'을 표현해줌 (0보다 작은 값)
				System.out.println("꽝!!!!!");
			}
			for (int i = 0; i < intAry.length; i++) {
				show(i);
				if (i % 5 == 4) { // 5개 배열로 정렬
					System.out.println();
				}
			}
		}
		System.out.println("프로그램 end");
	}// end of main
	public static void show(int idx) {
		if (intAry[idx] > 0) {
			System.out.printf("(%2d)", idx); // 공백 두칸에다가 값 입력
		} else {
			System.out.printf("(**)", idx); // 0보다 작은 값은 **로 입력
		}
	}
}// end of class