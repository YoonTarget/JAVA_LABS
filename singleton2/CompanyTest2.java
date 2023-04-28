package singleton2;

public class CompanyTest2 {

	public static void main(String[] args) {
		
		Company2 c1 = Company2.getInstance();
		
		Company2 c2 = Company2.getInstance();
		
		//Company2 c3 = new Company2(); //False
		
		System.out.println(c1 == c2); //True

	}

}
