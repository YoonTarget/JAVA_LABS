package lesson7; //배열

public class Exercise3 { //3. 다음과 같은 결과가 나오도록 가~사 중에서 알맞은 코드를 고르십시오.	
	
/*
1번째 사람의 점수는 80입니다.
2번째 사람의 점수는 60입니다.
3번째 사람의 점수는 22입니다.
4번째 사람의 점수는 50입니다.
5번째 사람의 점수는 75입니다.
6번째 사람의 점수는 100입니다.	

(가) 0 (나) 1 (다) 5 (라) 6 (마) i (바) i + 1 (사) i++
*/

	public static void main(String[] args) {
		
		int[] test = {80, 60, 22, 50, 75, 100};
		
		for(int i = 0; i < 6; i++) {
			System.out.println((i + 1) + "번째 사람의 점수는 " + test[i] + "입니다.");
		}

	}

}
