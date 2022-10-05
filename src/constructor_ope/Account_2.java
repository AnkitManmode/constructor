package constructor_ope;

public class Account_2 {
	int accno;
	String name;
	double balance;
	Account_2(int accno,String name,double balance){
	this.accno=accno;
	this.name=name;
	this.balance=balance;
}
	void withdraw (double amount){
		balance=balance-amount;
	}
	void deposite(double amount){
		balance=balance+amount;
		}
	void showbalance(){
		System.out.println(name+" "+"balance is"+ " "+balance);
	}
}
