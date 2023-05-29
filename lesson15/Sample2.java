//스레드 - 스레드의 기본(스레드 기동시키기)
package lesson15;

class Car2 extends Thread { //Thread 클래스를 확장합니다
	
	private String name;
	
	public Car2(String nm) {
		
		name = nm;
		
	}
	
	public void run() {
		
		for(int i = 0; i< 5; i++) {
			System.out.println(name + "(이)가 동작하고 있습니다.");
		}
		
	}
	
}

public class Sample2 {

	public static void main(String[] args) {
		
		Car2 car1 = new Car2("1호차");
		car1.start(); //스레드를 기동시킵니다
		
		Car2 car2 = new Car2("2호차");
		car2.start(); //또 다른 스레드를 기동시킵니다
		
		for(int i = 0; i < 5; i++) {
			System.out.println("main() 메소드 실행중입니다.");
		}

	}

}
