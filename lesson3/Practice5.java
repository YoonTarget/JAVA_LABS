package lesson3;

import java.io.*;

public class Practice5 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("키와 몸무게를 입력하십시오.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		double height = Double.parseDouble(str1);
		double weight = Double.parseDouble(str2);
		
		System.out.println("키는 " + height + "센티미터입니다.");
		System.out.println("몸무게는 " + weight + "킬로그램입니다.");

	}

}
