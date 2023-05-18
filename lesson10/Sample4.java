//클래스 이용 - 문자열을 추가하기
package lesson10;

import java.io.*;

public class Sample4 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("문자열을 입력하십시오.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		
		System.out.println("추가할 문자열을 입력하십시오.");
		
		String str2 = br.readLine(); //추가할 문자열을 읽어들입니다
		
		StringBuffer sb = new StringBuffer(str1);
		sb.append(str2); //문자열을 추가합니다
		
		System.out.println(str1 + "에 " + str2 + "(을)를 추가하면 "
		+ sb + "입니다.");

	}

}
