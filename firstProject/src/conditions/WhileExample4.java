package conditions;

public class WhileExample4 {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while (i <= 50) {
			if (i % 2 == 0 || i % 3 == 0) {
				sum = sum + i;
			}
			i++;
		}
		System.out.println("i값 : " + i + ", 합계 :" + sum);
		System.out.println("프로그램을 종료합니다.");
	}
}
