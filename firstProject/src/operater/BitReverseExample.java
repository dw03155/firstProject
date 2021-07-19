package operater;

public class BitReverseExample {
	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1 + 1;

		System.out.println("이진수 : " + toBinaryString(v1) + ", 십진수 : " + v1);
		System.out.println("이진수 : " + toBinaryString(v2) + ", 십진수 : " + v2);
		System.out.println("이진수 : " + toBinaryString(v3) + ", 십진수 : " + v3);
		
	}

	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		// 10진수를 2진수로 바꿔주는

		while (str.length() < 32) { // 반복문 : 첫글자 0으로 시작할 때 0도 나타내주는
			str = "0" + str;		// 32자를 만족할 때까지 0을 나타내 주세요
		}
		return str;					// 32자를 채울 때 반복문 끝내기(빠져나가기)
	}
}
