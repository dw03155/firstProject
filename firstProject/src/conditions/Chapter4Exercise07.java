package conditions;

import java.util.Scanner;

public class Chapter4Exercise07 { // 예금,출금 프로그램
	public static void main(String[] args) {
		int balance = 0;
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("-----------------------------");
			System.out.println("1.입금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.println("번호를 선택해주세요. > ");

			int menu = scn.nextInt(); // 숫자를 쓰면 int 타입 출력가 나옴
			if (menu == 1) {
				System.out.println("입금할 금액을 입력해주세요. >");
				int temp = scn.nextInt();
				if (temp > 100000) {
					System.out.println("입금할 금액이 10만원을 초과합니다.");
				} else {
					balance = balance + temp;
					System.out.println("-----------------------");
					System.out.println("현재 잔액은 " + balance + "원입니다.");
					System.out.println("-----------------------");
				}
			} else if (menu == 2) {
				System.out.println("출금할 금액 입력해주세요. >");
				int temp = scn.nextInt();
				if (temp > balance) {
					System.out.println("잔액이 부족합니다.");
				} else {
					balance = balance - temp;
					System.out.println("-----------------------");
					System.out.println("현재 잔액은 " + balance + "원입니다.");
					System.out.println("-----------------------");
				}
			} else if (menu == 3) {
				System.out.println("-----------------------");
				System.out.println("현재 잔액은 " + balance + "원입니다.");
				System.out.println("-----------------------");

			} else if (menu == 4) {
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	} // main end
} // class end
