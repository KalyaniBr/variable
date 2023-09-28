package types_of_variables;

public class sg7 {
static int d=25;
public static void main(String[] args) {
	System.out.println(d);  //static vari. call from same class
 // printing statement(variable name)
	
	sg7 J=new sg7(); //static variable call from same class of non static method of 
	J.u();  //create object
	        //  ojectname.methodname();
	sg8 k =new sg8();
	k.f();	
	System.out.println(sg8.b);
}public static void i() {
	System.out.println(d);
}
public void u() {
	System.out.println(d);
}
}
