//������ - �������� �⺻(������ �⵿��Ű��)
package lesson15;

class Car2 extends Thread { //Thread Ŭ������ Ȯ���մϴ�
	
	private String name;
	
	public Car2(String nm) {
		
		name = nm;
		
	}
	
	public void run() {
		
		for(int i = 0; i< 5; i++) {
			System.out.println(name + "(��)�� �����ϰ� �ֽ��ϴ�.");
		}
		
	}
	
}

public class Sample2 {

	public static void main(String[] args) {
		
		Car2 car1 = new Car2("1ȣ��");
		car1.start(); //�����带 �⵿��ŵ�ϴ�
		
		Car2 car2 = new Car2("2ȣ��");
		car2.start(); //�� �ٸ� �����带 �⵿��ŵ�ϴ�
		
		for(int i = 0; i < 5; i++) {
			System.out.println("main() �޼ҵ� �������Դϴ�.");
		}

	}

}
