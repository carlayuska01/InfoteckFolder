package java_Package;

public class ArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= new int[5];
		
		arr[0] = 10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		System.out.println(arr[0]);
		for(int i=0;i<=arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
