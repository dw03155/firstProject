package basic;

public class AppMain { //클래스명은 항상 대문자로 작성
	public static void main(String[] args) { 
		int age = 26;
		//byte(1byte), char(2byte), short(2byte), int(4byte), long(8byte)은 정수
		//1byte=8bit, -2^7~2^7-1
		double age2= 12.4;
		//float(4byte), double(8byte)은 실수
		//boolean(1byte)은 논리(true,false)
		String name = "오혜지"; //문자열 string
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}
