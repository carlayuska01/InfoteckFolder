package java_Package;

public class LibraryManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EBook obj= new EBook();
		obj.title="Java programing language";
		obj.author="John Doe";
		obj.fileSize=200.00;
		
		obj.displayInfo();
		obj.displayEbookInfo();
	}

}


class Book
{
	
String title;
String author; 


void displayInfo()
{
System.out.println(" Print the title of bbok "+title);	
System.out.println("Print the author name "+author);
}

}


class EBook extends Book
{
	double fileSize;
	
	void displayEbookInfo()
	{
		System.out.println("File Size "+fileSize + "MB");
	}
}


