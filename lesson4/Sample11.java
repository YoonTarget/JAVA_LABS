package lesson4; //식과 연산자

public class Sample11 {

	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 4;
		/*
		double div = num1 / num2; //int형으로 판별된 후, div에 대입 
		*/
		double div = (double) num1 / (double) num2; //적어도 1개의 피연산자는 캐스팅 연산자로 형 변환
		
		System.out.println("5/4는 " + div + "입니다.");

	}

}
