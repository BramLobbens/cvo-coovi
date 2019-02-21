package salarybonus;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee alex = new Employee();
		Employee linda = new Employee();
		Employee john = new Employee();
		
		linda.setSalary(1000);
		linda.setBonus(100);
		linda.calculateTotalPay();
		
		alex.setSalary(20000);
		alex.setBonus(2000);
		alex.calculateTotalPay();
	}

}
