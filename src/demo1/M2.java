package demo1;

public class M2 {
	public static void main(String[] args) {
		Sum(2,5);
		M2 S1=new M2();
		S1.N2(20,5);
	}
public static void Sum(int k, int m)
{
	System.out.println(k+m);
	System.out.println(k*m);
}
public void N2(int a, int b)
{
	System.out.println(a/b);
	System.out.println(a*b);
}
}