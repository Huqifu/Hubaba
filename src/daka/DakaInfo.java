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
			System.out.println("�������ԱID");
			int id = new Scanner(System.in).nextInt();
			for(int i = 0;i<Company.iddata.size();i++) 
			{
				if(id==Company.iddata.get(i)) 
				{
					System.out.println("ID:"+com.getEmp().get(id)+"ǩ���ɹ�");
					qiandao.add(id);
					qdtime.put(id,date.format(new Date()));
					System.out.println(qdtime);
					
				}
			}
			for(int i = 0;i<qiandao.size();i++) 
			{
				if(id==qiandao.get(i)) 
				{
					System.out.println("�����Ѿ��������");
				}
			}
		}
		catch(NumberFormatException e) 
		{
			System.out.println("��ԱID������");
		}
		
		
	}
	
	public void qiantui() 
	{
		SimpleDateFormat date = new SimpleDateFormat("yyyy-HH-dd HH:mm:ss");
		try 
		{
			System.out.println("�������ԱID");
			int id = new Scanner(System.in).nextInt();
			for(int i = 0;i<qiandao.size();i++) 
			{
				if(id==qiandao.get(i)) 
				{
					
					System.out.println("ID"+com.getEmp().get(id)+"ǩ�˳ɹ�");
					qttime.put(id,date.format(new Date()));
				}
				else 
				{
					System.out.println("���컹û��ǩ�����޷�ǩ��");
				}
			}
		}
		catch(NumberFormatException e) 
		{
			System.out.println("��ԱID������");
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
