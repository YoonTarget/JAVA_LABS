//예외와 입출력 처리 - 입출력의 기본(파일에 출력하기)
package lesson14;

import java.io.*;

public class Sample7 {

	public static void main(String[] args) {
		
		try {
			PrintWriter pw = new PrintWriter // (3) 한 줄씩 기록하기 위해 준비합니다
					(new BufferedWriter(new FileWriter("test1.txt" /*(1) 파일 이름을 입력하여 표준 입력을 사용하기 위한 문자 스트림을 생성합니다*/))); // (2) 버퍼를 경유하여 읽어들입니다
			
			pw.println("Hello!");
			pw.println("Good Bye!");
			// (4) 한 줄씩 기록합니다
			System.out.println("파일에 기록되었습니다.");
			
			pw.close(); // (5) 파일을 닫습니다
		}
		catch(IOException e) {
			System.out.println("입출력 에러가 발생했습니다.");
		}

	}

}
