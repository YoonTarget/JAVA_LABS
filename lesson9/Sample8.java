//클래스의 기능 - 클래스 변수와 클래스 메소드를 작성하기
package lesson9;

//자동차 클래스
class Car8 {
	public static int sum = 0; //클래스 변수입니다
	private int num;
	private double gas;
	
	public Car8() {
		num= 0;
		gas = 0.0;
		sum++; //생성자가 호출될 때, 클래스 변수 sum의 값을 1 증가시킵니다
		System.out.println("자동차가 만들어 졌습니다.");
	}
	
	public void setCar8(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량 번호를 " + num + "(으)로, 연료 양을 "
		+ gas + "(으)로 바꿉니다.");
	}
	
	public static void showSum() { //클래스 메소드입니다
		System.out.println("자동차는 모두 " + sum + "대 있습니다.");
	}
	
	public void show() {
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연료 양은 " + gas + "입니다.");
	}
}

public class Sample8 {

	public static void main(String[] args) {
		
		Car8.showSum(); //클래스 메소드를 호출합니다
		
		Car8 car1 = new Car8(); //객체를 생성합니다
		car1.setCar8(1234, 20.5);
		car1.show();
		
		Car8.showSum(); //다시 한 번 메소드를 호출합니다
		
		Car8 car2 = new Car8();
		car2.setCar8(4567, 30.5);
		car2.show();
		
		Car8.showSum();
		
		

	}

}
