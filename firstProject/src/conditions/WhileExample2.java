package conditions;

public class WhileExample2 {
	public static void main(String[] args) {

		while (true) { //반복을 끝내는 조건이 필요함
			System.out.println("안녕하세요?");
			int ran = (int) (Math.random() * 3) + 1;
			System.out.println("생성된 값 : " + ran);
			if (ran == 3) {
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
