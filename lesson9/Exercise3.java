//클래스의 기능

/*
3. 다음 설명에 대해 O 또는 X로 답하십시오.

(1) 클래스 A 밖에서 필드 a에 접근할 수 없다. == X
(2) 클래스 A 밖에서 필드 b에 접근할 수 없다. == O
(3) 클래스 A 밖에서 메소드 d에 접근할 수 있다.  == O
 */
package lesson9;

class A {
	public static int a = 0;
	private int b;
	
	public A() {
		
	}
	
	public void d(int n) {
		b = n;
	}
}

public class Exercise3 {

	public static void main(String[] args) {
		
		

	}

}
