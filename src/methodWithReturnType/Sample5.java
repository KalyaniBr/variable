package methodWithReturnType;

public class Sample5 {
public static void main(String[] args) {
	
	int e=sub(2,3);
	System.out.println(e);
	
	System.out.println(sub(5,4));
	
	Sample5 s5=new Sample5();
	 int y =s5.add(3, 6);
	 System.out.println(y);
	 
	 System.out.println(s5.add(5, 7));
}

public int add(int a,int b) 
{
	int x =a+b;
	return x;
}
public static int sub(int a,int b)
{
	 int y =a-b;
	 return y;
}
public static int name(String f) {
    int d=f.length();
    return d;
}

}
