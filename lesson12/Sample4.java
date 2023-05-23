//인터페이스 - 2개 이상의 인터페이스 구현하기
package lesson12;

//탈 것 인터페이스
interface iVehicle2 {
	void vShow(); //iVehicle의 추상 메소드입니다
}

//목재 인터페이스
interface iMaterial {
	void mShow(); //iMaterial의 추상 메소드입니다
}

//자동차 클래스
class Car4 implements iVehicle2, iMaterial { //2개 이상의 인터페이스를 구현할 수 있습니다
	private int num;
	private double gas;
	
	public Car4(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량 번호가 " + num + ", 연료 양이 " + gas + "인 자동차가 만들어졌습니다.");
	}
	
	public void vShow() {
		System.out.println("차량 번호는 " + num + ", 연료 양은 " + gas + "입니다.");
		//iVehicle 메소드를 정의합니다
	}
	
	public void mShow() {
		System.out.println("자동차의 재질은 철입니다.");
		//iMaterial 메소드를 정의합니다
	}
}

public class Sample4 {

	public static void main(String[] args) {
		
		Car4 car1 = new Car4(1234, 20.5);
		car1.vShow();
		car1.mShow();

	}

}
