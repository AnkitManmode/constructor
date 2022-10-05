package constructor_ope;

public class Student_1 {
	int id;
	String name;
	String course;
	
	Student_1(int id,String name,String course){
		this.id=id;
		this.name=name;
		this.course=course;
	}
	void appear_for_exam(){
		System.out.println(name +" is appearing for exam...");
	}
	void display(){

		System.out.println(id);
		System.out.println(name);
	    System.out.println(course);
	}
	}

