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
		
		Employee em1 = new Employee(1,"�����");
		Employee em2 = new Employee(2,"�μκ�");
		Employee em3 = new Employee(3,"������");
		Employee em4 = new Employee(4,"��ͥ��");
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
			System.out.println("������Ա��ID����������ע��");
			int id=new Scanner(System.in).nextInt();
			String name = new Scanner(System.in).next();
			emp.put(id,name);
			iddata.add(id);
			System.out.println("��ӳɹ�");
			System.out.println(emp);
		}
		catch(NumberFormatException e) 
		{
			System.out.println("ID������");
		}
	}
	
	public void shanchu() 
	{
		try 
		{
			System.out.println("������ɾ����Ա��ID");
			int id = new Scanner(System.in).nextInt();
			for(int i = 0;i<iddata.size();i++) 
			{
				if(id == iddata.get(i)) 
				{
					emp.remove(id);
					System.out.println("ɾ���ɹ�");
					System.out.println(emp);
				}
			}
		}
		catch(NumberFormatException e) 
		{
			System.out.println("��ԱID������");
		}
		
	}
	
	public void chazhao() 
	{
		try 
		{
			System.out.println("��������Ҫ���ҵĳ�Ա��ID");
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
			System.out.println("ID������");
		}
		
	}
	
	
	
	
	

}
