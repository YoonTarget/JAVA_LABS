//클래스의 기능 - 생성자가 호출됨
package lesson9;

//자동차 클래스
class Car4 {
	private int num;
	private double gas;
	
	public Car4() { //생성자의 정의입니다
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}
	
	public void show() {
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연료 양은 " + gas + "입니다.");
	}
}

public class Sample4 {

	public static void main(String[] args) {
		
		Car4 car1 = new Car4(); //객체가 생성되면 생성자가 호출됩니다
		
		car1.show();

	}

}
