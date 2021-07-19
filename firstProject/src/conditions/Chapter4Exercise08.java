package conditions;

import java.util.Scanner;

public class Chapter4Exercise08 { // 예금,출금 프로그램

	static int balance = 0;
	static Scanner scn = new Scanner(System.in);

	public static boolean checkAdmin(String id, String pass) {
		if (id.equals("admin") && pass.equals("1234")) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {

		boolean run = false;

		do {
			if (!run) { // run 값의 부정값
				System.out.println("ID를 입력하세요");
				String id = scn.nextLine();
				System.out.println("Password를 입력하세요");
				String pass = scn.nextLine();

				run = checkAdmin(id, pass); // ID와 password 입력
			} else {
				// 메뉴출력
				printMenu();

				int menu = scn.nextInt(); // 숫자를 쓰면 int 타입 출력가 나옴
				if (menu == 1) {
					deposit();
				} else if (menu == 2) {
					withdraw();
				} else if (menu == 3) {
					System.out.println("-----------------------");
					System.out.println("현재 잔액은 " + balance + "원입니다.");
					System.out.println("-----------------------");
				} else if (menu == 4) {
					run = false;
				}
				returnMenu();
			}
		} while (run); // while end
		System.out.println("프로그램을 종료합니다.");
	} // main end

	public static void printMenu() {
		System.out.println("-----------------------------");
		System.out.println("1.입금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("-----------------------------");
		System.out.println("번호를 선택해주세요. > ");
	}

	public static boolean returnMenu() {
		System.out.println("메뉴로 돌아가시겠습니까? Y or N >");
		String menu = scn.nextLine();
		if (menu.equals("Y")) {
			return true;
		} else
			return false;
	}

	public static void deposit() {
		System.out.println("입금할 금액을 입력해주세요. >");
		int temp = scn.nextInt();
		if (temp > 100000) {
			System.out.println("입금할 금액이 10만원을 초과합니다.");
		} else {
			// balance = balance + temp;
			balance = add(balance, temp);
			System.out.println("-----------------------");
			System.out.println("현재 잔액은 " + balance + "원입니다.");
			System.out.println("-----------------------");
		}
	}

	public static void withdraw() {
		System.out.println("출금할 금액 입력해주세요. >");
		int temp = scn.nextInt();
		if (temp > balance) {
			System.out.println("잔액이 부족합니다.");
		} else {
			// balance = balance - temp;
			balance = add(balance, -temp);
			System.out.println("-----------------------");
			System.out.println("현재 잔액은 " + balance + "원입니다.");
			System.out.println("-----------------------");
		}
	}

	public static int add(int balance, int amount) {
		int sum = balance + amount;
		return sum;
	}
} // class end
