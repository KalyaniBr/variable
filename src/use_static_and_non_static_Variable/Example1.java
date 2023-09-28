package use_static_and_non_static_Variable;

public class Example1 {

	String EmpName;
	int empID;
	static String empCEOName;
	
	public void empInfo()
	{
		System.out.println(EmpName+" "+empID+":"+empCEOName);
	}
	
	public void x1() {
		System.out.println("empCEOName"+":"+"empID"+" :"+"EmpName");
	}
	public static void main(String[] args) {
		
	
	Example1 obj=new Example1();
	obj.EmpName="Kalyani";
	obj.empCEOName="Jayashri";
	obj.empID=12345;
	
	Example1 obj1=new Example1();
	obj1.EmpName="Kayani";
	obj1.empCEOName="Jaya";
	obj1.empID=12345;

	obj.empInfo();
	obj.x1();
	
	obj1.empInfo();
	obj1.x1();

	
	}
	
	
	
	
	
	
	
	
	
	
	
}
