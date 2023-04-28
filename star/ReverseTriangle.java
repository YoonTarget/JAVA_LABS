package star;

public class ReverseTriangle {

	public static void main(String[] args) {
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < i; j++ ) {
				System.out.print(" ");
			}
			for(int j = 0; j < 7 - 2*i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
