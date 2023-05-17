package lesson8; //클래스의 기본

class Car2 { //자동차 클래스
	int num;
	double gas;
	
	void show() {
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연료 양은 " + gas + "입니다.");
	}
}

public class Sample2 { //메소드 호출하기

	public static void main(String[] args) {
		
		Car2 car1;
		car1 = new Car2();
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		car1.show();
		car1.show();
		
	}

}
