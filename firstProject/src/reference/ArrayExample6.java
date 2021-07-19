package reference;

public class ArrayExample6 {
	public static void main(String[] args) {

		int[] scores = new int[10];
		int sum = 0;
		double avg = 0.0;
		int maxValue = 0;

		for (int i = 0; i < scores.length; i++) {
			scores[i] = (int) (Math.random() * 20) + 80;
		}

		for (int i = 0; i < scores.length; i++) {
			System.out.println("점수 : " + scores[i]);
			sum = sum + scores[i];

			if (maxValue < scores[i]) {
				maxValue = scores[i];
			}
		}
		avg = (double) sum / scores.length;
		System.out.println("-------------");
		System.out.println("평균 : " + avg);
		System.out.println("최대값 : " + maxValue);
	}
}
