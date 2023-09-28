package types_of_variables;

public class Non_staticV {
int f=10;
public static void main(String[] args) {
	//non static gv call from same class
	
	Non_staticV G=new Non_staticV();  //callig of non static variable from static method
	System.out.println(G.f);
	// non static gv call from diff class
	NS2 v=new NS2();
	System.out.println(v.d);
    Non_staticV H=new Non_staticV();
    H.k2();
    System.out.println(H.f);
}

public void k2() {
	System.out.println(f);
}
}
