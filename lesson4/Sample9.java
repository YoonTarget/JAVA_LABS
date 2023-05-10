package lesson4; //식과 연산자

public class Sample9 { //형 변환(작은 사이즈의 형에 대입하기)

	public static void main(String[] args) {
		
		double dnum = 160.5;
		System.out.println("키는 " + dnum + "센티미터입니다.");
		System.out.println("int형 변수에 대입합니다.");
		int inum = (int) dnum; //캐스트 연산자
		
		System.out.println("키는 " + inum + "센티미터입니다.");

	}

}
