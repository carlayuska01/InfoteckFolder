package java_Package;

public class Homework_ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//HMW 082424 Take all numbers from 20 to 40 and print if it is even or odd
		
		for(int i=20;i<=40;i++)
		{
			int mod = i%2;

			if (mod == 0)
			{
			System.out.println(+i +" is an even number. ");
			}
			else
			{
				System.out.println(+i +" is an odd number ");
			}
		}

	}

}
