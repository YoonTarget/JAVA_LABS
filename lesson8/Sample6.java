//클래스의 기본 - 반환 값을 가지는 메소드
package lesson8;

//자동차 클래스
class Car6 
{
	int num;
	double gas;

	int getNum() 
	{
		System.out.println("차량 번호를 조사했습니다.");
		return num;
	}
	
	double getGas()
	{
		System.out.println("연료 양을 조사했습니다.");
		return gas;
	}
	
	void setNumGas(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("차량 번호를 " + num + "(으)로, 연료 양을 " + gas + "(으)로 바꾸었습니다.");
	}
	
	void show()
	{
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연료 양은 " + gas + "입니다.");
	}
}

public class Sample6 
{

	public static void main(String[] args) 
	{
		
		Car6 car1 = new Car6();
		car1.setNumGas(1234, 20.5);

		int number = car1.getNum();
		double gasoline = car1.getGas();
		
		System.out.println("샘플 자동차를 조사한 결과 ");
		System.out.println("차량 번호는 " + number + ", 연료 양은 " + gasoline + "이었습니다.");
		
	}

}
