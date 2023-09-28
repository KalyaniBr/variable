package methodWithReturnType;


public class Sample3 {
public static void main(String[] args) {
  int x	=sub(50,30);
	System.out.println(x);
	
	System.out.println(sub(20,10));
	System.out.println("-------------------------------");
	
	Sample3 s3=new Sample3();
	    int y =s3.div(50, 5);
	System.out.println(y);
	
	System.out.println(s3.div(20,4));
	
	System.out.println("----------------------------------");
	
	    String e=  Sample4.add("Kalyani", "Bramhankar");
	    System.out.println(e);
	    
	    System.out.println(Sample4.add("GM", "GN"));
	    
	    System.out.println("-------------------");
	    
	    Sample4 s4=new Sample4();
	   int z= s4.T("Jayashri");
	   System.out.println(z);
	   
	   System.out.println(s4.T("Ritesh"));
}
	
public static int sub(int a,int b) 
{
	int i= a-b;
	return i; 
}

public int div(int c,int d) 
{
	
	int w=c/d;
	return w;
}




	
}
