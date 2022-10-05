package constructor_Setter_Getter;

public class Account_2 {
private int id;
private String name;
private double balance;

Account_2(int id,String name,double balance){
	this.id=id;
	this.name=name;
	this.balance=balance;
}
	public int getId(){
		return id;
	}	
	public String getName(){
		return name;
	}
	public double getBalance(){
		return balance;
	}

public void setBalance(double balance){
	if(balance>0)
		this.balance=this.balance+balance;
	
	if(balance<0)
	
	System.out.println("Don't try to fool us");
	}
	public void setName(String name){
		this.name=name;
	}
	public void setId(int id){
		this.id =id;
	}
}

