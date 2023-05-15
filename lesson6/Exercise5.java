package lesson6; //여러 번 반복하기

import java.io.*;

public class Exercise5 {
	
/*
5. 키보드로 정수를 입력받아서, 그 수가 소수(1 또는 그 이외의 수로 나누어 떨어지지 않는 수)인지 여부를 판단하는 코드를 작성하십시오.

2 이상의 정수를 입력하십시오.
7
7은 소수입니다.

2 이상의 정수를 입력하십시오.
10
10은 소수가 아닙니다.	
*/

	public static void main(String[] args) throws IOException {
		
		System.out.println("2 이상의 정수를 입력하십시오.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		for(int i = 2; i <= num; i++) {
			if(i == num) {
				System.out.println(num + "은(는) 소수입니다.");
			}
			else if(num % i == 0) {
				System.out.println(num + "은(는) 소수가 아닙니다.");
				break;
			}
		}
		
	}

}
