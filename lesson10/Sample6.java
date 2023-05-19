//클래스 이용 - 클래스 형 변수에 대입하기
package lesson10;

//자동차 클래스
class Car {
	private int num;
	private double gas;
	
	public Car() {
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어 졌습니다");
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량 번호를 " + num +
				"(으)로, 연료 양을 " + gas + "(으)로 바꾸었습니다.");
	}
	
	public void show() {
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연료 양은 " + gas + "입니다.");
	}
}

public class Sample6 {

	public static void main(String[] args) {
		
		Car car1; //car1을 선언했습니다
		System.out.println("car1을 선언했습니다.");
		car1 = new Car(); //객체를 1개 생성해서 변수 car1에 대입했습니다
		car1.setCar(1234, 20.5);
		
		Car car2; //car2를 선언했습니다
		System.out.println("car2를 선언했습니다.");
		
		car2 = car1; //car2에 car1을 대입했습니다
		System.out.println("car2에 car1을 대입했습니다.");
		
		System.out.println("car1이 가리키는 ");
		car1.show();
		
		System.out.println("car2가 가리키는 ");
		car2.show();

	}

}
