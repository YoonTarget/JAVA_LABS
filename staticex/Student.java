package staticex;

public class Student {
	
	private static int serialNum = 10000;
	int studentID;
	String studentName;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}
	
	public static int getSerialNum() {
		
		int i = 10;
		i++;
		System.out.println(i); //지역변수
		
		//studentName = "홍길동"; //멤버변수, 인스턴스변수
		
		return serialNum; //static변수, 클래스변수
	}

}
