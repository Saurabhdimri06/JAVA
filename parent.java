package test;

public class parent {
	private String name;
	
	public void getname() 
	{
		System.out.println(name);
	}
	
	public void setname(String newname)
	{
		this.name = newname;
	}
	
	public static void main(String args[]) 
	{
		parent obj = new parent();
		obj.setname("Saurabh");
		obj.getname();
	}
	

}
