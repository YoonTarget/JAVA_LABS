package lesson7; //배열

public class Sample4 { //배열을 초기화하기

	public static void main(String[] args) {
		
		int[] test = {80, 60, 22, 50, 75};
		
		for(int i = 0; i < 5; i++) {
			System.out.println((i + 1) + "번째 사람의 점수는 " + test[i] + "점 입니다.");
		}

	}

}
