
class Student
{
	private int id;
	private String name;
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
}

public class EncapsulationDemo {
	
	public static void main(String args[])
	{
		Student s1 = new Student();
		
		s1.setId(102);
		s1.setName("Robert");
		
		System.out.println(s1.getId());
		System.out.println(s1.getName());
	}

}
