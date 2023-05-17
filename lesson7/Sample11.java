package lesson7; //배열

public class Sample11 { //길이가 일정하지 않은 다차원 배열

	public static void main(String[] args) {
		
		int[][] test = {
				{80, 60, 22, 50}, {90, 55,68, 72}, {33, 75, 63}
		};
		
		for(int i = 0; i < test.length; i++) {
			System.out.println((i + 1) + "번째 배열 요소의 길이는 " + test[i].length + "입니다.");
		}

	}

}
