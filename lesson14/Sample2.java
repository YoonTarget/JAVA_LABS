//���ܿ� ����� ó�� - ������ �⺻(���ܸ� ó���ϱ�)
package lesson14;

public class Sample2 {

	public static void main(String[] args) {
		
		try { //���⿡������ ���� �߻��� �����մϴ�
			
			int[] test;
			test = new int[5];
			
			System.out.println("test[10]�� ���� �����մϴ�.");
			
			test[10] = 80; //�迭�� ���̸� �Ѿ�� ���ܰ� �߻��ϸ�...  
			System.out.println("test[10]�� 80�� �����߽��ϴ�.");
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("�迭 ���̸� �Ѿ���ϴ�.");
			
			System.out.println("������ �����߽��ϴ�.");
			
		}
		//�� ��� ���� �ڵ尡 ����˴ϴ�

	}

}
