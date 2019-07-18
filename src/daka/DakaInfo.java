package daka;
import java.text.*;

import java.io.*;
import java.util.*;

public class DakaInfo {
	Company com = new Company();
	static List<Integer> qiandao = new ArrayList<>();
	static List<Integer> qiantui = new ArrayList<>();
	Map qdtime = new HashMap();
	Map qttime = new HashMap();


	
	public void qiandao() 
	{
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try 
		{
			System.out.println("请输入成员ID");
			int id = new Scanner(System.in).nextInt();
			for(int i = 0;i<Company.iddata.size();i++) 
			{
				if(id==Company.iddata.get(i)) 
				{
					System.out.println("ID:"+com.getEmp().get(id)+"签到成功");
					qiandao.add(id);
					qdtime.put(id,date.format(new Date()));
					System.out.println(qdtime);
					
				}
			}
			for(int i = 0;i<qiandao.size();i++) 
			{
				if(id==qiandao.get(i)) 
				{
					System.out.println("今天已经打过卡了");
				}
			}
		}
		catch(NumberFormatException e) 
		{
			System.out.println("成员ID是数字");
		}
		
		
	}
	
	public void qiantui() 
	{
		SimpleDateFormat date = new SimpleDateFormat("yyyy-HH-dd HH:mm:ss");
		try 
		{
			System.out.println("请输入成员ID");
			int id = new Scanner(System.in).nextInt();
			for(int i = 0;i<qiandao.size();i++) 
			{
				if(id==qiandao.get(i)) 
				{
					
					System.out.println("ID"+com.getEmp().get(id)+"签退成功");
					qttime.put(id,date.format(new Date()));
				}
				else 
				{
					System.out.println("今天还没有签到，无法签退");
				}
			}
		}
		catch(NumberFormatException e) 
		{
			System.out.println("成员ID是数字");
		}
	}
	
	public void empInfo() 
	{
		System.out.println(new Employee().toString());
	}
	
	
	public void chakan() throws IOException 
	{
		FileReader file = new FileReader("D:\\eclipse\\666.txt");
		BufferedReader fr = new BufferedReader(file);
		System.out.println(fr.readLine());
		
		
	}

}
