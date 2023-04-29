package star;

public class Diamond {

	public static void main(String[] args) {
		
		int n = 4;
		
		for(int i = 0; i < 2*n - 1; i++) {
			if(i < n) {
				for(int j = 0; j < (n - 1) - i; j++) {
					System.out.print(" ");
				}
				for(int j = 0; j < 2*i + 1; j++) {
					System.out.print("*");
				}
			} else {
				for(int j = 0; j < i - (n - 1); j++) {
					System.out.print(" ");
				}
				for(int j = 0; j < (4*n - 3) - 2*i; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
