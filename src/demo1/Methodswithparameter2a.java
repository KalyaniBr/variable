package demo1;

public class Methodswithparameter2a {
	public static void main(String[] args) {
		Methodswithparameter2a copy=new Methodswithparameter2a();
		copy.L1("Kalyani",'a',66.78f,78);
		L2("JAYASHRI",75.5f,44,9605893245l,'G');
		Methodswithparameter2b.k2("kali", 'K', 88, 45.36f);
		Methodswithparameter2b letter=new Methodswithparameter2b();
		letter.k1(23, 'g', 98.65f, "Hii", 234.345d);
	}


public void L1( String name,char grade,float percentage,int marks) {
	System.out.println( name+grade+percentage+marks);
}
public static void L2(String X,float Y,int O,long P,char S) 
{
	System.out.println(X+Y+O+P+S);
	System.out.println(S+" "+X+ P+X+Y+O);
	System.out.println(X+O+S+Y+P);
	
}
}