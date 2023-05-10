package lesson4; //식과 연산자

/*
키보드로 삼각형의 밑변과 높이를 정수로 입력받은 후, 다음과 같이 넓이를 출력하는 코드를 작성하십시오.
(힌트 : 삼각형의 넓이 = (높이 * 밑변) / 2)

삼각형의 밑변과 높이를 입력하십시오.
3
5
삼각형의 넓이는 7.5입니다.
*/

import java.io.*;

public class Exercise4 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("삼각형의 밑변과 높이를 입력하십시오.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		double num1 = Double.parseDouble(str1);
		double num2 = Double.parseDouble(str2);
		
		double result = (num1 * num2) / 2;
		
		System.out.println("삼각형의 넓이는 " + result + "입니다.");

	}

}
