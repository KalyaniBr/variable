package nonstaticmethods2;

public class nonstatic1 {
public void m1() {
	System.out.println("Welcome Home");
	
	System.out.println("Thank You");
	System.out.println("Take Care");
}
	
	public void m2() {
		System.out.println("Weldone");
		System.out.println("How are you doing");
		
	}
	
	public static void main(String[] args) {
		nonstatic1 copy1=new nonstatic1();
		copy1.m1();
		copy1.m2();
		nonstatic2 copy2=new nonstatic2();
		copy2.m3();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
