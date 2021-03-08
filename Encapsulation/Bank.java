package Encapsulation;
//To genetrate getters and setters use SOurce>Generate Get() and Set and format
public class Bank {
	private int acc_no;
	private String bank_name;
	private String ifsc;

	public int getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
}
