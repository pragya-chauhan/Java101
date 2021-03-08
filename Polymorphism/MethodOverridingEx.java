package Polymorphism;
//super keyword
class A{
	void f1(int a) {
		System.out.println("Parent Class");
	}
}
public class MethodOverridingEx extends A {

	void f1(int a) {
		super.f1(a);
		System.out.println("Child Class");
		System.out.println(a);

	}
	
	public static void main(String[] args) {
		
		MethodOverridingEx me= new MethodOverridingEx();
		me.f1(10);
	}

}
