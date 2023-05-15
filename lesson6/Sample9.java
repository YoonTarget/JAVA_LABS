package lesson6; //여러 번 반복하기

import java.io.*;

public class Sample9 { //break 문으로 블록에서 빠져나가기

	public static void main(String[] args) throws IOException {
		
		System.out.println("몇 번째에서 루프를 빠져 나가시겠습니까? (1~10)");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i + "번째 처리입니다.");
			if(i == res) {
				break;
			}
			System.out.println("hi");
		}
		System.out.println("out");

	}

}
