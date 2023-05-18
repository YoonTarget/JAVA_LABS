//클래스의 기능

/*
2. 다음 코드는 어디가 잘못되었습니까? 틀린 곳이 있으면 고치십시오.
 */
package lesson9;

class Car_2 {
	public static int sum = 0;
	
	private int num;
	private double gas;
	
	public Car_2() {
		num = 0;
		gas = 0.0;
		sum++;
		System.out.println("자동차가 만들어 졌습니다.");
	}
	
	public void setCar_2(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량 번호를 " + num + "(으)로, 연료 양을 "
		+ gas + "(으)로 바꾸었습니다.");
	}
	
	public static void showSum() {
		System.out.println("자동차가 모두 " + sum + "대 있습니다.");
		//show(); //클래스 메소드 안에서는 인스턴스 메소드에 접근할 수 없다
	}
	
	public void show() {
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연료 양은 " + gas + "입니다.");
	}
}

public class Exercise2 {

	public static void main(String[] args) {
		
		

	}

}
