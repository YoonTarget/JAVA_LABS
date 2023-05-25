//���ܿ� ����� ó�� - ���� ������(���� ������)
package lesson14;

class CarException extends Exception { //�������� ���� Ŭ������ �����մϴ�
	
}

//�ڵ��� Ŭ����
class Car {
	private int num;
	private double gas;
	
	public Car() {
		num = 0;
		gas = 0.0;
		System.out.println("�ڵ����� ����������ϴ�.");
	}
	
	public void setCar(int n, double g) throws CarException { //���ܸ� ���� ���ɼ��� �ִ� �޼ҵ����� �����մϴ�
		if(g < 0) {
			CarException e = new CarException();
			throw e; //Ư�� ��Ȳ���� ���ܸ� �����ϴ�
		}
		else {
			num = n;
			gas = g;
			System.out.println("���� ��ȣ�� " + num + ", ���� ���� " + gas + "(��)�� �����մϴ�.");
		}
	}
	
	public void show() {
		System.out.println("���� ��ȣ�� " + num + ", ���� ���� " + gas + "�Դϴ�.");
	}
}

class Sample5 {
	
	public static void main(String[] args) {
	
		Car car1 = new Car();
	
		try {
			car1.setCar(1234, -10.0); //�� �ڵ带 ȣ���ϸ� ���ܰ� �������ϴ�
		}
		catch(CarException e) {
			System.out.println(e + "(��)�� ���������ϴ�.");
		}
		car1.show();
		
	}

}
