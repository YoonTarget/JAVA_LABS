package lesson6; //여러 번 반복하기

import java.io.*;

public class Sample3 { //입력한 수만큼 *를 출력하기

	public static void main(String[] args) throws IOException {
		
		System.out.println("몇 개의 *을 출력하시겠습니까?");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		for(int i = 1; i <= num; i++) {
			System.out.print("*");
		}

	}

}
