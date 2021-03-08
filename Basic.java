
public class Basic {
	
	int a = 10;	//instance variable
	void f1(int b, int c) //formal parameters
	{ //function that contains implementation is function definition
		//a, b, c are local variables
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	Basic(){ //Default Constructor called first when objects are created even if those objects are not used const will be used obviously, before printing values
		System.out.println("Default COnt");
	}
	Basic(int d , int e){
		System.out.println("Paramet COnst");
		System.out.println(d+e);
	}
	public static void main(String[] args) {
//class, (reference variable used to hold object's value) = new operator used for object creation, constructor used to create object 
//object creation		
		Basic x1 = new Basic(), x2 = new Basic(),x3 = new Basic(), x4 = new Basic(100,200);
//method call
		x1.f1(20,30);
		//actual or original parameters
		System.out.println(x1.a);
		//Basic obj2 = new Basic();
		x2.a = 100;
		System.out.println(x2.a);
	}

}

//linking method call to function def is called binding
