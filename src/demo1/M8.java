package demo1;

public class M8 {
	public static void main(String[] args) {
		A1(2,2);
		A1(5,6);
		System.out.println("From non static methods");
		M8 J=new M8();
		J.A2(8,9);
	}
public static void A1(int k, int l)
{
	System.out.println(k/l);
	System.out.println(k-l);
	System.out.println(k+l);
	System.out.println(k*l);

}
public void A2 (int l,int m)
{
	System.out.println(m/m);
	System.out.println(m/l);
	System.out.println(m+l);
	System.out.println(l+l);
	System.out.println(m*m);

}
}