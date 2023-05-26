//예외와 입출력 처리 - 입출력의 기본(파일에 입력하기)
package lesson14;

import java.io.*;

public class Sample8 {

	public static void main(String[] args) {
		
		try {
			BufferedReader br = 
					new BufferedReader(new FileReader("test1.txt" /*(1) 파일 이름을 입력하여 표준 입력을 사용하기 위한 문자 스트림을 생성합니다*/)); // (2) 버퍼를 경유하여 읽어들입니다
			
			String str1 = br.readLine();
			String str2 = br.readLine();
			// (3) 1행을 읽어들입니다
			
			System.out.println("파일에 기록된 2개의 문자열은 ");
			System.out.println(str1 + "와");
			System.out.println(str2 + "입니다.");
			
			br.close();
		}
		catch(IOException e) {
			System.out.println("입출력 에러가 발생했습니다.");
		}

	}

}
