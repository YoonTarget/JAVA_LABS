package lesson6; //여러 번 반복하기

public class Sample7 { //for 문을 중첩하기

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("i는 " + i + " : " + "j는 " + j);
			}
		}

	}

}
