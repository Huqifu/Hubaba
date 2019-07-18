package daka;
import java.util.*;

public class Company {
	private static Map emp = new HashMap();
	private static Map time = new HashMap();
	static List<Integer> iddata = new ArrayList<>();
	
	public Map getEmp() {
		return emp;
	}
	public void setEmp(Map emp) {
		Company.emp = emp;
	}
	
	
	
	public void empdata() 
	{
		
		Employee em1 = new Employee(1,"胡奇夫");
		Employee em2 = new Employee(2,"宋嘉豪");
		Employee em3 = new Employee(3,"于书真");
		Employee em4 = new Employee(4,"苏庭满");
		emp.put(em1.getID(), em1.getName());
		emp.put(em2.getID(), em2.getName());
		emp.put(em3.getID(), em3.getName());
		emp.put(em4.getID(), em4.getName());
		iddata.add(em1.getID());
		iddata.add(em2.getID());
		iddata.add(em3.getID());
		iddata.add(em4.getID());
		
		
		
	}
	public void tianjia() 
	{
		try 
		{
			System.out.println("请输入员工ID和姓名进行注册");
			int id=new Scanner(System.in).nextInt();
			String name = new Scanner(System.in).next();
			emp.put(id,name);
			iddata.add(id);
			System.out.println("添加成功");
			System.out.println(emp);
		}
		catch(NumberFormatException e) 
		{
			System.out.println("ID是数字");
		}
	}
	
	public void shanchu() 
	{
		try 
		{
			System.out.println("请输入删除成员的ID");
			int id = new Scanner(System.in).nextInt();
			for(int i = 0;i<iddata.size();i++) 
			{
				if(id == iddata.get(i)) 
				{
					emp.remove(id);
					System.out.println("删除成功");
					System.out.println(emp);
				}
			}
		}
		catch(NumberFormatException e) 
		{
			System.out.println("成员ID是数字");
		}
		
	}
	
	public void chazhao() 
	{
		try 
		{
			System.out.println("请输入需要查找的成员的ID");
			int id = new Scanner(System.in).nextInt();
			for(int i = 0;i<iddata.size();i++) 
			{
				if(id == iddata.get(i)) 
				{
					System.out.println(emp.get(id));
				}
			}
		}
		catch(NumberFormatException e) 
		{
			System.out.println("ID是数字");
		}
		
	}
	
	
	
	
	

}
