package constructor_ope;

public class SalaryAccount_2 extends Account_2{
	SalaryAccount_2(int accno,String name,double balance){
	super (accno, name, balance);
	}
	void withdraw(double amount){
		if(balance-amount>=0)
			balance=balance-amount;
		else
			System.out.println("Funds Not available");
	}
}
