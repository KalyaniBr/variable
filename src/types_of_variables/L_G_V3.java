package types_of_variables;

public class L_G_V3 {
int r=199;  // global variable
public void meth1() {
	System.out.println(r);
}
public static void meth2() {
	int s=50;  // local vaiable
	System.out.println(s);
	L_G_V3 D=new L_G_V3 ();
	System.out.println(D.r);
}
public static void main(String[] args) {
	L_G_V3 F=new L_G_V3();
	F.meth1();
	meth2();
	
	
}





}
