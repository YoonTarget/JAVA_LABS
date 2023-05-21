//새로운 클래스 - 메소드를 오버라이딩 하기
package lesson11;

class Car4 {
	protected int num;
	protected double gas;
	
	public Car4() {
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}
	
	public void setCar4(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량 번호를 " + num +
				", 연료 양을 " + gas + "(으)로 바꿉니다.");
	}
	
	public void show() { //슈퍼 클래스의 show() 메소드입니다
		System.out.println("차량 번호는 " + num + ", 연료 양은 " + gas + "입니다.");
	}
}

//레이싱 카 클래스
class RacingCar4 extends Car4 {
	private int course;
	
	public RacingCar4() {
		course = 0;
		System.out.println("레이싱 카가 만들어졌습니다.");
	}
	
	public void setCourse(int c) {
		course = c;
		System.out.println("코스 번호를 " + course + "(으)로 바꿉니다.");
	}
	
	public void show() { //서브 클래스의 show() 메소드입니다
		System.out.println("레이싱 카의 차량 번호는 " + num + ", 연료 양은 " + gas +
				", 코스 번호는 " + course + "입니다.");
	}
}

public class Sample4 {

	public static void main(String[] args) {
		
		RacingCar4 rccar1;
		rccar1 = new RacingCar4();
		
		rccar1.setCar4(1234, 20.5);
		rccar1.setCourse(5);
		
		rccar1.show(); //show() 메소드를 호출하면...

	}

}
