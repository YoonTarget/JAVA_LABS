//���ܿ� ����� ó�� - ������� �⺻(���Ͽ� ����ϱ�)
package lesson14;

import java.io.*;

public class Sample7 {

	public static void main(String[] args) {
		
		try {
			PrintWriter pw = new PrintWriter // (3) �� �پ� ����ϱ� ���� �غ��մϴ�
					(new BufferedWriter(new FileWriter("test1.txt" /*(1) ���� �̸��� �Է��Ͽ� ǥ�� �Է��� ����ϱ� ���� ���� ��Ʈ���� �����մϴ�*/))); // (2) ���۸� �����Ͽ� �о���Դϴ�
			
			pw.println("Hello!");
			pw.println("Good Bye!");
			// (4) �� �پ� ����մϴ�
			System.out.println("���Ͽ� ��ϵǾ����ϴ�.");
			
			pw.close(); // (5) ������ �ݽ��ϴ�
		}
		catch(IOException e) {
			System.out.println("����� ������ �߻��߽��ϴ�.");
		}

	}

}
