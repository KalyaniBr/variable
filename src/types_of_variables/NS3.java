package types_of_variables;

public class NS3 {
 int S=50;
 String D="Jayashri";
 
 public void Line1() {
	System.out.println(S);
	System.out.println(D);
}
 public static void F() {
	NS3 T=new NS3();
	System.out.println(T.D);
	System.out.println(T.S);
}
 public static void main(String[] args) {
	F();
	NS3 copy=new NS3();
	 copy.S=100; //we can change the value
	 copy.Line1();
	 
}
 
 
 
 
 
 
 
 
 
 
}
