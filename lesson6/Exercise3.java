package lesson6; //여러 번 반복하기

public class Exercise3 {
	
/*
3. 탭 문자(\t)를 사용해서, 다음과 같이 구구단을 화면에 출력하는 코드를 작성하십시오.

1 2 3 4 5 6 7 8 9
2 4 6 8 10 12 14 16 18
3 6 9 12 15 18 21 24 27
4 8 12 16 20 24 28 32 36
5 10 15 20 25 30 35 40 45
6 12 18 24 30 36 42 48 54
7 14 21 28 35 42 49 56 63
8 16 24 32 40 48 56 64 72
9 18 27 36 45 54 63 72 81  	
*/
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.print(i * j + "\t");
			}
			System.out.println();
		}

	}

}
