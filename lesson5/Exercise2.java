package lesson5; //경우에 따른 처리

/*
키보드로 정수 값을 입력받은 후, 상황에 따라 다음과 같은 메시지를 출력하는 코드를 작성하십시오.
 값이 짝수인 경우 -- 'O(은)는 짝수입니다.'
 값이 홀수인 경우 -- 'O(은)는 홀수입니다.'
 (단, O은 입력한 정수)
 
정수를 입력하십시오.
1
1(은)는 홀수입니다. 
*/

import java.io.*;

public class Exercise2 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("정수를 입력하십시오.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		if((res%2)==0) {
			System.out.println(res + "(은)는 짝수입니다.");
		}
		else {
			System.out.println(res + "(은)는 홀수입니다.");
		}

	}

}
