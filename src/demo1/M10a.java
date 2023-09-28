package demo1;

public class M10a {
	public static void main(String[] args) {
		S1(12,13);
		S1(56,9);
		S1(7,9);
		System.out.println("Running from same class");
		M10a f=new M10a();
		f.S2(123,67);
		f.S2(67,87);
		f.S2(6, 78);

	}
public static void S1(int a, int b)
{
	System.out.println("call from same class");
	System.out.println(a+b);
	System.out.println(a*b);
	System.out.println(a/b);
	System.out.println(a-b);
}
	public void S2(int r,int u)
	{
		System.out.println(r+u);
		System.out.println(r-u);
		System.out.println(r*u);
		System.out.println(r/u);
		System.out.println(u+u);
		System.out.println(r+r);

	}

	

}
