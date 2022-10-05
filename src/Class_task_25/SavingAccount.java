package Class_task_25;

public class SavingAccount extends Account {
	SavingAccount(int accno,String name,double balance){
		super(accno,name,balance);
	}
	void withdraw (double amount){
		if(balance-amount>=10000)
			balance=balance-amount;
		else
			System.out.println("Sorry You can't withdraw");
	}
	void deposite (double amount){
		if(balance+amount<=100000000)
			balance=balance+amount;
		else
			System.out.println("sorry you cross your limit you can't deposite");

	}
}