//클래스의 기능 - 클래스 외부에서 내부의 멤버에 접근하기
package lesson9;

//자동차 클래스
class Car {
	int num;
	double gas; //필드입니다
	
	void show() {
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연료 양은 " + gas + "입니다."); //메소드의 정의(definition)입니다
	}
}

public class Sample1 {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		
		car1.num = 1234;
		car1.gas = 20.5; //차량 번호와 연료의 양을 설정합니다
		car1.show();

	}

}
