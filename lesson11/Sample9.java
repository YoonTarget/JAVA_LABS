//새로운 클래스 - getClass() 메소드 사용하기
package lesson11;

//자동차 클래스
class Car9 {
	protected int num;
	protected double gas;
	
	public Car9() {
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}
}

//레이싱 카 클래스
class RacingCar9 extends Car9 {
	private int course;
	
	public RacingCar9() {
		course = 0;
		System.out.println("레이싱 카가 만들어졌습니다.");
	}
}

public class Sample9 {

	public static void main(String[] args) {
		
		Car9[] cars;
		cars = new Car9[2];
		
		cars[0] = new Car9(); //첫 번째 객체의 Car 클래스입니다
		cars[1] = new RacingCar9(); //두 번째 객체의 RacingCar 클래스입니다
		
		for(int i = 0; i < cars.length; i++) {
			Class cl = cars[i].getClass(); //getClass() 메소드는 Class 객체를 반환합니다
			System.out.println((i + 1) + "번째 객체의 클래스는 " + cl + "입니다.");
		}

	}

}
