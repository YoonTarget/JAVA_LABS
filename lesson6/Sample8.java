package lesson6; //여러 번 반복하기

import java.io.*;

public class Sample8 { //if 문 등과 조합하기

	public static void main(String[] args) throws IOException {
		
		System.out.println("숫자를 입력해 주세요.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		boolean bl = false;
		for(int i =0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				if(bl == false) {
					System.out.print("♥");
					bl = true;
				}
				else {
					System.out.print("♡");
					bl = false;
				}
			}
			System.out.print("\n");
		}

	}

}
