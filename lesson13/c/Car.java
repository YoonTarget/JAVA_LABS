//��Ը� ���α׷��� �ۼ� - ��Ű���� ���(�ٸ� ��Ű�� ���� Ŭ���� ����ϱ�)
package lesson13.c; //Car Ŭ������ lesson13.c ��Ű���� ���Խ�ŵ�ϴ�

//�ڵ��� Ŭ����
public class Car { //Car Ŭ������ �ٸ� ��Ű���� Ŭ�������� ����� �� �ְ� ����ϴ�
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
