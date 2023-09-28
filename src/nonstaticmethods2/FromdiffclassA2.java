package nonstaticmethods2;

public class FromdiffclassA2 {
public static void main(String[] args) {
	FromdiffclassA1 Copy=new FromdiffclassA1(); //creating object of diff class 
 //diffclass objectname=new diffclass();
	Copy.M1();
	//objectname.methodname();
	Copy.M2(); //call from diff class
	Copy.M3();
}
}
