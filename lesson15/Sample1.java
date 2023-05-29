//스레드 - 스레드의 기본(스레드 기동시키기)
package lesson15;

class Car extends Thread { //Thread 클래스를 확장합니다
	
	private String name;
	
	public Car(String nm) {
		
		name = nm;
		
	}
	
	public void run() {
		
		for(int i = 0; i< 5; i++) {
			System.out.println(name + "(이)가 동작하고 있습니다.");
		}
		
	}
	
}

public class Sample1 {

	public static void main(String[] args) {
		
		Car car1 = new Car("1호차"); //Thread 클래스의 서브 클래스의 객체를 생성합니다
		car1.start(); //새로운 스레드를 기동시킵니다
		
		for(int i = 0; i < 5; i++) {
			System.out.println("main() 메소드 실행중입니다.");
		}

	}

}
