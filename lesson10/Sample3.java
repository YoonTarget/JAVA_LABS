//클래스 이용 - 문자를 검색하기
package lesson10;

import java.io.*;

public class Sample3 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("문자열을 입력하십시오.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine(); //검색할 문자열을 입력받습니다
		
		System.out.println("안녕하십니까. 검색어를 입력하십시오.");
		
		String str2 = br.readLine();
		char ch = str2.charAt(0);
		
		int num = str1.indexOf(ch); //검색할 문자를 입력받습니다
		
		if(num != -1) {
			System.out.println(str1 + "의 " + (num + 1) + "번째에서 '" + str2 +
					"'(을)를 발견했습니다."); //발견된 문자의 위치를 출력합니다
		}
		else {
			System.out.println(str1 + "에서 '" + ch +
					"'(을)를 찾을 수 없었습니다."); //문자를 찾지 못했을 때의 처리입니다
		}

	}

}
