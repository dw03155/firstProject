package operater;

public class BitExample {
	public static void main(String[] args) {
		int numb1 = 10;
		System.out.println(numb1);

		System.out.println(~numb1);

		System.out.println(~numb1 + 1);

		System.out.println("numb1 : " + ~numb1 + 1);

		System.out.println("numb1 : " + (~numb1 + 1));

		int var1, var2, result;
		var2 = var1 = 10;
		result = var1 + var2;
		System.out.println("결과 : " + result);
		result = sum(var1, var2);
		System.out.println("결과 : " + result);

		//(1)
		String name = "오혜지";
		String str = getName(name);
		System.out.println(str);
		}
		
		//(2)
		//String str = getName();
		//System.out.println(str);
		//}

	//public static int sum(int a, int b) {
		//int val = a + b;
		//return val; // sum의 방법으로 val의 결과를 출력

	//}
	public static int sum(int a, int b) {
		int val = a + b - 5;
		return val;
	}
			
	//(1)
	public static String getName(String n) {
		String name = "Welcome " + n;
		return name;
	}
	
	//(2)
	//public static String getName() {
		 //String name = "Welcome 오혜지";
		 //return name;
	//}
}
