package Example;

public class Item_test {
	public static void main(String[] args) {
		Item i1=new Item(11,"pen",20f);
		Item i2=new Item(12,"pencil",120f);
		Item i3=new Item(13,"erasor",100f);
	
	
		if(i1.price<i2.price && i1.price<i3.price){
		i1.display();
		}
		if(i2.price<i1.price && i2.price<i3.price){
		i2.display();
		}
		if(i3.price<i1.price && i3.price<i2.price){
		i3.display();
	}
	}		
}