package lesson6; //여러 번 반복하기

import java.io.*;

public class Sample11 { //continue 문으로 블록 시작 부분으로 돌아가기

	public static void main(String[] args) throws IOException {
		
		System.out.println("몇 번째 처리를 건너뛰시겠습니까?");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		for(int i = 1; i <= 10; i++) {
			if(i == res) {
				continue;
			}
			System.out.println(i+ "번째 처리입니다.");
		}

	}

}
