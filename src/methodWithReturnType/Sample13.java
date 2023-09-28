package methodWithReturnType;

public class Sample13 {
public static void main(String[] args) 
{
	Sample13 s13=new Sample13();
boolean b=s13.name("Kalyani", "KALYANI");
	System.out.println(b);
	
	String u=name2("tester","DEVELOPER");
	System.out.println(u);
	
	//From diff class
	
	int q=Sample13a.name4(10,20);
	System.out.println(q);
	
	Sample13a s13a=new Sample13a();
 int r=s13a.name3("ababaa");
	System.out.println(r);
}

public boolean name(String w,String x) 
{
 boolean t=w.equalsIgnoreCase(x);
 return t;
}
public static String name2(String j,String k) 
{
	String f=j.toUpperCase();
			return f;
	}





}

