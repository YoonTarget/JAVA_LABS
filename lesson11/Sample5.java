//새로운 클래스 - 슈퍼 클래스 변수 사용하기
package lesson11;

//자동차 클래스
class Car5 {
	protected int num;
	protected double gas;
	
	public Car5() {
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}
	
	public void setCar5(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량 번호를 " + num + ", 연료 양을 " + gas + "(으)로 바꿉니다.");
	}
	
	public void show() {
		System.out.println("차량 번호는 " + num + ", 연료 양은 " + gas + "입니다.");
	}
}

//레이싱 카 클래스
class RacingCar5 extends Car5 {
	private int course;
	
	public RacingCar5() {
		course = 0;
		System.out.println("레이싱 카가 만들어졌습니다.");
	}
	
	public void setCourse(int c) {
		course = c;
		System.out.println("코스 번호를 " + course + "(으)로 바꿉니다.");
	}
	
	public void show() {
		System.out.println("레이싱 카의 차량 번호는 " + num + ", 연료 양은 " + gas + 
				", 코스 번호는 " + course + "입니다.");
	}
}

public class Sample5 {

	public static void main(String[] args) {
		
		Car5 car1; //슈퍼 클래스의 변수로 객체를 다루고 있습니다
		car1 = new RacingCar5();
		car1.setCar5(1234, 20.5);
		car1.show(); //show() 메소드를 호출하면...

	}

}
