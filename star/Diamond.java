package star;

public class Diamond {

	public static void main(String[] args) {
		
		for(int i = 0; i < 7; i++) {
			if(i < 4) {
				for(int j = 0; j < 3 - i; j++) {
					System.out.print(" ");
				}
				for(int j = 0; j < 2*i + 1; j++) {
					System.out.print("*");
				}
			} else {
				for(int j = 0; j < i - 3; j++) {
					System.out.print(" ");
				}
				for(int j = 0; j < 13 - 2*i; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
