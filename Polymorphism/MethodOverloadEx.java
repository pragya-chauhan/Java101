package Polymorphism;

public class MethodOverloadEx {
	
	void f1(int a, int b) {
		System.out.println(a + b);
	}
	
	void f1(String c, String d) {
		System.out.println(c + d);
	}
	void f1(int e, int f , int g) {
		System.out.println(e + f+g);
	}
	public static void main(String[] args) {
		MethodOverloadEx mo = new MethodOverloadEx();
	mo.f1("djfk", "hdsj");
		mo.f1(2,3);
		mo.f1(2, 8, 5);
	}
}
