//대규모 프로그램의 작성 - 패키지의 사용(다른 패키지로 나누기, 다른 패키지 안의 클래스 사용하기)
package lesson13.b; //Sample4의 클래스를 lesson13b 패키지에 포함시킵니다

public class Sample4 {

	public static void main(String[] args) {
		
		lesson13c.Car car1 = new lesson13c.Car(); //클래스 이름 앞에 패키지 이름을 붙입니다
		car1.show();

	}

}
