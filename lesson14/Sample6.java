//���ܿ� ����� ó�� - ������� �⺻(ȭ��� Ű����� �Է��ϰ� ����ϱ�)
package lesson14;

import java.io.*;

public class Sample6 {

	public static void main(String[] args) {
		
		try {
			BufferedReader br = 
					new BufferedReader // (2) ���۸� �����Ͽ� �о���Դϴ�
					(new InputStreamReader(System.in)); // (1) ǥ�� �Է��� ����Ͽ� ���� ��Ʈ���� �ۼ��մϴ�
			
			System.out.println("���ڿ��� �Է��Ͻʽÿ�.");
			String str = br.readLine(); // (3) 1���� �о���Դϴ�
			
			System.out.println(str + "(��)�� �ԷµǾ����ϴ�.");
		}
		catch(IOException e) {
			System.out.println("����� ������ �߻��߽��ϴ�.");
		}
	
	}

}
