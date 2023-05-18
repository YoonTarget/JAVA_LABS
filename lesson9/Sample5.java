//클래스의 기능 - 생성자를 오버로딩하기
package lesson9;

//자동차 클래스
class Car5 {
	private int num;
	private double gas;
	
	public Car5() { //인수 없는 생성자입니다
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}
	
	public Car5(int n, double g) { //인수를 2개 가지는 생성자입니다
		num = n;
		gas = g;
		System.out.println("차량 번호가 " + num + "이며, 연료 양이 "
		+ gas + "인 자동차가 만들어 졌습니다.");
	}
	
	public void show() {
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연료 양은 " + gas + "입니다.");
	}
}

public class Sample5 {

	public static void main(String[] args) {
		
		Car5 car1 = new Car5(); //인수 없는 생성자가 호출됩니다
		car1.show();
		System.out.println("인수 없는 생성자가 출력한 문구입니다.");
		
		Car5 car2 = new Car5(1234, 20.5); //2개의 인수를 가지는 생성자가 호출됩니다
		car2.show();
		System.out.println("인수가 2개인 생성자가 출력한 문구입니다.");

	}

}
