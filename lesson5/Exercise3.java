package lesson5; //경우에 따른 처리

/*
키보드로 2개의 정수값을 입력받은 후, 경우에 따라 다음과 같은 메시지를 출력하는 코드를 작성하십시오.
 값이 같은 경우 -- '두 숫자는 같습니다.'
 그렇지 않은 경우 -- 'O보다 X이 큽니다.'
 (단, O,X는 입력한 정수) O < X)
 
2개의 정수를 입력하십시오.
1
3
1보다 3이 큽니다. 
*/

import java.io.*;

public class Exercise3 {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("2개의 정수를 입력하십시오.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		if(num1 == num2) {
			System.out.println("두 숫자는 같습니다.");
		}
		else if(num1 < num2) {
			System.out.println(num1 + "보다 " + num2 + "(이)가 큽니다.");
		}
		else {
			System.out.println(num1 + "보다 " + num2 + "(이)가 작습니다.");
		}
	}

}
