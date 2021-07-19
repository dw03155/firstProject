package variable;

public class VarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1 = 30;
		System.out.println(var1);
		var1 = 60;
		System.out.println(var1);

		long var2 = 100L; // 같은 변수 이름 사용 불가
		// var2 = 0.200;
		var2 = 200;

		int sum = var1 + (int) var2;
		System.out.println(sum);

		long sum2 = var1 + var2;
		System.out.println(sum2);

		String name = "OH";
		char chr = 'A';
		System.out.println((int) chr + "," + chr);
		chr++;
		chr++;
		chr--;
		System.out.println((int) chr + "," + chr);
		// ctrl+shift+f 정리하기
	}

}
