package Polymorphism;
//tricky
public class WithoutThis {
	
	int a = 10;
	int b = 20;
	
	void f1(int a, int b) {
		a =  a;
		b = b;
	}
	
	void display() {
		System.out.println(a + " " +b);
	}
	public static void main(String[] args) {
		WithoutThis w = new WithoutThis();
		w.f1(100, 90);
		w.display();
	}

}
