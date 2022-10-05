package Class_task;

public class Test {
public static void main(String[] args) {

	A obj1= new A();
	
	B obj2=obj1.m1();
	
	C obj3=obj2.m2();
	
	D obj4=obj3.m3();	
	
	E obj5=obj4.m4();
	
	     obj5.m5();
	
	System.out.println();

	System.out.println("=========");
	
	new A().m1().m2().m3().m4().m5(); 
	System.out.println();


}
}