//대규모 프로그램의 작성 - 클래스를 패키지에 포함시키기
package lesson13.a; //패키지에 포함시킵니다

//자동차 클래스
class Car2 { //이 클래스는 패키지 lesson13.a에 포함됩니다
	private int num;
	private double gas;
	
	public Car2() {
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

public class Sample2 { //이 클래스는 패키지 lesson13.a에 포함됩니다

	public static void main(String[] args) {
		
		Car2 car1 = new Car2();
		car1.show();

	}

}
