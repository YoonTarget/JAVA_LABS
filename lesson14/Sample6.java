//예외와 입출력 처리 - 입출력의 기본(화면과 키보드로 입력하고 출력하기)
package lesson14;

import java.io.*;

public class Sample6 {

	public static void main(String[] args) {
		
		try {
			BufferedReader br = 
					new BufferedReader // (2) 버퍼를 경유하여 읽어들입니다
					(new InputStreamReader(System.in)); // (1) 표준 입력을 사용하여 문자 스트림을 작성합니다
			
			System.out.println("문자열을 입력하십시오.");
			String str = br.readLine(); // (3) 1행을 읽어들입니다
			
			System.out.println(str + "(이)가 입력되었습니다.");
		}
		catch(IOException e) {
			System.out.println("입출력 에러가 발생했습니다.");
		}
	
	}

}
