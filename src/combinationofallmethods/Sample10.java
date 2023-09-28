package combinationofallmethods;

public class Sample10 {
public static void main(String[] args) {
	Method4();
	Sample9.Method1();
	Sample10 OBJ=new Sample10();
			OBJ.Method6();
	Sample9 Page=new Sample9();
	 Page.Method2();
}

 public static void Method4()
 {
	 System.out.println("Call from same method E");
	 System.out.println("Call from same method F");
 }
 public void Method6()
 {
	 System.out.println("Call from same method G");
 }
}