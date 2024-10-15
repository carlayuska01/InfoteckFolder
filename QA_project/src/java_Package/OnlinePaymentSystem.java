package java_Package;

public class OnlinePaymentSystem {

	
	 void processPayment(int amt)
	 {
		 System.out.println("The amount in integer "+amt);
	 }
	 
	 void processPayment(int amt,String currency)
	 {
		 System.out.println("The amount in currency "+amt+ " "+currency);
	 }
	public static void main(String[] args) {
// COMPILE ITME 
		OnlinePaymentSystem obj= new OnlinePaymentSystem();
		obj.processPayment(1000);
		obj.processPayment(1000,"Dollar");
		
		// Runtime Polymorphism
		Payment payment; 
		payment = new CreditCardPayment();
		payment.processPayment();
		
		payment= new PayPalPayment();
		payment.processPayment();
		
		payment=new BankPayemnt();
		payment.processPayment();
	}

}

class Payment
{
	 void processPayment()
	{
		System.out.println("The payemt process");
	}
}

class CreditCardPayment extends Payment
{
	void processPayment()
	{
		System.out.println("The payemt process through creditcard");
	}
}

class PayPalPayment extends Payment
{
	void processPayment()
	{
		System.out.println("The payemt process through PayPal");
	}
}

class BankPayemnt extends Payment
{
	void processPayment()
	{
		System.out.println("The payemt process through bank syatem ");
	}
}