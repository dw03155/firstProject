package reference;

public class ArrayExample4_1 {
	public static void main(String[] args) {
		int num1 = (int) (Math.random() * 5 + 1);
		int num2 = (int) (Math.random() * 5 + 1);
		int num3 = (int) (Math.random() * 5 + 1);
		int num4 = (int) (Math.random() * 5 + 1);
		int num5 = (int) (Math.random() * 5 + 1);

		int[] intAry2 = new int[5];

		while (true) {
			if (num1 == num2) {
				num2 = (int) (Math.random() * 5 + 1);
			} else {
				intAry2[1] = num2;
				break;
			}
		}

		while (true) {
			if (num1 == num2 || num1 == num3) {
				num3 = (int) (Math.random() * 5 + 1);
			} else {
				intAry2[2] = num3;
				break;
			}
		}
		
		while (true) {
			if (num1 == num2 || num1 == num3 || num1 == num4) {
				num4 = (int) (Math.random() * 5 + 1);
			} else {
				intAry2[3] = num4;
				break;
			}
		}

		while (true) {
			if (num1 == num2 || num1 == num3 || num1 == num4 || num1 == num5) {
				num5 = (int) (Math.random() * 5 + 1);
			} else {
				intAry2[4] = num5;
				break;
			}
		}
		for (int n : intAry2) {
			System.out.print(n);
		}
	}
//	System.out.println(intAry[n]); // 4번째 값을 출력
//	System.out.println(intAry[n-1]);// 3번째 값을 출력
}