//대규모 프로그램의 작성 - 임포트(import 문 사용하기)
package lesson13.b;

import lesson13.c.Car; //임포트 하면...

public class Sample6 {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.show(); //패키지 이름을 생략하고 사용할 수 있습니다

	}

}
