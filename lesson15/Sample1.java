//������ - �������� �⺻(������ �⵿��Ű��)
package lesson15;

class Car extends Thread { //Thread Ŭ������ Ȯ���մϴ�
	
	private String name;
	
	public Car(String nm) {
		
		name = nm;
		
	}
	
	public void run() {
		
		for(int i = 0; i< 5; i++) {
			System.out.println(name + "(��)�� �����ϰ� �ֽ��ϴ�.");
		}
		
	}
	
}

public class Sample1 {

	public static void main(String[] args) {
		
		Car car1 = new Car("1ȣ��"); //Thread Ŭ������ ���� Ŭ������ ��ü�� �����մϴ�
		car1.start(); //���ο� �����带 �⵿��ŵ�ϴ�
		
		for(int i = 0; i < 5; i++) {
			System.out.println("main() �޼ҵ� �������Դϴ�.");
		}

	}

}
