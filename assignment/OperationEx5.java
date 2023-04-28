package assignment;

public class OperationEx5 {

	public static void main(String[] args) {
		
        /*
		int num1 = 5; //0101
		int num2 = 10; //1010
		
		int result = num1 & num2; //두 비트가 모두 1인 경우만 1, 아니면 0;
		System.out.println(result);
		
		int result = num1 | num2; //두 비트가 모두 0인 경우만 0, 아니면 1;
		System.out.println(result);
		*/
		
		int num3 = 5; //00000101
		System.out.println(num3 << 1); //00001010
		System.out.println(num3); //00000101
		System.out.println(num3 << 2); //00010100
		System.out.println(num3 << 3); //00101000
		System.out.println(num3 >> 1); //00000010
		System.out.println(num3 >> 2); //00000001
	}

}
