//��Ը� ���α׷��� �ۼ� - Ŭ������ ��Ű���� ���Խ�Ű��
package lesson13.a; //��Ű���� ���Խ�ŵ�ϴ�

//�ڵ��� Ŭ����
class Car2 { //�� Ŭ������ ��Ű�� lesson13.a�� ���Ե˴ϴ�
	private int num;
	private double gas;
	
	public Car2() {
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

public class Sample2 { //�� Ŭ������ ��Ű�� lesson13.a�� ���Ե˴ϴ�

	public static void main(String[] args) {
		
		Car2 car1 = new Car2();
		car1.show();

	}

}
