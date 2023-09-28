package demo1;

public class N7 {
public static void main(String[] args) {
	Line1("Kalyani");
	line2("Ritesh","Bramhankar");
	N7 Book=new N7();
	Book.line3("Dipesh",35,'D',89.67f);
			
}
public static void Line1(String s) {
	System.out.println(s);
	
}
public static void line2(String fn, String ln) {
	System.out.println(fn+" "+ln);
}
public void line3(String a,int b,char c, float d) {
	System.out.println(a+" "+b+" "+c+" "+d);
	
}
}
