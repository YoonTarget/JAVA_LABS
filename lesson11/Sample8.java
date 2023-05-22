//새로운 클래스 - equals() 메소드 사용하기
package lesson11;

//자동차 클래스
class Car8 {
	protected int num;
	protected double gas;
	
	public Car8() {
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}
}

public class Sample8 {

	public static void main(String[] args) {
		
		Car8 car1 = new Car8();
		Car8 car2 = new Car8(); //car1과 car2는 서로 다른 객체를 가리킵니다
		
		Car8 car3;
		car3 = car1; //car1과 car3는 같은 객체를 가리킵니다
		
		boolean bl1 = car1.equals(car2);
		boolean bl2 = car1.equals(car3);
		
		System.out.println("car1과 car2가 같은지 조사한 결과, " + bl1 + " 였습니다.");
		System.out.println("car1과 car3가 같은지 조사한 결과, " + bl2 + " 였습니다.");

	}

}
