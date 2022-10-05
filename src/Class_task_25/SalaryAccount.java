package Class_task_25;

public class SalaryAccount extends Account{
SalaryAccount(int accno,String name,double balance){
	super(accno,name,balance);
}
	void withdraw(double amount){
	if(balance-amount>=0)
		balance=balance-amount;
	
	else
		System.out.println("You Don't have certain amount of funds");
	}
	}


