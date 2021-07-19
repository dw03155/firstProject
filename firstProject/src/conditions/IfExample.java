package conditions;

public class IfExample {
	public static void main(String[] args) {
		System.out.println(Math.random() * 5);
		System.out.println(Math.random() * 5);
		System.out.println(Math.random() * 6);
		System.out.println((int) (Math.random() * 6) + 1);
		
		System.out.println("-----------------");
		
		int ran = (int) (Math.random() * 6) + 1; // 1 ~ 6 범위 안의 임의값
		if (ran == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if (ran == 2) {
			System.out.println("2번이 나왔습니다.");
		} else if (ran == 3) {
			System.out.println("3번이 나왔습니다.");
		} else if (ran == 4) {
			System.out.println("4번이 나왔습니다.");
		} else if (ran == 5) {
			System.out.println("5번이 나왔습니다.");
		} else if (ran == 6) {
			System.out.println("6번이 나왔습니다.");
		}
		
		System.out.println("-----------------");
		
		int score = (int) (Math.random() * 101) ; // 0 ~ 100 범위 안의 임의값
			System.out.println("점수 : " + score);
		if (score >= 90) {
			System.out.println("학점 : A");
		} else if (score >= 80) {
			System.out.println("학점 : B");
		} else if (score >= 70) {
			System.out.println("학점 : C");
		} else if (score >= 60) {
			System.out.println("학점 : D");
		} else {
			System.out.println("학점 : F");
		}
		
		System.out.println("-----------------");
		
		int score2 = (int) (Math.random() * 101) ; // 0 ~ 100 범위 안의 임의값
			System.out.println("점수 : " + score2);
		if (score2 >= 90) {
			System.out.println("학점 : A");
		} if (score2 >= 80) {
			System.out.println("학점 : B");
		} if (score2 >= 70) {
			System.out.println("학점 : C");
		} if (score2 >= 60) {
			System.out.println("학점 : D");
		} else {
			System.out.println("학점 : F");
		}
		
		System.out.println("-----------------");
		
		int score3 = (int) (Math.random() * 101) ; // 0 ~ 100 범위 안의 임의값
		System.out.println("점수 : " + score3);
		if (score3 >= 90) {
			if (score3 >= 95) {	
				System.out.println("학점 : A+");
			} else {
				System.out.println("학점 : A0");
			}
		} else if (score3 >= 80) {
			if (score3 >= 85) {	
				System.out.println("학점 : B+");
			} else {
				System.out.println("학점 : B0");
			}
		} else if (score3 >= 70) {
			if (score3 >= 75) {	
				System.out.println("학점 : C+");
			} else {
				System.out.println("학점 : C0");
			}
		} else if (score3 >= 60) {
			if (score3 >= 65) {	
				System.out.println("학점 : D+");
			} else {
				System.out.println("학점 : D0");
			}
		} else {
		System.out.println("학점 : F");
		}
		
	}
}