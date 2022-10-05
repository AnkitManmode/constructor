package Class_task_25;

public class Test {
public static void main(String[] args) {
	
	SavingAccount s1=new SavingAccount(111,"Raj",50000);
	SalaryAccount s2=new SalaryAccount(112,"Ram",60000);		
	s1.showbalance();
	s1.withdraw(60000);
	s1.showbalance();
	s1.deposite(130000000);
	s1.showbalance();
	System.out.println("===============================================");
	s2.showbalance();
	s2.withdraw(65000);
	s2.withdraw(3000);
	s2.showbalance();
}
}
