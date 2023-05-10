package lesson4; //식과 연산자

/*
키보드로 사각형의 한 변의 길이를 정수로 입력받은 후, 다음과 같이 넓이를 출력하는 코드를 작성하십시오.

정사각형의 한 변의 길이를 입력하십시오.
3
정사각형의 넓이는 9입니다.
*/

import java.io.*;

public class Exercise3 { 

	public static void main(String[] args) throws IOException {
		
		System.out.println("정사각형의 한 변의 길이를 입력하십시오.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int num = Integer.parseInt(str);
		
		System.out.println("정사각형의 넓이는 " + (num * num) + "입니다.");

	}

}
