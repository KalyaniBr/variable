package demo1;

public class M9 {
	public static void main(String[] args) {
		d1(1,2);
		d1(2, 3);
		d1(4,5);
		System.out.println(" Call from diff class");
		M9 k1=new M9();
		k1.d2(8, 9);
		k1.d2(7, 9);
		k1.d2(8, 3);
		k1.d2(12, 15);
		k1.d2(47, 39);

	}
public static void d1(int p, int q)
{
	System.out.println(p+q);
	System.out.println(p*q);
	System.out.println(q*q);
	System.out.println(p-q);

}
public void d2(int t,int u)
{
	System.out.println(t+u);
	System.out.println(t/t);
	System.out.println(t*u);
	System.out.println(t-u);

}
}