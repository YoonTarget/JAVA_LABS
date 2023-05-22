//인터페이스 - 인터페이스 구현하기
package lesson12;

//탈 것 인터페이스
interface iVehicle { //인터페이스를 선언합니다
	void show(); //추상 메소드 입니다
}

//자동차 클래스
class Car3 implements iVehicle { //인터페이스를 구현합니다
	private int num;
	private double gas;
	
	public Car3(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량 번호가 " + num + ", 연료 양이 " + gas + "인 자동차가 만들어졌습니다.");
	}
	
	public void show() {
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연료 양은 " + gas + "입니다.");
		//추상 메소드의 몸체를 만들었습니다
	}
}

//비행기 클래스
class Plane3 implements iVehicle {
	private int flight;
	
	public Plane3(int f) {
		flight = f;
		System.out.println("비행기 번호가 " + flight + "인 비행기가 만들어졌습니다");
	}
	
	public void show() {
		System.out.println("비행기 번호는 " + flight + "입니다.");
		//추상 메소드의 몸체를 만들었습니다
	}
}

public class Sample3 {

	public static void main(String[] args) {
		
		iVehicle[] ivc;
		ivc = new iVehicle[2]; //인터페이스 배열을 준비합니다
		
		ivc[0] = new Car3(1234, 20.5); //첫 번째 객체는 Car 클래스 입니다
		
		ivc[1] = new Plane3(232); //두 번째 객체는 Plane 클래스 입니다
		
		for(int i = 0; i < ivc.length; i++) {
			ivc[i].show();
		}

	}

}
