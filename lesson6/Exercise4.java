package lesson6; //여러 번 반복하기

public class Exercise4 {
	
/*	
4. 다음과 같이 화면에 출력하는 코드를 작성하십시오.

*
**
***
****
*****
*/

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
