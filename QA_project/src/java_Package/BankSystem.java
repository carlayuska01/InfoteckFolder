package java_Package;

public class BankSystem {

	 int amt =1000;
	
	void deposit(int dep)
	{
		amt =dep+amt;
		System.out.println("The amount after deposit "+amt);
	}
	
	void withdraw(int wt)
	{
		amt=amt-wt;
		System.out.println("The amount after withdraw "+amt);
	}
	
	int display()
	{
		return amt;
	}
	
	public static void main(String[] args) {
		// Create and object
		
		BankSystem obj= new BankSystem();
		obj.deposit(1000);
		obj.withdraw(500);
		System.out.println(obj.display());

	}

}
