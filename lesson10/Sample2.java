//클래스 이용 - 대문자와 소문자를 변환하기
package lesson10;

import java.io.*;

public class Sample2 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("영문자를 입력하십시오.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		String stru = str.toUpperCase(); //대문자로 변환합니다
		String strl = str.toLowerCase(); //소문자로 변환합니다
		
		System.out.println("대문자로 변환하면 " + stru + "입니다.");
		System.out.println("소문자로 변환하면 " + strl + "입니다.");

	}

}
