package Logical_Programs;

public class Ex2_reverseString {
public static void main(String[] args) {
	
	// 1st way--using concatination operator
	
	String str="ABCD";
	String rev=  " " ;    // -->to store reverse num
	
	
	for(int i=str.length()-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
	}
	
	System.out.println(rev);
}
}
