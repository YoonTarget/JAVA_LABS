//클래스의 기능 - 인스턴스 변수와 인스턴스 메소드 작성하기
package lesson9;

//자동차 클래스
class Car7 {
	private int num;
	private double gas; //이 필드들은 인스턴스 변수입니다

	public Car7() {
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어 졌습니다.");
	}
	
	public void setCar7(int n, double g) { //이 메소드는 인스턴스 메소드입니다
		num = n;
		gas = g;
		System.out.println("차량 번호를 " + num + "(으)로, 연료 양을 "
				 + gas + "(으)로 바꾸었습니다.");
	}
	
	public void show() { //이 메소드는 인스턴스 메소드입니다
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연료 양은 " + gas + "입니다.");
	}
}

public class Sample7 {

	public static void main(String[] args) {
		
		Car7 car1 = new Car7();
		car1.setCar7(1234, 20.5); //생성된 객체의 메소드를 각각 호출합니다
		car1.show();
		
		Car7 car2 = new Car7();
		car2.setCar7(4567, 30.5); //생성된 객체의 메소드를 각각 호출합니다
		car2.show();

	}

}
