
public class Test {
public static void main(String[] args) {
	SavingAccount a1= new SavingAccount(2334,"nitin",50000);
	a1.deposite(20000);
	a1.deposite(20000);
	a1.withdraw(80000);
	a1.showbalance();
}
}