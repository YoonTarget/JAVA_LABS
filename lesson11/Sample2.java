//새로운 클래스 - super()를 호출하기
package lesson11;

//자동차 클래스
class Car2 {
	private int num;
	private double gas;
	
	public Car2() {
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}
	
	public Car2(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량 번호가 " + num +
				 ", 연료 양이 " + gas + "인 자동차가 만들어졌습니다.");
	}
	
	public void setCar2(int n, double g) {
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

class RacingCar2 extends Car2 {
	private int course;
	
	public RacingCar2() {
		course = 0;
		System.out.println("레이싱 카가 만들어졌습니다.");
	}
	
	public RacingCar2(int n, double g, int c) {
		super(n, g); //슈퍼 클래스에 존재하는 두 개의 인수를 받는 생성자가 호출되도록 합니다
		course = c;
		System.out.println("코스 번호가 " + course + "인 레이싱 카가 만들어졌습니다.");
	}
	
	public void setRacingCar2(int c) {
		course = c;
		System.out.println("코스 번호를 " + course + "(으)로 바꿉니다.");
	}
}

public class Sample2 {

	public static void main(String[] args) {
		
		RacingCar2 rccar1 = new RacingCar2(1234, 20.5, 5); //서브 클래스에 존재하는 세 개의 인수를 받는 생성자가 호출되도록 합니다

	}

}
