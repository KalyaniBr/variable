package types_of_variables;

public class static_global_V3 {

	static int g=50;
	public static void main(String[] args) {
	System.out.println(g);
	static_global_V3 dup=new static_global_V3();
		dup.f1();
		System.out.println(static_globalV4.t);
		static_globalV4 copy=new static_globalV4();
		copy.u2();
		
	}
	public void f1() {
		System.out.println(g);
		
	}
	public static void f2() {
		System.out.println(g);
		
	}
}

