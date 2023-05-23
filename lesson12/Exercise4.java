//인터페이스

/*
4. 다음 코드는 어디가 잘못되었습니까? 틀린 곳이 있으면 고치십시오.

Vehicle vc;
vc = new Vehicle();
vc.setSpeed(500);
vc.show();
 */
package lesson12;

abstract class Vehicle {
	protected int speed;
	
	public void setSpeed(int s) {
		speed = s;
		System.out.println("속도를 " + speed + "(으)로 변경했습니다.");
	}
	
	abstract void show();
}

class Plane extends Vehicle {
	private int flight;
	
	public Plane(int f) {
		flight = f;
		System.out.println("비행기 번호가 " + flight + "인 비행기가 만들어졌습니다.");
	}
	
	public void show() {
		System.out.println("비행기의 번호는 " + flight + ", 속도는 " + speed + "입니다.");
	}
}

public class Exercise4 {

	public static void main(String[] args) {
		
		Plane vc;
		vc = new Plane(232);
		vc.setSpeed(500);
		vc.show();

	}

}
