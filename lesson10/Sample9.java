//클래스 이용 - 객체배열 다루기
package lesson10;

//자동차 클래스
class Car3 {
	private int num;
	private double gas;
	
	public Car3() {
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}
	
	public void setCar3(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량 번호를 " + num +
				"(으)로, 연료 양을 " + gas + "(으)로 바꿉니다.");
	}
	
	public void show() {
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연료 양은 " + gas + "입니다.");
	}
}

public class Sample9 {

	public static void main(String[] args) {
		
		Car3[] cars;
		cars = new Car3[3]; //배열을 준비합니다
		
		for(int i = 0; i < cars.length; i++) {
			cars[i] = new Car3(); //객체를 3개 생성하여 배열 요소에 대입합니다
		}
		
		cars[0].setCar3(1234, 20.5);
		cars[1].setCar3(2345, 30.5);
		cars[2].setCar3(3456, 40.5);
		
		for(int i = 0; i < cars.length; i++) {
			cars[i].show();
		}

	}

}
