
class Student
{
	private int id;
	private String name;
	
	public Student() 
	{
		
	}
	
	public Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public String toString()
	{
		return "id="+id+"\nname="+name;
	}
}

public class Demo_toString {

	public static void main(String[] args) {
		

		Student s1 = new Student(101,"Gauttam");
		
		System.out.println(s1);
	}

}
