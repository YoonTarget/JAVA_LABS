package lesson7; //배열

import java.io.*;

public class Sample2 { //배열 요소의 개수를 입력하기

	public static void main(String[] args) throws IOException {
		
		System.out.println("시험 응시자 수를 입력하십시오.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		int[] test;
		test = new int[num];
		
		System.out.println("시험 응시자 수만큼 점수를 입력하십시오.");
		
		for(int i = 0; i < num; i++) {
			str = br.readLine();
			int tmp = Integer.parseInt(str);
			test[i] = tmp;
		}
		
		for(int i = 0; i < num; i++) {
			System.out.println((i + 1) + "번째 사람의 점수는 " + test[i] + "점 입니다.");
		}
	
	}

}
