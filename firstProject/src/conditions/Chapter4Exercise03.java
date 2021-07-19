package conditions;

public class Chapter4Exercise03 {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i=1; i<=100; i++)
			
			if (i % 3 == 0) { 
//			System.out.println(i);
			sum = sum + i;
			
//			System.out.println("현재 합계 :" + sum);
		
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			} 
			}
			
		System.out.println("총 합계 : " + sum);
	}
}