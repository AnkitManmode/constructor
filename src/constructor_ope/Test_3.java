package constructor_ope;

public class Test_3 {
public static void main(String[] args) {
	A3 obja= new A3();
	obja.m1();
	
	B3 objB=new B3();
	objB.m1();
	
	//B3 objB=new A3();
	//objB.m1();
	
	A3 obj=new B3();
	obj.m1();
}
}
