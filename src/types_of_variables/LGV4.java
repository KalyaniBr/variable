package types_of_variables;

public class LGV4 {
int s =100;
String k="Kalyani";
public void L1() {
	System.out.println(s); //can direct usee non stas. vari. innon stat. method
	System.out.println(k);
}
public static void L2() {
	LGV4 C=new LGV4();
System.out.println(C.k);// For non static global vari.we ned to create obj in static method
System.out.println(C.s);
}
public static void main(String[] args) {
	L2();  //call for static method
	LGV4 H=new LGV4 (); //call for non static method
	H.L1();
	LGV4 m=new LGV4(); // call of nonstatic variable directly from main method
	System.out.println(m.s);
	System.out.println(m.k);
}	
}

	

