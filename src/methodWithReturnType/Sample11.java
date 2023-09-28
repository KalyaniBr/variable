package methodWithReturnType;

public class Sample11 {
public static void main(String[] args) {
	
	Sample11 S11=new Sample11();
	int g=S11.add(10, 20);
	System.out.println(g);
	
	System.out.println(S11.add(11, 9));
	
	int b=mul(2,3);
	System.out.println(b);
	
	System.out.println(mul(4,5));
	
	
}
public int add(int i,int j) 
{
	int a=i+j;
	return a;
}
public static int mul(int k,int l) 
{
 int s=k*l;
 return s;
}

}
