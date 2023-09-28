package use_static_and_non_static_Variable;

public class Example3 {
int a;
static int b;
String d;
static String s;

public void x1() {
	System.out.println(a+b);
	System.out.println(d+s);	
	
}
	
	public static void main(String[] args) {
		Example3 copy1=new Example3();
		copy1.a=10;
		Example3.b=20;
		copy1.d="Kalyani";
		Example3. s="Jayashri";
		
		Example3 copy2=new Example3();
		copy2.a=50;  //Non static variable
		Example3.b=60; //static variable
		copy2.d="Bramhankar";
        Example3. s="Welcome";
		
		copy1.x1();
		copy2.x1();
		
		
		
		
		
	}
	
	
	
	
}
