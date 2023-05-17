package lesson8; //클래스의 기본

class Car { //자동차 클래스
	int num;
	double gas;
}

public class Sample1 { //클래스를 사용하기

	public static void main(String[] args) {
		
		Car car1; 
		car1 = new Car();
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		System.out.println("차량 번호는 " + car1.num + "입니다.");
		System.out.println("연료 양은 " + car1.gas + "입니다.");

	}

}
