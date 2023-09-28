package combinationofallmethods;

public class Sample1 {
public static void main(String[] args) {
	L1();
	Sample2.L3();
	Sample1 copy1=new Sample1();
	copy1.L2();
	Sample2 copy2=new Sample2();
	copy2.L4();
}
public static void L1()
{
	System.out.println("Running from same class 1");
}
public void L2()
{ 
	System.out.println("Running from same class 2");
}
}
