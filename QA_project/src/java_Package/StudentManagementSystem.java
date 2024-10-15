package java_Package;

public class StudentManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj= new Student();
		obj.setName("Carla");
		System.out.println("the nema of student "+obj.getName());
		
		obj.setGrade(80);
		System.out.println("The grade of sudent "+obj.getGrade());
		
	}

}


class Student
{
	
private String name;
private int grade;

public void setName(String stdName)
{
	name=stdName;
}

public String getName()
{
	return name;
	
}

public void setGrade(int stdgrade)
{
	if(grade>=0 && grade<=100)
	{
		grade=stdgrade;
	}
	else 
	{
		System.out.println("Enter the grade between 0 to 100");
	}
}


public int getGrade()
{
	return grade;
}
}