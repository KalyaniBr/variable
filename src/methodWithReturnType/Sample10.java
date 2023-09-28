package methodWithReturnType;

public class Sample10 {

	public static void main(String[] args) {
		Sample10 s9=new Sample10();
	int g=s9.add(10,40);
	System.out.println(g);
	
	System.out.println(s9.add(9, 6));
	
	System.out.println("-----------");
	
	int r=mul(10,20);
	System.out.println(r);
	
	System.out.println(mul(5,6));
	
	
	
	}
	public int add(int a,int b) 
	{
	int c=a+b;
	return c;
	
	}
	public static int mul(int x,int y) 
	{
   int d  =x*y;
   return d;
	}
	
}
