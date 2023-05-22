//새로운 클래스

/*
4. Car 클래스의 객체가 '차량 번호 ● 연료 양 ○인 자동차'라는 문구로 표현되도록 만들고, 다음과 같이 출력하는 코드도 작성하십시오.

자동차가 만들어졌습니다.
차량 번호를 1234으로, 연료 양을 20.5로 바꾸었습니다.
차량 번호 1234 연료 양 20.5인 자동차입니다.
 */
package lesson11;

class Car_4 {
	protected int num;
	protected double gas;
	
	public Car_4() {
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량 번호를 " + num + "으로, 연료 양을 " + gas + "로 바꾸었습니다.");
	}
	
	public String toString() {
		String str = "차량 번호 " + num + " 연료 양 " + gas + "인 자동차입니다.";
		return str;
	}
}

public class Exercise4 {

	public static void main(String[] args) {
		
		Car_4 car1 = new Car_4();
		car1.setCar(1234, 20.5);
		
		System.out.println(car1);
		
	}

}
