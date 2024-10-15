package java_Package;

public class Bank extends BOA implements PaymentOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank obj= new Bank();
		obj.cstusername();
		obj.cstpassword();
	}

	@Override
	void cstusername() {
		// TODO Auto-generated method stub
		System.out.println("The username of customer carla12");
	}

	@Override
	void cstpassword() {
		// TODO Auto-generated method stub
		System.out.println("The password of custmer 1234");
	}

	@Override
	public void online() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void offline() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void netbanking() {
		// TODO Auto-generated method stub
		
	}

}








abstract class BOA
{
 abstract void cstusername();
 abstract void cstpassword();
 
 public void customerNmae()
 {
	 System.out.println("The name of customer Carla");
 }
}