package staticregmethod1;
public class callfromsameclass {
public static void main(String[] args) {
	System.out.println("Call from same class");
	// static regular method call from same class
	A1();  //syntax-method name();
	A2();
	A3();
}
public static void A1()
{System.out.println("HELLO");
System.out.println("WORLD");
}
public static void A2()
{
	System.out.println("Welcome");
	System.out.println("Hiii");
}
public static void A3()
{
	System.out.println("Good Morning");
	System.out.println("good Evening");
}
}
