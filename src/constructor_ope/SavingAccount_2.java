package constructor_ope;

public class SavingAccount_2 extends Account_2{
	float sa_intrestRate=6.5f;
	SavingAccount_2(int accno,String name,double balance){
		super (accno, name, balance);
		}
	void withdraw(double amount){
		if(balance-amount>=1000)
			balance=balance-amount;
		else
			System.out.println("Insufficient Funds");
	}
	void displayIntrestRate(){
		System.out.println("Intrest rate is"+ " "+sa_intrestRate);
	}
}
