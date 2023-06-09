package cooperation;

public class Subway {
	
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		passengerCount++;
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println("지하철 " + lineNumber + "호선의 승객은 " + passengerCount + 
					"명이고, 수입은 " + money + "원입니다.");
	}

}
