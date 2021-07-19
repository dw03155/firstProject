package conditions;

public class ForInForExample {
	public static void main(String[] args) {
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= 5; j++) {
//				System.out.print("i의 값 :" + i + ", j의 값 : " + j +"\t");
//			} //ln 안 붙이면 줄 안바꿈
//			System.out.println(); //줄바꿈
//		}

		// 구구단
		for (int j = 1; j <= 9; j++) {
			for (int i = 1; i <= 9; i++) {
				System.out.print(i+"X"+ j+ "="+ (i*j)+"\t");
			}
			System.out.println();
		}

//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//			System.out.println();
//		}
	}
}
