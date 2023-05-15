package lesson6; //여러 번 반복하기

import java.io.*;

public class Sample4 { //1부터 입력한 숫자까지의 합을 구하기

	public static void main(String[] args) throws IOException {
		
		System.out.println("숫자 몇까지의 합을 구하시겠습니까?");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("1부터 " + num + "까지의 합은 " + sum + "입니다.");

	}

}
