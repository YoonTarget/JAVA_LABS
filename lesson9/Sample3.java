//클래스의 기능 - 메소드를 오버로딩 하기
package lesson9;

//자동차 클래스
class Car3 {
	private int num;
	private double gas;
	
	public void setCar3(int n) { //int형 인수를 가지는 메소드 입니다
		num = n;
		System.out.println("차량 번호를 " + num + "(으)로 바꾸었습니다.");
	}
	
	public void setCar3(double g) { //double형 인수를 가지는 메소드 입니다
		gas = g;
		System.out.println("연료 양을 " + gas + "(으)로 바꾸었습니다.");
	}
	
	public void setCar3(int n, double g) { //둘 이상의 인수를 가지는 메소드 입니다
		num = n;
		gas = g;
		System.out.println("차량 번호를 " + num + "(으)로, 연료 양을 "
		+ gas + "(으)로 바꾸었습니다.");
	}
	
	public void show() {
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연료 양은 " +  gas + "입니다.");
	}
}

public class Sample3 {

	public static void main(String[] args) {
		
		Car3 car1 = new Car3();
		
		car1.setCar3(1234, 20.5); //둘 이상의 인수를 가지는 메소드가 호출되었습니다
		car1.show();
		
		System.out.println("차량 번호만 변경 되었습니다.");
		car1.setCar3(2345); //int형 인수를 가지는 메소드가 호출되었습니다
		car1.show();
		
		System.out.println("연료 양만 변경 되었습니다.");
		car1.setCar3(30.5); //double형 인수를 가지는 메소드가 호출되었습니다
		car1.show();

	}

}
