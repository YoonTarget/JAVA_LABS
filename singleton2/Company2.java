package singleton2;

public class Company2 {
	
	private static Company2 instance = new Company2();
	
	private Company2() {}
	
	public static Company2 getInstance() {
		return instance;
	}

}
