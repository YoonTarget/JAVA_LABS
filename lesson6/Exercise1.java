package lesson6; //여러 번 반복하기

public class Exercise1 {
	
/*
1. 다음과 같이 화면에 출력하는 코드를 작성하십시오.

1~10까지의 짝수를 출력합니다.
2
4
6
8
10 	
*/

	public static void main(String[] args) {
		
		System.out.println("1~10까지의 짝수를 출력합니다.");
		
		for(int i = 1; i <= 10; i++) {
			if((i % 2) == 0) {
				System.out.println(i);
			}
		}

	}

}
