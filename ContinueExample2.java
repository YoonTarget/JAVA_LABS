package loopexample;

public class ContinueExample2 {

	public static void main(String[] args) {
		
		int dan = 2;
		int times = 1;
		
		while(dan <= 9) {
			if((dan % 2) != 0) {
				dan++;
				continue;
			}
			times = 1;
			while(times <= 9) {
				System.out.println(dan + "X" + times + "=" + dan*times);
				times++;
			} 
			dan++;
			System.out.println();
		
		/*
		int dan;
		int times;
		
		for(dan = 2; dan <= 9; dan++) {
			if((dan % 2) != 0) {
				continue;
			}
			for(times = 1; times <= 9; times++) {
				System.out.println(dan + "X" + times + "=" + dan*times);
			}
			System.out.println();
		*/
		}

	}

}
