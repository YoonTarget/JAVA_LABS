//클래스 이용 - 인수로 클래스 형 변수 사용하기
package lesson10;

//자동차 클래스
class Car2 {
	private int num;
	private double gas;
	private String name; //클래스 형 변수를 사용한 필드입니다
	
	public Car2() {
		num = 0;
		gas = 0.0;
		name = "무명";
		System.out.println("자동차가 만들어졌습니다.");
	}
	
	public void setCar2(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량 번호를 " + num +
				"(으)로, 연료 양을 " + gas + "(으)로 바꿉니다.");
	}
	
	public void setName(String nm) { //클래스 형의 변수를 가인수로 받는 메소드입니다
		name = nm;
		System.out.println("차량 명을 " + name + "(으)로 바꿉니다.");
	}
	
	public void show() {
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연료 양은 " + gas + "입니다.");
		System.out.println("차량 명은 " + name + "입니다.");
	}
}

public class Sample8 {

	public static void main(String[] args) {
		
		Car2 car1;
		car1 = new Car2();
		car1.show();
		
		int number = 1234;
		double gasoline = 20.5;
		String str = "1호차";
		
		car1.setCar2(number, gasoline);
		car1.setName(str); //문자열 객체를 가리키는 변수를 실인수로 지정합니다
		
		car1.show();
		
	}

}
