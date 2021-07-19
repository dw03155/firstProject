package variable;

public class BoolExample {
	public static void main(String[] args) {
		boolean b = true; //,false
		int a = 50;
		
		if (b) { // boolean형 타입 변수를 써야함
			System.out.println("1.존재하는 값입니다."); //참일때 출력
		}
		if (a>50) { // a가 50보다 클때 츨력
			System.out.println("2.존재하는 값입니다.");
		}	
		
		b = a >= 50;
		if (b) { // a값이 50보다 크거나 같을 때 출력
				System.out.println("3.존재하는 값입니다."); //
		}

		b = a != 50;
		if (b) { // b(=a가 50이 아니다)가 참일때 출력
			System.out.println("4.존재하는 값입니다."); //
		}
		
		b = a == 50;
		if (!b) { // b(=a가 50과 같다)가 참이 아닐때 출력
			System.out.println("5.존재하는 값입니다."); //
		}
		
		System.out.println("- end of prog -");
		
		
		System.out.println(Byte.MAX_VALUE);// byte값일때 출력
		if (Byte.MAX_VALUE < 200) {
				System.out.println("참입니다."); //
		}
		
		System.out.println(Long.MAX_VALUE);//
		
		System.out.println("- end of prog -");
		
	}
	
		
}

