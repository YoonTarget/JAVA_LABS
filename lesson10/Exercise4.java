//클래스 이용

/*
4. Math 클래스의 메소드를 사용하여 다음과 같이 출력되는 코드를 작성하십시오.

정수를 2개 입력하십시오.
5
10
5와(과) 10 중 작은 쪽은 5입니다.
 */

package lesson10;

import java.io.*;

public class Exercise4 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("정수를 2개 입력하십시오.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		int ans = Math.min(num1, num2);
		
		System.out.println(num1 + "와(과 )" + num2 + " 중 작은 쪽은 " + ans + "입니다.");

	}

}
