//새로운 클래스 - 클래스를 확장하기, 서브 클래스의 객체 생성하기
package lesson11;

//자동차 클래스

class Car { //슈퍼 클래스를 선언합니다
	private int num;
	private double gas;
	
	public Car() {
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량 번호를 " + num +
				", 연료 양을 " + gas + "(으)로 바꿉니다.");
	}
	
	public void show() {
		System.out.println("차량 번호는 " + num +
				", 연료 양은 " + gas + "입니다.");
	}
}

//레이싱 카 클래스
class RacingCar extends Car { //서브 클래스를 선언합니다
	private int course; //추가되는 필드입니다
	
	public RacingCar() { //서브 클래스의 생성자입니다
		course = 0;
		System.out.println("레이싱 카가 만들어졌습니다.");
	}
	
	public void setCourse(int c) { //추가되는 메소드입니다
		course = c;
		System.out.println("코스 번호를 " + course + "(으)로 바꿉니다.");
	}
}

public class Sample1 {

	public static void main(String[] args) {
		
		RacingCar rccar1;
		rccar1 = new RacingCar(); //서브 클래스의 객체를 생성합니다
		
		rccar1.setCar(1234, 20.5); //(1) 상속받은 메소드를 호출하고 있습니다
		rccar1.setCourse(5); //(2) 추가된 메소드를 호출하고 있습니다

	}

}
