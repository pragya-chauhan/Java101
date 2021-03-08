package Inheritance;
//IS-A relationship
//super class
class MarlabsStudent{
	int stipend = 30000; //instance variables
}
public class MarlabsEmployee extends MarlabsStudent {
	
	float salary = 95000;	//Instance variables
	public static void main(String[] args) {
		MarlabsEmployee me = new MarlabsEmployee();
		//sub-calss instance
		System.out.println("Stipend: "+me.stipend);
		System.out.println("Salary: " +me.salary);
	}

}
