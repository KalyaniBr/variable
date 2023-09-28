package methodWithReturnType;


public class Sample8 {
public static void main(String[] args) {
	Sample8 s8=new Sample8();
 int s	=s8.X1(10, 100);
	System.out.println(s);
	
	System.out.println(s8.X1(5, 10));
	System.out.println("--------------------");
	
float j	=X2(8,10);
	System.out.println(j);
	
	System.out.println(X2(3,9));
}
public int X1(int x,int y) 
{
 int z	=x*y;
	return z;
}
public static float X2(float f,int d) 
{
 float k=f+d;
 return k;
}

}
