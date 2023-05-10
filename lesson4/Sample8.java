package lesson4; //식과 연산자

public class Sample8 { //형 변환(큰 사이즈의 형에 대입하기)

	public static void main(String[] args) {
		
		int inum = 160;
		
		System.out.println("키는 " + inum + "센티미터입니다.");
		
		System.out.println("double형 변수에 대입합니다.");
		double dnum = inum; // 작은 데이터형 변수를 큰 데이터형 변수에 대입
		
		System.out.println("키는 " + dnum + "센티미터입니다.");

	}

}
