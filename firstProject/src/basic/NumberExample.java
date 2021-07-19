package basic;

public class NumberExample {
	public static void main(String[] args) {
		byte math = 30; // -128 ~ 127
		byte eng = 50;
		
		int sum = math + eng;
		// byte sum2 = math + eng; 정수연산은 int 타입으로 계산
		byte sum2 = (byte) (math+eng);
		System.out.println("점수의 합 : " + sum);
		System.out.println("점수의 합 : " + sum2);
		
	}
}
