//예외와 입출력 처리 - 예외와 클래스(예외 정보 출력하기)
package lesson14;

public class Sample4 {

	public static void main(String[] args) {
		
		try {
			int[] test;
			test = new int[5];
			
			System.out.println("test[10]에 값을 대입합니다.");
			
			test[10] = 80; 
			
			System.out.println("test[10]에 80을 대입했습니다.");
		}
		catch(ArrayIndexOutOfBoundsException e) { //예외를 받습니다
			System.out.println("배열 길이를 넘어섰습니다.");
			System.out.println(e + "이라는 예외가 발생했습니다."); //어떤 종류의 예외인지 출력합니다
		}
		System.out.println("무사히 종료했습니다.");

	}

}
