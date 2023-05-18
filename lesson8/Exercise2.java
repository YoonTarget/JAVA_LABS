//클래스의 기본

/*
2. 다음 코드는 어디가 잘못되었습니까? 틀린 곳이 있으면 고치십시오.
 */

package lesson8;

class Car_2 {
	int num;
	double gas;
	void setNumGas(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량 번호를 " + num + "(으)로, 연료 양을 " + gas + "(으)로 바꾸었습니다.");
	}
	void show() {
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연료 양은 " + gas + "입니다.");
	}
}

public class Exercise2 {

	public static void main(String[] args) {
		
		Car_2 car1 = new Car_2();
		car1.setNumGas(1234, 20.5); // setNumGas(1234, 20.5); --> car1.setNumGas(1234, 20.5);
		car1.show();

	}

}
