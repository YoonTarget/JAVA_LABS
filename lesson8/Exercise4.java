//클래스의 기본

/*
4. setNumGas() 메소드에 대해 설명하고 있습니다. O 또는 X로 답하십시오.

(1) 이 메소드는 2개의 인수를 받는다. == O
(2) 이 메소드는 2개의 값을 돌려준다. == X
(3) 이 메소드는 2개의 필드에 값을 저장한다. == O
 */
package lesson8;

class Car_4 {
	int num;
	double gas;
	
	void setNumGas(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량 번호를 " + num + "(으)로 , 연료 양을 " + gas + "(으)로 바꾸었습니다.");
	}
}

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
