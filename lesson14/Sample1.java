//예외와 입출력 처리 - 예외의 기본(배열의 길이를 넘어서는 위치에 값을 대입시키기)
package lesson14;

public class Sample1 {

	public static void main(String[] args) {
		
		int[] test;
		test = new int[5];
		
		System.out.println("test[10]에 값을 대입합니다.");
		
		test[10] = 80; //배열 요소의 개수를 초과합니다. 따라서 예외가 발생합니다.
		System.out.println("test[10]에 80을 대입했습니다."); //이 코드는 실행되지 않습니다
		System.out.println("무사히 종료했습니다.");

	}

}
