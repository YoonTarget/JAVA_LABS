package lesson7; //배열

import java.io.*;

public class Exercise4 { //4. 키보드로 시험 점수를 입력받은 후, 다음처럼 출력하는 코드를 작성하십시오.
	
/*
5명의 시험 점수를 입력하십시오.
80
60
57
50
22
1번째 사람의 점수는 80점 입니다.
2번째 사람의 점수는 60점 입니다.
3번째 사람의 점수는 57점 입니다.
4번째 사람의 점수는 50점 입니다.
5번째 사람의 점수는 22점 입니다.
가장 높은 점수는 80점 입니다. 	
*/

	public static void main(String[] args) throws IOException {
		
		System.out.println("시험 응시 인원수를 입력하십시오.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		int[] test = new int[num];
		
		System.out.println(num + "명의 시험 점수를 입력하십시오.");
		
		for(int i = 0; i < num; i++) {
			str = br.readLine();
			test[i] = Integer.parseInt(str);
		}
		
		for(int i = 0; i < test.length; i++) {
			System.out.println((i + 1) + "번째 사람의 점수는 " + test[i] + "점 입니다.");
		}
		
		for(int j = 0; j < test.length - 1; j++) {
			for(int k = j + 1; k < test.length; k++) {
				if(test[k] > test[j]) {
					int tmp = test[k];
					test[k] = test[j];
					test[j] = tmp;
				}
			}
		}
		System.out.println("가장 높은 점수는 " + test[0] + "점 입니다.");

	}

}
