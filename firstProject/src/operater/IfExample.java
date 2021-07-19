package operater;

public class IfExample { //조건문
	public static void main(String[] args) {
		int v1 = 20;
		int v2 = 20;

		if (v1 > v2) {
			System.out.println("v1이 v2보다 큽니다");
		} else if (v1 < v2) {
			System.out.println("v1이 v2보다 작습니다");
		} else {
			System.out.println("v1이 v2와 같습니다.");
		}
		
		String str1 = "오혜지";
		String str2 = "오혜지";
		String str3 = new String("오혜지");
		
		if (str1==str3) {// 주소값 비교
			System.out.println("같은 이름입니다.");
		} else {
			System.out.println("다른 이름입니다.");
		}
		
		if (str1.equals(str3)) {// 문자열 비교
			System.out.println("같은 이름입니다.");
		} else {
			System.out.println("다른 이름입니다.");
				
		}
	}	
}
