package conditions;

public class ForExample3 {
	public static void main(String[] args) {
		int sum = 0;
		//1~50까지 수 중에서 2 또는 3의 배수의 합
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				System.out.println(i);
				sum = sum + i;
				System.out.println("현재 합계 :" + sum);
			}
		}
		System.out.println("총 합계 : " + sum);

		//1~50까지 수 중에서 2 그리고 3의 배수의 합
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0 && i % 3 == 0) {
				sum = sum + i;
				System.out.println("i : " + i + ", 합계 :" + sum);
			}
		}
		System.out.println("총 합계 : " + sum);
		
		
		
	}
}