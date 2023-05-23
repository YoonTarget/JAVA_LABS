//대규모 프로그램의 작성 - 패키지의 사용(다른 패키지 안의 클래스 사용하기)
package lesson13c; //Car 클래스를 lesson13c 패키지에 포함시킵니다

//자동차 클래스
public class Car { //Car 클래스를 다른 패키지의 클래스에서 사용할 수 있게 만듭니다
	private int num;
	private double gas;
	
	public Car() {
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량 번호를 " + num + ", 연료 양을 " + gas + "(으)로 변경합니다.");
	}
	
	public void show() {
		System.out.println("차량 번호는 " + num + ", 연료 양은 " + gas + "입니다.");
	}
}
