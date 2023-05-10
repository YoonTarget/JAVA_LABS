package lesson5; //경우에 따른 처리

/*
키보드로 정수 값을 입력받은 후, 다음과 같은 메시지를 출력하는 코드를 작성하십시오.
 값이 0~10인 경우 -- '정답입니다.'
 그렇지 않은 경우 -- '오답입니다.'
 
0에서 10까지의 수를 입력하십시오.
1
정답입니다. 
*/

import java.io.*;

public class Exercise4 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("0에서 10까지의 수를 입력하십시오.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		if (res >= 0 && res <= 10) {
			System.out.println("정답입니다.");
		}
		else {
			System.out.println("오답입니다.");
		}

	}

}
