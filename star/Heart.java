package star;

public class Heart {

	public static void main(String[] args) {
		
		System.out.println();
		
		int n = 7;
		
		for(int i = 0; i < n; i++) {
			if(i < 1) {
				for(int j = 0; j < 2*n - 4; j++) {
					if(j < 1) {
						System.out.print(" ");
					} else if(j == n - 2) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
			} else {
				for(int j = 0; j < i - 1; j++) {
					System.out.print(" ");
				}
				for(int j = 0; j < (2*n - 1) - 2*i; j++) {
					System.out.print("*");
				}
			}
			System.out.println();	
		}

	}

}
