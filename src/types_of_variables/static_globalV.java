package types_of_variables;

public class static_globalV {
static int a=10;

public static void main(String[] args) 
{
	System.out.println(a); //static variable call
	
System.out.println(Sample3.b);//static variable from diff calss

static_globalV obj=new static_globalV();// object of method k2
obj.k2();
     k1();



}
public static void k1()
{
	System.out.println(a);
}
public void k2() 
{
	System.out.println(a);
}
	
	
	
}



