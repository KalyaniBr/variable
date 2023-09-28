package methodWithReturnType;

public class Sample12 {
public static void main(String[] args) {
	String d=name("Kalyani","Bramhankar");
	System.out.println(d);
	
	Sample12 s12=new Sample12();
	String i=s12.work("I am tester", "I am developer");
	System.out.println(i);
	
}
public static String name(String s,String j)
{
	String d=s.concat(j);
	return d;
}
public String work(String k,String u) 
{
 String f=k.replace("I am", "you are");
 return f;
 
}
}
