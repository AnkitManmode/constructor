package Age;

public class Test {
public static void main(String[] args) {
	Employee E1=new Employee(25,"Rajat");
	
	System.out.println(E1.getName()+ " " +E1.getAge());
	E1.setAge(30);
	System.out.println(E1.getAge());
	
	System.out.println(E1.getName()+ " "+E1.getAge() );
	E1.setAge(-7);

	System.out.println(E1.getName()+ " "+ E1.getAge());
}

}

