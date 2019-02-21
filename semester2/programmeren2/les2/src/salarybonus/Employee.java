package salarybonus;

public class Employee {

	double salary;
	double bonus;	
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public void calculateTotalPay() {
		double totalPay = salary + bonus;
		System.out.println("Total pay = " + totalPay);
		System.out.println("---------");
	}
}
