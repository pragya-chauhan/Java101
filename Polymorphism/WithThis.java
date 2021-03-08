package Polymorphism;

public class WithThis {
	
		
		int a = 10;
		int b = 20;
		
		void f1(int a, int b) {
			this.a =  a;
			this.b = b;
		}
		
		void display() {
			System.out.println(a + " " +b);
		}
		public static void main(String[] args) {
			WithThis w = new WithThis();
			w.f1(100, 90);
			w.display();
		}

	}

