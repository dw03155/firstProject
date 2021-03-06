package reference;

public class ArrayExample3 {
	public static void main(String[] args) {
		int num1 = (int) (Math.random() * 25+1);
		int num2 = (int) (Math.random() * 25+1);
		int num3 = (int) (Math.random() * 25+1);

		int[] intAry = new int[3];

		//크기순으로 정렬하기
		if (num1 > num2) {
			if (num1 > num3) {
				intAry[0] = num1;
				if (num2 > num3) { 		//1>2>3
					intAry[1] = num2;
					intAry[2] = num3;
				} else { 				//1>3>2
					intAry[1] = num3;
					intAry[2] = num2;
				}
			} else if (num1 < num3) { 	//3>1>2
				intAry[0] = num3;
				intAry[1] = num1;
				intAry[2] = num2;
			}
		} else if (num2 > num1) {
			if (num2 > num3) {
				intAry[0] = num2;
				if (num1 > num3) { 		//2>1>3
					intAry[1] = num1;
					intAry[2] = num3;
				} else { 				//2>3>1
					intAry[1] = num3;
					intAry[2] = num1;
				}
			} else if (num2 < num3) {	//3>2>1
				intAry[0] = num3;
				intAry[1] = num2;
				intAry[2] = num1;
			}
		}

		for (int n : intAry) {
			System.out.println(n);
		}
	}
}
