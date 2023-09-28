package types_of_variables;

public class Lg6 {
  int a=10;
	
	public void m1() {
		System.out.println(a);
	}
	public void m2() {
		int b=20;
		System.out.println(b);
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		Lg6 G=new Lg6();
		G.m1();
		G.m2();
		
	}
}
