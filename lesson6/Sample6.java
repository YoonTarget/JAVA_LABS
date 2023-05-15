package lesson6; //여러 번 반복하기

public class Sample6 { //do~while 문 사용하기

	public static void main(String[] args) {
		
		int i = 1;
		
		do {
			System.out.println(i + "번째 반복입니다.");
			i++;
		} while(i <= 5);
		
		System.out.println("반복이 끝났습니다.");

	}

}
