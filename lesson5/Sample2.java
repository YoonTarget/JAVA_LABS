package lesson5; //경우에 따른 처리

import java.io.*;

public class Sample2 { //여러 개의 문장을 if 문 안에서 실행시키기

	public static void main(String[] args) throws IOException {
		
		System.out.println("정수를 입력하십시오.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int res = Integer.parseInt(str);
		
		if(res == 1) {
			System.out.println("1이 입력되었습니다.");
			System.out.println("1이 선택되었습니다.");
		}
		
		System.out.println("처리를 종료합니다.");

	}

}
