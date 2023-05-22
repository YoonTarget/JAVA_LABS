//인터페이스 - instanceof 연산자 사용하기
package lesson12;

//탈것 클래스
abstract class Vehicle2 { //추상 클래스입니다
	protected int speed;
	
	public void setSpeed(int s) {
		speed = s;
		System.out.println("속도를 " + speed + "(으)로 변경했습니다.");
	}
	abstract void show(); //추상 메소드 show()입니다
}  

//자동차 클래스
class Car2 extends Vehicle2 { //추상 클래스를 확장했습니다
	private int num;
	private double gas;
	
	public Car2(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량 번호 " + num + ", 연료 양 " + gas + "인 자동차가 만들어졌습니다.");
	}
	
	public void show() {
		System.out.println("차량 번호는 " + num + ", 연료 양은 " + gas + ", 속도는 " + speed + "입니다.");
		//show() 메소드의 몸체를 만들었습니다
	}
}

//비행기 클래스
class Plane2 extends Vehicle2 { //추상 클래스를 확장했습니다
	private int flight;
	
	public Plane2(int f) {
		flight = f;
		System.out.println("비행기 번호 " + flight + "인 비행기가 만들어졌습니다.");
	}
	
	public void show() {
		System.out.println("비행기 번호는 " + flight + ", 속도는 " + speed + "입니다.");
		//show() 메소드의 몸체를 만들었습니다
	}
}

public class Sample2 {

	public static void main(String[] args) {
		
		Vehicle2[] vc;
		vc = new Vehicle2[2];
		
		vc[0] = new Car2(1234, 20.5); //첫 번째 객체는 Car 클래스입니다
		vc[1] = new Plane2(232); //두 번째 객체는 Plane 클래스입니다
		for(int i = 0; i < vc.length; i++) {
			if(vc[i] instanceof Car2) { //객체가 Car 클래스인지 그 진위를 확인합니다
				System.out.println((i + 1) + "번째 객체는 Car 클래스 입니다.");
				//조건이 참(true)일 때 실행됩니다
			}
			else {
				System.out.println((i + 1) + "번째 객체는 Car 클래스가 아닙니다.");
				//조건이 거짓(false)일 때 실행됩니다
			}
		}

	}

}
