package staticregmethod1;

public class Callfromsameclass1 {
public static void main(String[] args) {
	Line1();
	Callfromsameclass1 object=new Callfromsameclass1();
	object.Line2();
}
public static void Line1() {
	System.out.println("Kalyani Bramhankar");
	
}
public void Line2() {
	System.out.println("Jayashri Bramhankar");
	
}
}

