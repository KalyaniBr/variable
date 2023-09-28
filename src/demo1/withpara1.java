package demo1;

public class withpara1 {
public void n1(int a,String b) {
	System.out.println(a);
	System.out.println(b);
	System.out.println(a+b);
}
	
	public static void n2(String j, String k) {
		
		System.out.println(j);
		System.out.println(k);
	}
	
	public static void main(String[] args) {
		n2("Kalyani","Bramhankar");
		withpara1 copy1=new withpara1();
		copy1.n1(10,"I am Happy");
		
		
		
	}
	
	
	
	
	
	
}
