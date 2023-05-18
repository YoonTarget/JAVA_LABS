//클래스의 기능 - 멤버에 대한 접근을 제한하기
package lesson9;

//자동차 클래스
class Car2 {
	private int num;
	private double gas; //필드를 private 멤버로 만들었습니다
	
	public void setNumGas(int n, double g) { //메소드는 public 멤버로 만들었습니다
		if(g > 0 && g < 1000) { //전달된 값을 조사해서...
			num = n;
			gas = g; //올바른 값이면 저장합니다
			System.out.println("차량 번호를 " + num + "(으)로, 연료 양을 "
			 + gas + "(으)로 바꾸었습니다.");
		}
		else {
			System.out.println(g + "(은)는 올바른 연료 양이 아닙니다.");
			System.out.println("연료 양을 바꿀 수 없습니다."); //잘못된 값을 저장할 수 없도록 막고 있습니다
		}
	}
	
	public void show() {
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연료 양은 " + gas + "입니다.");
	}
}

public class Sample2 {

	public static void main(String[] args) {
		
		Car2 car1 = new Car2();
		
		//이러한 접근은 불가능합니다.
		//car1.num = 1234;
		//car1.gas = -10.0; //private 멤버에는 접근할 수 없습니다
		
		car1.setNumGas(1234, 20.5); //반드시 public 멤버를 호출하여 값을 저장해야 합니다
		car1.show();
		
		System.out.println("잘못된 연료 양(-10.0)을 저장하겠습니다....");
		
		car1.setNumGas(1234, -10.0); //잘못된 값을 저장하려 할 지라도...
		car1.show();

	}

}
