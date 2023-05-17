package lesson7; //배열

public class Exercise2 { //2. 다음 코드는 어디가 잘못되었습니까? 틀린 곳이 있으면 고치십시오.

	public static void main(String[] args) {
		
		int[] test;
		test = new int[5];
		
		test[0] = 80;
		test[1] = 60;
		test[2] = 22;
		test[3] = 50;
		test[4] = 75;
		//test[5] = 100; -->  생성된 배열 요소 수를 초과하였다.
		
		for(int i = 0; i < 5; i++) {
			System.out.println((i + 1) + "번째 사람의 점수는 " + test[i] + "점 입니다.");
		}

	}

}
