//���ܿ� ����� ó�� - ������� �⺻(���Ͽ� �Է��ϱ�)
package lesson14;

import java.io.*;

public class Sample8 {

	public static void main(String[] args) {
		
		try {
			BufferedReader br = 
					new BufferedReader(new FileReader("test1.txt" /*(1) ���� �̸��� �Է��Ͽ� ǥ�� �Է��� ����ϱ� ���� ���� ��Ʈ���� �����մϴ�*/)); // (2) ���۸� �����Ͽ� �о���Դϴ�
			
			String str1 = br.readLine();
			String str2 = br.readLine();
			// (3) 1���� �о���Դϴ�
			
			System.out.println("���Ͽ� ��ϵ� 2���� ���ڿ��� ");
			System.out.println(str1 + "��");
			System.out.println(str2 + "�Դϴ�.");
			
			br.close();
		}
		catch(IOException e) {
			System.out.println("����� ������ �߻��߽��ϴ�.");
		}

	}

}
