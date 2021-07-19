package reference;

public class PersonExample {
	public static void main(String[] args) {
		Person hkd = new Person(); // 실제로 개체를 만듬
		hkd.name ="홍길동";
		hkd.age =26;
		hkd.height=158.5;
		hkd.weight=60;
		//hkd.birth = "19961221"; 정의 되어있는 속성만 넣을 수 있음
		
		hkd.walk();
		hkd.sleep();
		hkd.showInfo();
		
		Person psy = null;
		psy.walk();
	}
}
