//예외와 입출력 처리 - 예외의 기본(예외를 처리하기)
package lesson14;

public class Sample2 {

	public static void main(String[] args) {
		
		try { //여기에서부터 예외 발생을 조사합니다
			
			int[] test;
			test = new int[5];
			
			System.out.println("test[10]에 값을 대입합니다.");
			
			test[10] = 80; //배열의 길이를 넘어서는 예외가 발생하면...  
			System.out.println("test[10]에 80을 대입했습니다.");
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("배열 길이를 넘어섰습니다.");
			
			System.out.println("무사히 종료했습니다.");
			
		}
		//이 블록 안의 코드가 실행됩니다

	}

}
