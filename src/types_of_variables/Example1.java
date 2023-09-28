package types_of_variables;

public class Example1 {
int a;
static int b;
	String s;
	
	public void x1() {
		System.out.println(s);
		System.out.println(b);
		System.out.println(a);
	}
	
	public static void main(String[] args) {
    Example1 copy1=new Example1();	
		copy1.a=100;
		copy1.s="Jayashri";
		Example1.b=50;
		copy1.x1();
		
		Example1 copy2=new Example1();
		copy2.a=50;
		copy2.s="Jayashri";
		Example1.b=50;
		copy2.x1();
		
		Example1 copy3=new Example1();
		copy3.a=70;
		copy3.s="Jayashri";
		Example1.b=80;
		copy3.x1();
		

	}
	
	
}
