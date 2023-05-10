package lesson4; //식과 연산자

import java.io.*;

public class Sample6 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("정수 3개를 입력하십시오.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		String str3 = br.readLine();
		
		int sum = 0;
		sum += Integer.parseInt(str1); // == sum = sum + Integer.parseInt(str1);
		sum += Integer.parseInt(str2); // == sum = sum + Integer.parseInt(str2);
		sum += Integer.parseInt(str3); // == sum = sum + Integer.parseInt(str3); 
		
		System.out.println("3개 정수의 합은 " + sum + "입니다.");

	}

}
