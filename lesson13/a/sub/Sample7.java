//��Ը� ���α׷��� �ۼ� - ����Ʈ(���� ��Ű�� �����)
package lesson13.a.sub; //���� ��Ű���� ���Խ�ŵ�ϴ�

//�ڵ��� Ŭ����
class Car {
	private int num;
	private double gas;
	
	public Car() {
		num = 0;
		gas = 0.0;
		System.out.println("�ڵ����� ����������ϴ�.");
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("���� ��ȣ�� " + num + ", ���� ���� " + gas + "(��)�� �����մϴ�.");
	}
	
	public void show() {
		System.out.println("���� ��ȣ�� " + num + ", ���� ���� " + gas + "�Դϴ�.");
	}
}

public class Sample7 {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.show();

	}

}
