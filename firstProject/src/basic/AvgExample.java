package basic;

public class AvgExample {
	public static void main(String[] args) {
		
		String name = "오혜지";
		System.out.println("이름 : " + name);
		
		int kor = 85;
		int eng = 83;
		int math = 88;
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		double avg2 = (double) (sum) / 3;
		
		System.out.println("점수합 : " + sum);
		System.out.println("점수평균 : " + avg);
		System.out.println("점수평균 : " + avg2);
		
		System.out.println(name + "의 점수합계는 " + sum + ", 평균은 " + avg + "입니다.");
	}
}
