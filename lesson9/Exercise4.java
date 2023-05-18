//클래스의 기능

/*
4. 다음 코드의 실행 결과와 맞는 숫자를 (1)~(3)에 넣으십시오.

인수 (1)의 생성자입니다. == 0
인수 (2)의 생성자입니다. == 0
인수 (3)의 생성자입니다. == 1
 */
package lesson9;

class A1 {
	A1() {
		System.out.println("인수 0의 생성자입니다.");
	}
	A1(int a) {
		this();
		System.out.println("인수 1의 생성자입니다.");
	}
}

public class Exercise4 {

	public static void main(String[] args) {
		
		A1 a1 = new A1();
		A1 a2 = new A1(10);

	}

}
