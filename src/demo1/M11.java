package demo1;

public class M11 {
	public static void main(String[] args) {
	K1(2,3);
	K1(5,6);
	K1(6,7);
	K1(8,8);
	M11 S2=new M11 ();
	S2.K2(6, 7);
	S2.K2(9, 10);
	
}

public static void K1( int a, int b)
{
	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(a*b);
	System.out.println(a/b);
}
public void K2(int n, int m)
{
	System.out.println(n+m);
	System.out.println(n-m);
	System.out.println(m/n);
	System.out.println(m*n);
}
}
