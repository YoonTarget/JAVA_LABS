package star;

public class Heart {

	public static void main(String[] args) {
		
		System.out.println();
		
		for(int i = 0; i < 5; i++) {
			if(i < 1) {
				for(int j = 0; j < 2; j++) {
					System.out.print(" **");
				}
			} else {
				for(int j = 0; j < i - 1; j++) {
					System.out.print(" ");
				}
				for(int j = 0; j < 9 - 2*i; j++) {
					System.out.print("*");
				}
			}
			System.out.println();	
		}

	}

}
