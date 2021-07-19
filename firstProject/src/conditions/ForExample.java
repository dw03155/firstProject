package conditions;

public class ForExample {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) { // 초기값, 조건식, 증감치
			System.out.println("안녕하세요.");
		}
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//			sum = sum + i;
//			System.out.println("현재 합계 :" + sum);
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) { // 반복 실행될 때마다 0.5초
//				e.printStackTrace();
//			}
		if (i % 2 == 0) { // 짝수만 더하고 싶을 때
			System.out.println(i);
			sum = sum + i;
			System.out.println("현재 합계 :" + sum);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}else if (i==5) {
			break;
			}
		}
		System.out.println("총 합계 : " + sum);
	}
}
