package nonstaticmethods1;

public class Fromsameclass2 {
public static void main(String[] args) {
	// non static regular method call from same class
	Fromsameclass2 O1=new Fromsameclass2(); //step1: create object in same class
	
//classname.objectname=new class name-->syntax
	
	O1.L1();
	//objectname.methodname();
//
	O1.L2();
	O1.L3();
}

public void L1()  //non static method
{
	System.out.println("Jayashri");
}
public void L2()
{
	System.out.println("Ramkrushna");
}
public void L3()
{
	System.out.println("Bramhankar");
}
}