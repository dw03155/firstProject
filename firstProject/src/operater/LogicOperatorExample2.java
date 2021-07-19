package operater;

public class LogicOperatorExample2 {
	public static void main(String[] args) {
		int score = 85;
		
		System.out.println("--------");
		
		if (score <= 60) {
			System.out.println("   F   ");
		} else if (score >= 60 & score < 70) {
			if (score >= 75) {
				System.out.println("   D+   ");
			} else
				System.out.println("   D   ");
		} else if (score >= 70 & score < 80) {
			if (score >= 95) {
				System.out.println("   C+   ");
			} else
				System.out.println("   C   ");
		} else if (score >= 80 & score < 90) {
			if (score >= 85) {
				System.out.println("   B+   ");
			} else
				System.out.println("   B   ");
		} else if (score >= 90) {
			if (score >= 95) {
			System.out.println("   A+   ");
			} else
			System.out.println("   A   ");
		}
		System.out.println("--------");
	}
}
