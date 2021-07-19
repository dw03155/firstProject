package conditions;

public class SwitchExample {
	public static void main(String[] args) {
		int ran = (int) (Math.random() * 4) + 1;
		switch (ran) {
		case 1 :
			System.out.println("1값이 나왔습니다.");
			break; // 실행을 그만두겠습니다.
		case 2 :
			System.out.println("2값이 나왔습니다.");
			break; // 실행을 그만두겠습니다.
		case 3 :
			System.out.println("3값이 나왔습니다.");
			break; // 실행을 그만두겠습니다.
		default : 
			System.out.println("범위 밖의 값이 나왔습니다.");
		}
	}
}
