package lesson5; //경우에 따른 처리

/*
키보드로 1에서 5까지 5단계 성적을 입력받은 후, 경우에 따라 다음과 같은 메시지를 출력하는 코드를 작성하십시오.
성적 | 의미하는 메시지
1 | 노력합시다.
2 | 조금 더 노력합시다.
3 | 더 높은 점수를 목표로 합시다.
4 | 매우 잘했습니다.
5 | 매우 우수합니다.

정수를 입력하십시오.
3
더 높은 점수를 목표로 합시다.
*/

import java.io.*;

public class Exercise5 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("정수를 입력하십시오.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		switch(res) {
			case 1:
				System.out.println("노력합시다.");
				break;
			case 2:
				System.out.println("조금 더 노력합시다.");
				break;
			case 3:
				System.out.println("더 높은 점수를 목표로 합시다.");
				break;
			case 4:
				System.out.println("매우 잘했습니다.");
				break;
			case 5:
				System.out.println("매우 우수합니다.");
				break;
		}

	}

}
