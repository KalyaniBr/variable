package demo1;

public class M16 {
public static void main(String[] args) {
	demo(2,5);
	M16 dup=new M16();
	dup.sample(5,4);
	
	
}
public static void demo(int a,int b) {
	System.out.println(a+b);
	
}
public void sample(int d,int c) {
	System.out.println(c*d);
	
}
}
