//예외와 입출력 처리 - 입출력의 기본(파일로 입력하기)
package lesson14;

import java.io.*;

public class Sample9 {

	public static void main(String[] args) {
		
		try {
			BufferedReader br =
					new BufferedReader(new FileReader("test2.txt"));
			
			int[] test = new int[8];
			String str;
			
			for(int i = 0; i < test.length; i++) {
				str = br.readLine();
				test[i] = Integer.parseInt(str);
			}
			
			int max = test[0];
			int min = test[0];
			for(int i = 0; i < test.length; i++) {
				if(max < test[i]) {
					max = test[i];
				}
				if(min > test[i]) {
					min = test[i];
				}
				System.out.println(test[i]);
			}
			
			System.out.printf("최고 점수는 %d 입니다.", max);
			System.out.println();
			System.out.printf("최저 점수는 %d 입니다.", min);
			// 최고점과 최저점을 출력합니다
			
			br.close();
			
		}
		catch(IOException e) {
			System.out.println("입출력 에러가 발생했습니다.");
		}

	}

}
