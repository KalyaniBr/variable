package nonstaticmethods1;

public class Fromsameclass1 {
	public static void main(String[]args) {
		Fromsameclass1 A1=new Fromsameclass1();
		//classname objectname=new classname();
		A1.M1();
		A1.M2();
		A1.M3();

}
public void M1()
{
	System.out.println("Kalyani");
}
public void M2()
{
	System.out.println("Ramkrushna");
}
public void M3()
{
	System.out.println("Bramhankar");
}
}
