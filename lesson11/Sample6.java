//새로운 클래스 - 슈퍼 클래스 배열 이용하기
package lesson11;

//자동차 클래스
class Car6 {
	protected int num;
	protected double gas;
	
	public Car6() {
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량 번호를 " + num + ", 연료 양을 " + gas + "(으)로 바꿉니다.");
	}
	
	public void show() {
		System.out.println("차량 번호는 " + num + ", 연료 양은 " + gas + "입니다.");
	}
}

//레이싱 카 클래스
class RacingCar6 extends Car6 {
	private int course;
	
	public RacingCar6() {
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

public class Sample6 {

	public static void main(String[] args) {
		
		Car6[] cars;
		cars = new Car6[2]; //슈퍼 클래스 배열을 준비합니다
		
		cars[0] = new Car6();
		cars[0].setCar(1234, 20.5); //슈퍼 클래스 객체를 생성합니다
		
		cars[1] = new RacingCar6();
		cars[1].setCar(4567, 30.5); //서브 클래스 객체를 생성합니다
		
		for(int i = 0; i < cars.length; i++) { //모두 동일한 슈퍼 클래스 배열로 다룰 수 있습니다
			cars[i].show();
		}

	}

}
