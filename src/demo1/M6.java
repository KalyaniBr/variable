package demo1;

public class M6 {public static void main(String[] args) {
	J1(10,2);
	M6 G=new M6();
	G.J2(10,5);
}


public static void J1(int l,int m)
{
	System.out.println(l+m);
}
public void J2(int o,int p)
{
	System.out.println(o*p);
	System.out.println(p*o);
	System.out.println(p+o);
	System.out.println(p-o);
	System.out.println(p/o);
	System.out.println(p*o+o);
}
}