//클래스 이용 - 객체를 변경하기
package lesson10;

//자동차 클래스
class Car1 {
	private int num;
	private double gas;
	
	public Car1() {
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어 졌습니다.");
	}
	
	public void setCar1(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량 번호를 " + num +
				"(으)로, 연료 양을 " + gas + "(으)로 바꿉니다.");
	}
	
	public void show() {
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연료 양은 " + gas + "입니다.");
	}
}

public class Sample7 {

	public static void main(String[] args) {
		
		Car1 car1;
		System.out.println("car1을 선언했습니다.");
		car1 = new Car1();
		car1.setCar1(1234, 20.5);
		
		Car1 car2;
		System.out.println("car2를 선언했습니다.");
		car2 = car1;
		System.out.println("car2를 car1에 대입했습니다.");
		
		System.out.println("car1이 가리키는 ");
		car1.show();
		
		System.out.println("car2가 가리키는 ");
		car2.show();
		
		System.out.println("car1이 가리키는 차량을 변경합니다.");
		car1.setCar1(2345, 30.5); //'car1'을 사용하여 객체를 변경했습니다 
		
		System.out.println("car1이 가리키는 ");
		car1.show();
		
		System.out.println("car2가 가리키는 ");
		car2.show();
		
	}

}
