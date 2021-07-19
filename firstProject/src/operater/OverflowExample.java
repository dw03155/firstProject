package operater;

public class OverflowExample {
	public static void main(String[] args) {
		try {
			int r1 = add(Integer.MAX_VALUE, 20);
			//System.out.println(Integer.MAX_VALUE + 1);
			System.out.println("결과 : " + r1);
		} catch (ArithmeticException e) { //try catch 오류 발생시 메세지 출력 후 종료 
			System.out.println(e.getMessage());
		}
		System.out.println("end of prog.");
	}
	
	public static int add(int a, int b) { //p.81, p.441
		//if (a + b > Integer.MAX_VALUE) {
		if (a > Integer.MAX_VALUE - b) { 
			//(a + b > max)=(a > max - b)의 의미// 두개의 합이 최대값을 넘어서면 오류,출력
			throw new ArithmeticException("범위 밖의 값입니다.");
		} else if (a < Integer.MIN_VALUE + b) {
			//(a - b < min)=(a < min + b)의 의미// 두개의 차가 최소값보다 작으면 오류,출력
			throw new ArithmeticException("범위 밖의 값입니다.");
		}

		int result = a + b;
		return result;
		
	//int - long 으로 바꿔서 해보기
		
	}
}