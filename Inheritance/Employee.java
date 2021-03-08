package Inheritance;
//HAS-A relation without extends
public class Employee {
	int emp_id;
	String name;
	Bank bank;

	public Employee(int emp_id, String name, Bank bank) {
		// super();
		this.emp_id = emp_id;
		this.name = name;
		this.bank = bank;
	}
	
	void display() {
		System.out.println(name);
		System.out.println(emp_id);
		System.out.println(bank.acc_no + " " + bank.bank_name);
	}
	public static void main(String[] args) {
		Bank b1 = new Bank(2343, "fjd", "jdskjg94");
		Bank b2 = new Bank(1234, "BOB", "djigsdj134");
		Employee e1 = new Employee(120, "Pragya", b1);
		e1.display();
	}

}
