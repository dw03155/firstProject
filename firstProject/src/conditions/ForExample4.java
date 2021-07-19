package conditions;

public class ForExample4 {
	public static void main(String[] args) {
//		int sum = 0;
//		
//		for (int i=1; i<=10; i++) {
//		//int sum = 0;	//블록 안에서 선언하게 되면 블록 안에서만 유효
//						//반복할 때마다 sum값 초기화
//		sum = sum + i;
//	}
//	System.out.println("1 ~ 10 까지의 합 : " + sum);

		forSum();
		whileSum();
	}
//	public static void forSum() { // 위와 같은 값, 반환되는 값이 없다.
//		int sum = 0;
//
//		for (int i = 1; i <= 10; i++) {
//			sum = sum + i;
//		}
//		System.out.println("1 ~ 10 까지의 합 : " + sum);
//	}

//	public static void whileSum() {
//		int i = 1;
//		int sum = 0;
//
//		while (i <= 10) {
//			sum = sum + i;
//			i++;
//		}
//		System.out.println("1 ~ 10 까지의 합 : " + sum);
//	}

	public static void forSum() {
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1)
				sum = sum + i;
				System.out.println("값> " + i + ", 합> "+sum);
		}
		System.out.println("1 ~ 10 까지의 홀수 합 : " + sum);
	}

	public static void whileSum() {
		int i = 1;
		int sum = 0;

		while (i <= 10) {
			i++; 	//블록 안에서 선언하게 되면 1이 짝수가 아니라서 반복 불가
			if (i % 2 == 0)
				sum = sum + i;
		}
		System.out.println("1 ~ 10 까지의 짝수 합 : " + sum);
	}

}
