//클래스 이용

/*
2. StringBuffer 클래스의 reverse() 메소드를 사용하여 다음과 같이 출력되는 코드를 작성하시오.

문자열을 입력하십시오.
Hello
Hello를 거꾸로 읽으면 olleH입니다.
 */

package lesson10;

import java.io.*;

public class Exercise2 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("문자열을 입력하십시오.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		
		StringBuffer sb = new StringBuffer(str1);
		sb.reverse();
		
		System.out.println(str1 + "을 거꾸로 읽으면 " + sb + " 입니다.");

	}

}
