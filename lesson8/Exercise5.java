//클래스의 기본

/*
5. 다음과 같이 정수값 좌표를 나타내는 MyPoint  클래스를 작성하십시오.

필드
int x; (X 좌표)
int y; (Y 좌표)
메소드
void setX(int px); (X 좌표를 저장)
void setY(int py); (Y 좌표를 저장)
int getX(); (X 좌표를 취득)
int getY(); (Y 좌표를 취득)
 */
package lesson8;

class MyPoint {
	
	int x;
	int y;
	
	void setX(int px) {
		x = px;
		System.out.println("X 좌표의 값을 " + x + "(으)로 저장합니다.");
	}
	
	void setY(int py) {
		y = py;
		System.out.println("Y 좌표의 값을 " + y + "(으)로 저장합니다.");
	}
	
	int getX() {
		System.out.println("X 좌표를 취득합니다.");
		return x;
	}
	
	int getY() {
		System.out.println("Y 좌표를 취득합니다.");
		return y;
	}
	
	void show() {
		System.out.println("X 좌표의 값은 " + x + "이고, Y 좌표의 값은 " + y + "입니다.");
	}
}

public class Exercise5 {

	public static void main(String[] args) {
		
		MyPoint xy = new MyPoint();
		
		xy.setX(10);
		xy.setY(20);
		
		xy.getX();
		xy.getY();
		
		xy.show();
	}

}
