package loopexample;

public class WhileExample {

	public static void main(String[] args) {
		
		/*
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum += num;
			num ++;
		}
		
		do{	
			sum += num;
			num++;
		}while(num <= 10);
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
		*/
		
		int dan =2;
		int times = 1;
		
		while(dan <= 9) {
			times = 1;
			while(times <= 9) {
				System.out.println(dan + "X" + times + "=" + dan*times);
				times ++;			
			}
			dan ++;
			System.out.println();
		}
		
	}

}
