package Age;

public class Employee {
	int age;
	String name;
	Employee(int age, String name){
		this.age=age;
		this.name=name;
	}
	public int getAge(){
		return age;
	
	}
	public void setAge(int age){
			if (age>25){
			this.age=age;
			}
			else{
			System.out.println("Invalid age");
			}
	}	
	public String getName(){
		return name;
		
	}
	
	}
			

