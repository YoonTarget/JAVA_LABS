package lesson8; //클래스의 기본

class Car5 { //자동차 클래스
	int num;
	double gas;
	void setNumGas(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량 번호를 " + num + "(으)로, 연료 양을 " + gas + "(으)로 바꾸었습니다.");
	}
	void show() {
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연료 양은 " + gas + "입니다.");
	}
}

public class Sample5 { //둘 이상의 인수를 가지는 메소드를 호출하기

	public static void main(String[] args) {
		
		Car5 car1 = new Car5();
		
		int number = 1234;
		double gasoline = 20.5;
		
		car1.setNumGas(number, gasoline);

	}

}
