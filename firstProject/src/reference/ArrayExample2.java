package reference;

public class ArrayExample2 {
	public static void main(String[] args) {
		int[] intAry = { 10, 20, 30, 33, 22, 17 };
		intAry[0] = 11;
//		System.out.println(intAry[0]); // 변수 읽어오기
//		System.out.println("배열크기 : " + intAry.length);
		int sum = 0;
		int maxValue = 0;
		for (int i = 0; i < intAry.length; i++) {
			System.out.println("배열[" + i + "]의 값 : " + intAry[i]);
			sum = sum + intAry[i];
			
			//intAry의 배열과 최대값 비교해서 큰 값 넣기
			if (maxValue < intAry[i]) {
				maxValue = intAry[i];
			}
			
		}
		System.out.println("합계 : " + sum);
		System.out.println("최대값 : " + maxValue);
		//소수점으로 된 배열
		double[] dblAry = { 1, 2, 3 }; // 1,2,3을 소수점 포함해서 출력
		for (int j = 0; j < dblAry.length; j++) {
			System.out.println("배열[" + j + "]의 값 : " + dblAry[j]);
		}
		//문자로 된 배열
		String[] names = { "Kim", "Hong", "Park" };
		names[0] = "Oh";
		// ★★향상된 for문
		for (String name : names) { // names : 배열변수 이름
			System.out.println(name);
		}
		for (double num : dblAry) {
			System.out.println(num);
		}
	}// end of main
}// end of class
