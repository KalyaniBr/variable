package types_of_variables;

public class local_and_globalV {
int i=10;  //global variable


public void m1() 
{
	int j=20; //local variable
	System.out.println(j);
	System.out.println(i);
}
public void m2() {
	int k=30;  //local variable
	System.out.println(k);
	System.out.println(i);
	System.out.println(k);
}
public static void m3() {
	int k=2;
	System.out.println(k);
}
}