package use_static_and_non_static_Variable;

public class Example2 {
public static void main(String[] args) {
	
	Example1 e1=new Example1();
	e1.EmpName="Kalyani";
	e1.empID=1206;
	Example1.empCEOName="xyz";
	
	Example1 e2=new Example1();
	e2.EmpName="jayashri";
	e2.empID=14576;
	Example1.empCEOName="abc";
	
	Example1 e3=new Example1();
	e3.EmpName="Ritesh";
	e3.empID=234;
	Example1.empCEOName="lki";
	
	e1.empInfo();
	e2.empInfo();
	e3.empInfo();
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
