package types_of_variables;

public class NS5 {
int O= 60;
String S="Welcome";
  public void r1() {
	System.out.println(S);
	System.out.println(O);
}
public static void r2() {
	NS5 J=new NS5();
	System.out.println(J.S);
	System.out.println(J.O);
	
}
public static void main(String[] args) {
	NS5 F=new NS5();
	System.out.println(F.S);
	System.out.println(F.O);
	NS5 J=new NS5();
	J.r1();
	r2();
	NS5 k=new NS5();
	System.out.println(k.S);
	System.out.println(k.O);
	
}




}
