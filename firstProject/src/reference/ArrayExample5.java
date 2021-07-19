package reference;

import java.util.Scanner;

public class ArrayExample5 {
	public static void main(String[] args) {

		String[] names = { "Hong", "Hwang", "Park", "Kim", "Choi" };
		String[] orders = { "첫번째", "두번째", "세번째", "네번째", "다섯번째" };

		while (true) {
			Scanner scn = new Scanner(System.in);
			System.out.println("성을 입력하세요>");
			String users = scn.nextLine();
			
			boolean pass = false;
			
			if (users.equals("종료")) {
				break;
			}

			for (int i = 0; i < names.length; i++) {
				if (users.equals(names[i])) {
					System.out.println(orders[i]+"입니다.");
					pass=true;
				}//else를 같이 실행하면 반복
			}
			if (!pass) {
			System.out.println("같은 성을 찾을 수 없습니다.");
			}
		}
		System.out.println("프로그램 종료");
	}// end of main
}// end of class
