package operater;

public class AssignOperatorExample {
	public static void main(String[] args) {
		int val1 = 10;
		val1 += 2; // val1 = val1 + 2
		System.out.println(val1);
		val1 -= 2; // val1 = val1 - 2
		System.out.println(val1);
		val1 *= 2; // val1 = val1 * 2
		System.out.println(val1);

//		for (int i = 10; i<15; i++) {
//			System.out.println(i);
//			}
		
		String str1 = "A";
		str1 = str1 + "B";
		str1 += "C";
		System.out.println(str1);
		
//		String msg = "";
//		if (val1 % 2 == 0) {
//			msg = "짝수";
//		} else {
//			msg = "홀수";
//		}
//		System.out.println(val1 +"은 "+ msg +"입니다.");
//		
//		msg = (val1 % 2 == 0) ? "짝수" : "홀수";
//		System.out.println(val1 +"은 "+ msg +"입니다.");

	}
}
