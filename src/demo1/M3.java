package demo1;

public class M3 {
	public static void main(String[] args) {
		Ex1(10,2);
		Ex1(5,2);
		Ex1(6,7);
		M3 copy=new M3();
		copy.Ex2(10,2);
		copy.Ex2(20,2);
}
public static void Ex1(int m,int n)
{
	System.out.println(m+n);
	System.out.println(m-n);
	System.out.println(m*n);
}
public void Ex2 (int c,int d)
{
	System.out.println(c-d);
	System.out.println(c+d);
    System.out.println(c/d);
	System.out.println(c*d);
}
}