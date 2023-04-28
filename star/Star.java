package star;

public class Star {

	public static void main(String[] args) {
		/*
		System.out.println("   *");
		System.out.println("  ***");
		System.out.println(" *****");
		System.out.println("*******");
        */
		/*
		String star = "*";
		String blank = " ";
		for(int i = 1; i <= 7; i++) {
			if(i % 2 == 0) {
				continue;
			} 
			System.out.println(blank + star);
		}System.out.println("");
		*/
		/*
		for(int i = 1; i < 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		*/
		/*
		for(int i = 1; i < 5; i++) {
			for(int j = 4; j > 0; j--) {
				if(j > i) {
					System.out.print(" ");
				} 
				else {
					System.out.print("*");
				}
			}System.out.println();
		}
		*/
		/*
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3 - i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 2*i + 1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		/*
		for(int i = 0; i < 7; i++) {
			if(i < 4) {
				for(int j = 0; j < 3 - i; j++) {
					System.out.print(" ");
				}
				for(int j = 0; j < 2*i + 1; j++) {
					System.out.print("*");
				}				
			} else {
				for(int t = 0; t < i - 3; t++) {
					System.out.print(" ");
				}
				for(int t = 0; t < 13 - 2*i ; t++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		*/
		System.out.println();
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 6; j++) {
				if(i < 1) {
					if((j % 3) == 0) {
						System.out.print(" **");
					}
				} else {
					for(j = 0; j < i - 1; j++) {
						System.out.print(" ");
					}
					for(j = 0; j < 9 - 2*i; j++) {
						System.out.print("*");
					}
					break;
				}
			}
			System.out.println();
		}
	}

}
