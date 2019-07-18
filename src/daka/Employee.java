package daka;

public class Employee {
	private int ID;
	private String name;
	
	Employee(){}
	
	Employee(int ID,String name)
	{
		this.ID=ID;
		this.name=name;
	}
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String toString() 
	{
		return "ID:"+this.ID+"Name:"+this.name;
	}

}
