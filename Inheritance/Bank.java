package Inheritance;

//HAS-A relationship
//generate constructors using fields
public class Bank {
	int acc_no;
	String bank_name;
	String ifsc;

	public Bank(int acc_no, String bank_name, String ifsc) {
		//super(); not using
		this.acc_no = acc_no;
		this.bank_name = bank_name;
		this.ifsc = ifsc;
	}
}
