package Example;

public class Car_Test {
	public static void main(String[] args) {
		
	Car c1=new Car(101,2390,"Toyota",800000,21f);
	Car c2=new Car(102,2490,"Ford",840000,23.2f);
	Car c3=new Car(103,2590,"Honda",700000,19.3f);
	Car c4=new Car(104,2690,"BMW",1500000,23.3f);
	Car c5=new Car(105,2790,"Kia",750000,22f);
	Car c6=new Car(106,2890,"Porsche",1100000,34f);
		
		
	if (c1.price>c2.price && c1.price>c3.price && c1.price>c4.price && c1.price>c5.price && c1.price>c6.price){
	System.out.println("Toyota is the most expensive car");			
	    c1.display();
		}
	else if (c2.price>c1.price && c2.price>c3.price && c2.price>c4.price && c2.price>c5.price && c2.price>c6.price){
	System.out.println("Ford is the most expensive car");
		c2.display();
		}
	else if (c3.price>c2.price && c3.price>c1.price && c3.price>c4.price && c3.price>c5.price && c3.price>c6.price){
	System.out.println("Honda is the most expensive car");
			c3.display();
		}
	else if (c4.price>c2.price && c4.price>c3.price && c4.price>c1.price && c4.price>c5.price && c4.price>c6.price){
	System.out.println("BMW is the most expensive car");
			c4.display();
		}
	else if (c5.price>c2.price && c5.price>c3.price && c5.price>c4.price && c5.price>c1.price && c5.price>c6.price){
	System.out.println("Kia is the most expensive car");
			c5.display();
		}
	else if (c6.price>c2.price && c6.price>c3.price && c6.price>c4.price && c6.price>c5.price && c6.price>c1.price){
	System.out.println("Porsche is the most expensive car");
			c6.display();
		}
		}
}