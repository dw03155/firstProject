package conditions;

import java.util.Scanner;

public class WhileExample5 {
	public static void main(String[] args) {
		int ran = (int) (Math.random() * 3 + 1);
		String coms = "";
		if (ran == 1) {
			coms = "가위";
		} else if (ran == 2) {
			coms = "바위";
		} else if (ran == 3) {
			coms = "보";
		}

		Scanner scn = new Scanner(System.in);
		System.out.println("가위바위보 게임");
		System.out.println("가위, 바위, 보를 입력하세요");
		String users = scn.nextLine();

		int fig = 0;
		if (users.equals ("가위")) {
			fig = 1;
		} else if (users.equals("바위")) {
			fig = 2;
		} else if (users.equals("보")) {
			fig = 3;
		}

		System.out.println("사용자 : " + users + " VS 컴퓨터 : " + coms );
//
//		if (fig == ran) {
//			System.out.println("비겼습니다.");
//		} else if ((fig == 1 && ran == 3) ||(fig == 2 && ran == 1)||(fig == 3 && ran == 2)) {
//			System.out.println("이겼습니다.");
//		} else {
//			System.out.println("졌습니다.");
//		}

		if (fig-ran == 0) {
			System.out.println("비겼습니다.");
		} else if ((fig-ran == 1) || (fig-ran == -2)) {
			System.out.println("이겼습니다.");
		} else {
			System.out.println("졌습니다.");
		}
		
	}
}