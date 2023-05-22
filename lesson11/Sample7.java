//새로운 클래스 - toString() 메소드 오버라이딩하기
package lesson11;

//자동차 클래스
class Car7 {
	protected int num;
	protected double gas;
	
	public Car7() {
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량 번호를 " + num + ", 연료 양을 " + gas + "(으)로 바꿉니다.");
	}
	
	public String toString() { //toString() 메소드를 정의합니다
		String str = "차량 번호: " + num + ", 연료 양: " + gas; //이 문자열을 반환합니다
		return str;
	}
}

public class Sample7 {

	public static void main(String[] args) {
		
		Car7 car1 = new Car7();
		car1.setCar(1234, 20.5);
		
		System.out.println(car1); //toString() 메소드의 반환 값이 사용됩니다

	}

}
