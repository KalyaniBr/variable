package demo1;

public class M4 {
	public static void main(String[] args) {
	

	D1(1,2);
	M4 V1=new M4();
	V1.D2(3,4);

}
public static void D1 (int f, int g)
{
	System.out.println( f+g);
	System.out.println(f*g);
}
public void D2(int S,int P)
{
	System.out.println(S+P);
	System.out.println(S*P);
	System.out.println(S/P);
	System.out.println(S-P);
}
}