//인터페이스

/*
2. 다음 항목에 대해 O 또는 X로 답하십시오.

(1) 클래스 A는 클래스 B를 확장한 서브 클래스이다. == O
(2) 클래스 A는 인터페이스 C를 구현하고 있다. == O
(3) 인터페이스 C는 클래스 D를 확장한 서브 인터페이스이다. == X
 */
package lesson12;

interface C extends D {
	
}

class A extends B implements C {
	
}

public class Exercise2 {

	public static void main(String[] args) {

	}

}
