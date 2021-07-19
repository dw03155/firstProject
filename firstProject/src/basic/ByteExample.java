package basic;

public class ByteExample {
	public static void main(String[] args) {
		byte numb1 = 125; // -129 ~ 127
		
		numb1++; // 126 = 125 + 1
		numb1++; // 127 = 126 + 1
		numb1++; // 128 = 127 + 1
		// ++ : 1을 더하겠다
		numb1++; // 127 = 128 - 1
		// -- : 1을 빼겠다
		
		System.out.println(numb1);
		
		byte numb2 = 125; // -129 ~127
		numb2 = ++numb2;
		numb2 = ++numb2;
		numb2 = ++numb2;
		
		System.out.println(numb2);
		
		int numb3 = 13;
		int numb4 = 5;
		int rem = numb3 % numb4; // rem = 나눈 나머지
		
		System.out.println(numb4 + "로 나눈 나머지 : " + rem);
		
	}
}

