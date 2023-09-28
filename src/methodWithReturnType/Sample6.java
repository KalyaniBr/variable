package methodWithReturnType;

public class Sample6 
{
public static void main(String[] args) 
{
	
	boolean r =M1("Dipesh","Ritesh");
	System.out.println(r);
	
	System.out.println(M1("Smita","Sneha"));
	
	System.out.println("-------------------------");
	
	Sample6 s6=new Sample6();
	int e  =s6.M2(55, 65);
	  System.out.println(e);
}
public static boolean M1(String s,String d)
{
	boolean f=s.equals(d);
	return f;
}

public int M2(int a,int b) 
{
int h=a+b;
return h;
}
}
