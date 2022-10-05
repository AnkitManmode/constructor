package Example;
//Find the cheapest item among three
public class Item {
	int id;
	String name;
	float price;
	
	Item(int id, String name, float price){
		this.id=id;
		this.name=name;
		this.price=price;
	}
	void display(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(price);
}

}
