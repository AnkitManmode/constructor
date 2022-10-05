package constructor_ope;

public class Test_2 {
	public static void main(String[] args) {
	SavingAccount_2 a1=new SavingAccount_2(2344,"nitin", 1100);	
	a1.showbalance();
	a1.withdraw(100);
	a1.withdraw(900);
	a1.showbalance();
	a1.displayIntrestRate();
	}

}
