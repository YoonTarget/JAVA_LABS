//클래스의 기능 - 다른 생성자를 호출하기
package lesson9;

//자동차 클래스
class Car6 {
	private int num;
	private double gas;
	
	public Car6() {
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어 졌습니다.");
	}
	
	public Car6(int n, double g) {
		this(); //2개의 인수를 가지는 생성자의 시작 부분에서, 인수없는 생성자를 호출합니다
		num = n;
		gas = g;
		System.out.println("차량 번호를 " + num + "으로, 연료 양을 "
		+ gas + "로 바꾸었습니다.");
	}
	
	public void show() {
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연료 양은 " + gas + "입니다");
	}
}

public class Sample6 {

	public static void main(String[] args) {
		
		Car6 car1 = new Car6();
		car1.show();
		
		Car6 car2 = new Car6(1234, 20.5);
		car2.show();

	}

}
