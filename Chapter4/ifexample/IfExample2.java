package ifexample;

public class IfExample2 {

	public static void main(String[] args) {
		
		System.out.println("혀니랜드에 오신 것을 환영합니다!!");
		int age = 27;
		int charge = 0;
		
		if(age < 8) {
			System.out.println("미취학 아동입니다.");
		}
		else if(age < 14) {
			System.out.println("초등학생입니다.");
			charge = 1000;
		}
		else if(age < 17) {
			System.out.println("중학생입니다.");
			charge = 2000;
		}
		else if(age < 20) {
			System.out.println("고등학생입니다.");
			charge = 3000;
		}
		else if(age == 27) {
			System.out.println("예쁜 리니공주입니다.");
		}
		else {
			System.out.println("성인입니다.");
			charge = 4000;
		}
		System.out.println("입장료는 " + charge + "원입니다.");

	}

}
