package reference;

public class Person {
	int age; // 나이
	String name; // 이름
	double height; // 키
	double weight; // 몸무게

//메소드 (기능)
	void walk() {
		System.out.println("걷습니다.");
	}

	void sleep() {
		System.out.println("잠을 잡니다.");
	}

	void showInfo() {
		System.out.println("이름은 " + name + ", 나이는 " + age);
	}
}
