package Example;
//Find the most expensive car among all cars.
public class Car {
	int id;
	int modelno;
	String brand;
	int price;
	float average;
	
Car(int id,int modelno,String brand,int price,float average){
		this.id=id;
		this.modelno=modelno;
		this.brand=brand;
		this.price=price;
		this.average=average;
				
	}
void display(){
	System.out.println("id=" +id);
	System.out.println("model name="+ modelno);
	System.out.println("brand name="+ brand);
	System.out.println("price="+ price);
	System.out.println("mileage="+average);
	
}
}