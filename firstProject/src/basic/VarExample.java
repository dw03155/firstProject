package basic;

public class VarExample {
	public static void main(String[] args) {
		int kor = 60;
		int eng = 71;
		
		int sum = kor + eng;
		System.out.println("합 : " + sum);
		
		double avg = sum / 2.0; // 계산은 정수 값으로 나옴
		System.out.println("평균 : " + avg);
		
		sum = 100;
		
		double mul = kor * eng;
		int mul2 = kor * eng;
		System.out.println("곱 : " + mul);
		System.out.println("곱 : " + mul2);
		System.out.println("곱 : " + kor * eng);
	}
}
