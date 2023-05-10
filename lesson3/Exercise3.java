package lesson3; //변수

import java.io.*;

public class Exercise3 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("당신은 몇 살입니까?");
		
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int num = Integer.parseInt(str);
		
		System.out.println("당신은 " + num + "살입니다.");

	}

}
