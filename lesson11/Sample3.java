//새로운 클래스 - protected 멤버에 접근하기
package lesson11;

class Car3 {
	protected int num;
	protected double gas; //슈퍼 클래스 멤버의 접근 제한자를 protected로 변경했습니다
	
	public Car3() {
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}
	
	public void setCar3(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량 번호를 " + num +
				", 연료 양을 " + gas + "(으)로 바꿉니다.");
	}
	
	public void show() {
		System.out.println("차량 번호는 " + num + ", 연료 양은 " + gas + "입니다.");
	}
}

//레이싱 카 클래스
class RacingCar3 extends Car3 {
	private int course;
	
	public RacingCar3() {
		course = 0;
		System.out.println("레이싱 카가 만들어졌습니다.");
	}
	
	public void setRacingCar3(int c) {
		course = c;
		System.out.println("코스 번호를 " + course + "(으)로 바꿉니다.");
	}
	
	public void newShow() { //슈퍼 클래스의 protected 멤버에 접근할 수 있습니다
		System.out.println("레이싱 카의 차량 번호는 " + num + ", 연료 양은 " + gas +
				", 코스 번호는 " + course + "입니다.");
	}
}

public class Sample3 {

	public static void main(String[] args) {
		
		RacingCar3 rccar1;
		rccar1 = new RacingCar3();
		
		rccar1.newShow();

	}

}
