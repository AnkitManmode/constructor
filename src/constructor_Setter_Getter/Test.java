package constructor_Setter_Getter;

public class Test {
public static void main(String[] args) {
	Item i1=new Item(11,"pen",20f);
	Item i2=new Item(23,"pencil",10f);
	Item i3=new Item(67,"Eraser",100f);
	
	if(i1.price<i2.price && i1.price<i3.price);
	i1.display();
	
	if(i2.price<i1.price && i2.price<i3.price);
	i2.display();
	
	if(i3.price<i1.price && i3.price<i2.price);
	i3.display();
}
}
