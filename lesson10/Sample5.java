//클래스 이용 - 최댓값 조사하기
package lesson10;

import java.io.*;

public class Sample5 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("정수를 2개 입력하십시오.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2); //정수를 2개 준비합니다
		
		int ans = Math.max(num1, num2); //최댓값을 조사합니다
		
		System.out.println(num1 + "(와)과 " + num2 + " 중 큰 쪽은 " + ans + "입니다.");
		
	}

}
