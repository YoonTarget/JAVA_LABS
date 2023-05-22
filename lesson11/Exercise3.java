//새로운 클래스

/*
3. 다음 코드의 실행 결과인 (1)~(8)에 올바른 알파벳이나 숫자를 넣으십시오.

(1)==A의 인수 (2)==0의 생성자입니다.
(3)==B의 인수 (4)==0의 생성자입니다.
(5)==A의 인수 (5)==1의 생성자입니다.
(7)==B의 인수 (8)==1의 생성자입니다.
 */
package lesson11;

class A {
	A() {
		System.out.println("A의 인수 0의 생성자입니다.");
	}
	A(int a) {
		System.out.println("A의 인수 1의 생성자입니다.");
	} 
}

class B extends A {
	B() {
		System.out.println("B의 인수 0의 생성자입니다.");
	}
	B(int b) {
		super(b);
		System.out.println("B의 인수 1의 생성자입니다.");
	}
}

public class Exercise3 {

	public static void main(String[] args) {
		
		B b1 = new B();
		B b2 = new B(10);
	}

}
