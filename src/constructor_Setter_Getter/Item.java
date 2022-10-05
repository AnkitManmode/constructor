package constructor_Setter_Getter;

public class Item {
	int id;
	String name;
	float price;
	
	Item(int id,String name,float price){
		this.id=id;
		this.name=name;
		this.price=price;		
	}
	void display(){
		System.out.println("======");
		System.out.println(id);
		System.out.println(name);
		System.out.println(price);
	}
	}