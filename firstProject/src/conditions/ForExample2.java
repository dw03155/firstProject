package conditions;

public class ForExample2 {
	public static void main(String[] args) {
		int val = 5;
		for (int i = 1; i<=9; i++) {
		System.out.println( val + " * " + i + " = " );
		}

//		//구구단
//		int mul = 0;
//		for (int i = 1, j = 1; i <= 9 && j <= 9; j++) {
//			mul = i * j;
//			System.out.println(i + " * " + j + " = " + mul);
//			if (j == 9) {
//				j = 0;
//				i++;
//			}
//		}

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
