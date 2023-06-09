//예외와 입출력 처리 - 예외 던지기(예외 던지기)
package lesson14;

class CarException extends Exception { //독자적인 예외 클래스를 선언합니다
	
}

//자동차 클래스
class Car {
	private int num;
	private double gas;
	
	public Car() {
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}
	
	public void setCar(int n, double g) throws CarException { //예외를 던질 가능성이 있는 메소드임을 선언합니다
		if(g < 0) {
			CarException e = new CarException();
			throw e; //특정 상황에서 예외를 던집니다
		}
		else {
			num = n;
			gas = g;
			System.out.println("차량 번호를 " + num + ", 연료 양을 " + gas + "(으)로 변경합니다.");
		}
	}
	
	public void show() {
		System.out.println("차량 번호는 " + num + ", 연료 양은 " + gas + "입니다.");
	}
}

class Sample5 {
	
	public static void main(String[] args) {
	
		Car car1 = new Car();
	
		try {
			car1.setCar(1234, -10.0); //이 코드를 호출하면 예외가 던져집니다
		}
		catch(CarException e) {
			System.out.println(e + "(이)가 던져졌습니다.");
		}
		car1.show();
		
	}

}
