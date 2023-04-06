package udemy;

public class Count {
	private int countNumber;
	private String name;
	private double value;
	
	public Count(int countNumber, String name, double initialDeposit) {
		this.countNumber = countNumber;
		this.name = name;
		deposit(initialDeposit);;		
	}
	
	public Count(int countNumber, String name) {
		this.countNumber = countNumber;
		this.name = name;
	}
	public int getCountNumber() {
		return countNumber;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getValue() {
		return value;
	}
	
	public void deposit(double amount) {
		value += amount;
	}
	
	public void saque(double amount) {
		value -= amount + 5.0;
	}

	@Override
	public String toString() {
		return "account " 
				+ countNumber 
				+ ", Holder: " 
				+ name 
				+ ", Balance: $ " 
				+ String.format("%.2f", value);
	}
	
	
}
