package demo1;

public class Methodswithparameter {
	public static void main(String[] args) {
	

 Methodswithparameter kalyani=new Methodswithparameter ();
  kalyani.line('A','D',"Hello",80);
	}
 public void line (char a,char b,String c, int d)
 {
	 System.out.println(a+" "+ b);
	 System.out.println(a+c);
	 System.out.println(c+d);
	 System.out.println(a+" "+d);
	 System.out.println(a+ " "+b +" "+c+d);
 }
	
}