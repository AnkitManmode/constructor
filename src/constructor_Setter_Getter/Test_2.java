package constructor_Setter_Getter;

public class Test_2 {
	public static void main(String[] args) {
		Account_2 a1=new Account_2(123,"abhi Sharma", 50000);
		
		a1.setBalance(100000);
		a1.setName("Shitij");
		a1.setId(456);
				
		System.out.println(a1.getId());
		System.out.println(a1.getName());
		System.out.println(a1.getBalance());
	}

}
