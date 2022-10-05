package constructor_Setter_Getter;

public class Student {
int id;
String name;
String course;

Student(){
	System.out.println("No argument constructor");
}
	Student(int id, String name, String course){
	this.id=id;
	this.name=name;
	this.course=course;
}
}
