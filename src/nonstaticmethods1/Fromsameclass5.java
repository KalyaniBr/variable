package nonstaticmethods1;

public class Fromsameclass5 {
	public static void main(String[] args) {
		
		Fromsameclass5 D1=new Fromsameclass5();
		D1.R1();
		D1.R2();

}
public void R1()
{
	System.out.println(" Running From same class");
}
public void R2()
{
	System.out.println( "Running from same class 5");
}
}