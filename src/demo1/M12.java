package demo1;

public class M12 {
public static void main(String[] args) {
	J1(2,3);
	J1(4,5);
	J1(6,7);
	J1(7,8);
	M12 O1=new M12();
	O1.B1(3,4);
	O1.B1(5,6);
	O1.B1(6,7);
}
public void B1(int q,int d)
{
	System.out.println(q+d);
	System.out.println(q*d);
	System.out.println(q/d);
	System.out.println(q-d);
	System.out.println(q*d-q);
}
public static void J1(int e ,int f)
{
System.out.println(e+f);
System.out.println(e*f);
System.out.println(e/f);
System.out.println(e-f);

}
}