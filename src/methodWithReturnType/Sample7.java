package methodWithReturnType;

public class Sample7 {
 public static void main(String[] args) {
	
	Sample7 s7=new Sample7();
 long L1	=s7.Q1(1234, 406);
	System.out.println(L1); 
	 
	System.out.println(s7.Q1(60,70));
	
	double x=Q2(48.48,94.48);
	System.out.println(x);
	
	System.out.println(Q2(67.967,647.757));
	
	System.out.println("---From diff class-------");
	
	Sample7a Sa=new Sample7a();
	String v = Sa.M3("Ja","Ka");
	System.out.println(v);
	
	System.out.println(Sa.M3("Jayash", "Kalyan"));
	
String u=Sample7a.M4("WELCOME");
	System.out.println(u);
	
	System.out.println(Sample7a.M4("GOODBYE"));
}
 
 public long Q1(long l,long k)
 {
	long a=l+k;
	return a;
}
 
 public static double Q2(double x,double y) 
 {
	double d=x+y;
	return d;
}
 
 
}
