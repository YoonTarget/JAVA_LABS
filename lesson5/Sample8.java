package lesson5; //경우에 따른 처리

import java.io.*;

public class Sample8 { //조건 연산자 사용하기

	public static void main(String[] args) throws IOException {
		
		System.out.println("Which course would you like to choose?");
		System.out.println("please, Enter an Integer.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		/*
		char ans;
		if(res == 1) {
			ans = 'A';
		}
		else {
			ans = 'B';
		}
		*/
		
		char ans = (res == 1)? 'A': 'B';
		
		System.out.println("You chose course " + ans + ".");

	}

}
