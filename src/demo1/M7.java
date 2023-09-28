package demo1;

public class M7 {
	public static void main(String[] args) {
		Line1(2,10);
		Line1(3,4);
		Line1(5,6);
		System.out.println("Operations of non ststic method");
		M7 G1=new M7();
		G1.Line2(4,5);
		G1.Line2(6, 7);
	}
public static void Line1 (int a, int b)
{
	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(a*b);
	System.out.println(a/b);
}
public void Line2 (int c,int d)
{
	System.out.println(c+d);
	System.out.println(c-d);
	System.out.println(c*d);
	System.out.println(c/d);

}
}

