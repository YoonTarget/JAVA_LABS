//클래스 이용

/*
3. StringBuffer 클래스의 메소드를 사용하여 다음과 같이 출력되는 코드를 작성하시오.

문자열을 입력하십시오.
Hello
a가 들어갈 위치를 정수로 입력하십시오.
2
Heallo가 되었습니다. 
 */

package lesson10;

import java.io.*;

public class Exercise3 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("문자열을 입력하십시오.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		char ch = 'a';
		
		System.out.println(ch + "가 들어갈 위치를 정수로 입력하십시오.");
		
		String str2 = br.readLine();
		int num = Integer.parseInt(str2);
		
		
		StringBuffer sb = new StringBuffer(str1);
		sb.insert(num, ch);
		
		System.out.println(sb + "가 되었습니다.");

	}

}
