package lesson6; //여러 번 반복하기

import java.io.*;

public class Exercise2 {
	
/*
2. 키보드로 시험 점수를 입력받은 후, 그 합계를 출력하는 코드를 작성하십시오. 0을 입력받으면 결과를 출력하도록 합니다.

시험 점수를 입력하십시오. (0으로 종료)
52
68
75
83
36
0
시험 점수의 합계는 314점 입니다. 	
*/

	public static void main(String[] args) throws IOException { 
		
		System.out.println("시험 점수를 입력하십시오. (0으로 종료)");
		
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		
		int num = 0;
		int sum = 0;
		
		do {
			String str = br.readLine();
			num = Integer.parseInt(str);
			sum += num;
		} while(num != 0);
		System.out.println("시험 점수의 합계는 " + sum + "점 입니다.");
			
	}

}
