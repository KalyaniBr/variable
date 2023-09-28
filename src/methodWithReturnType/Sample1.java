package methodWithReturnType;

public class Sample1 {

	public static void main(String[] args) {
		int num3=add(10,20);
		System.out.println(num3);

		
		System.out.println("------------");
		System.out.println(add(30,40));
		
		System.out.println("-----------");
		
	Sample1 s1=new Sample1();
	int num4=s1.mul(2, 3);
	System.out.println(num4);
		
	System.out.println("-------------------");	
	System.out.println(s1.mul(4, 5));
	
	int f=Sample1a.M("nitin");
	System.out.println(f);
	
	System.out.println("--------------------");
	
	System.out.println(Sample1a.M("Kalyani"));
		
	}
	public static int add(int a,int b) 
	{
		int num1=a+b;
		return num1;
	}
	
	public int mul(int a,int b) {
		int num2=a*b;
		return num2;
	}
	
}
