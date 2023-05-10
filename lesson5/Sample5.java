package lesson5; //경우에 따른 처리

import java.io.*;

public class Sample5 { //switch 문 사용하기

	public static void main(String[] args) throws IOException {

		System.out.println("정수를 입력하십시오.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		switch(res) {
			case 1:
				System.out.println("1(이)가 입력되었습니다.");
				break;
			case 2:
				System.out.println("2(이)가 입력되었습니다.");
				break;
			default:
				System.out.println("1 또는 2(을)를 입력하십시오.");
				break;
		}

	}

}
