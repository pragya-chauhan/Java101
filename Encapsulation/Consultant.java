package Encapsulation;

public class Consultant {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.setAcc_no(1234);
		b.setBank_name("BOC");
		b.setIfsc("jdifj");
		System.out.println("Acc no." + b.getAcc_no());

	}

}
