//클래스의 기능

/*
5. 다음과 같이 정수값 좌표를 표현하는 MyPoint 클래스를 작성하십시오. 좌표축의 범위는 0~100 사이가 되어야 합니다.

필드
private int x; (X 좌표)
private int y; (Y 좌표)
메소드
public void setX(int px); (X 좌표를 저장)
public void setY(int py); (Y 좌표를 저장)
public int getX(); (X 좌표를 취득)
public int getY(); (Y 좌표를 취득)
생성자
public MyPoint(); (초기 좌표를 (0, 0)으로 한다)
public MyPoint(int px, int py); (초기 좌표를 지정)
 */
package lesson9;

class MyPoint {
	private int x;
	private int y;
	
	public MyPoint() {
		x = 0;
		y = 0;
	}
	
	public MyPoint(int px, int py) {
		if(px >= 0 && px <= 100) {
			x =px;
		}
		else {
			x = 0;
		}
		
		if(py >= 0 && py <= 100) {
			y =py;
		}
		else {
			y = 0;
		}
	}
	
	public void setX(int px) {
		if(px >= 0 && px <= 100) {
			x = px;
		}
	}
	
	public void setY(int py) {
		if(py >= 0 && py <= 100) {
			y = py;
		}
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
}

public class Exercise5 {

	public static void main(String[] args) {
		
		MyPoint xy = new MyPoint();
		xy.setX(10);
		xy.setY(5);
		
		int xx = xy.getX();
		int yy = xy.getY();
		
		System.out.println("xy의 x 좌표는 " + xx + ", y 좌표는 "
		+ yy + "입니다.");
		
		MyPoint xy2 = new MyPoint(20, 10);
		int xx2 = xy2.getX();
		int yy2 = xy2.getY();
		
		System.out.println("xy2의 x 좌표는 " + xx2 + ", y 좌표는 "
				+ yy2 + "입니다.");
		
	}

}
