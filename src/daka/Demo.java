package daka;
import java.io.*;
import java.util.*;

public class Demo {
	public static void main(String[] args) throws IOException 
	{
		Employee e = new Employee();
		DakaInfo daka = new DakaInfo();
		Company com = new Company();
		com.empdata();
		
		
		
		while(true) 
		{
			System.out.println("-----Ա����ϵͳ-----");
			System.out.println("���� 0--------�˳�");
			System.out.println("���� 1--------ǩ��");
			System.out.println("���� 2--------ǩ��");
			System.out.println("���� 3--------�鿴ǩ����Ϣ");
			System.out.println("���� 4--------���Ա��");
			System.out.println("���� 5--------ɾ��Ա��");
			System.out.println("���� 6--------����Ա��");
			int k = new Scanner(System.in).nextInt();
			switch(k) 
			{
			case 1 :daka.qiandao();break;
			case 2 :daka.qiantui();break;
			case 3 :daka.chakan();break;
			case 4 :com.tianjia();break;
			case 5 :com.shanchu();break;
			case 6 :com.chazhao();break;
			}
			if(k==0) 
			{
				System.out.println("�˳�");
				break;
			}
			
		}
		
		
		try 
		{
		
			FileWriter file = new FileWriter("D:\\eclipse\\666.txt");
			BufferedWriter fw = new BufferedWriter(file);
			for(int i = 0;i<com.getEmp().size();i++) 
			{
				int id = i+1;
				String a = "����Ϊ:"+String.valueOf(id);
				String b = "������"+(String) com.getEmp().get(id);
				fw.write(a);
				fw.write(b);
				
				for(int j = 0;j<DakaInfo.qiandao.size();j++) 
				{
					if(id==DakaInfo.qiandao.get(j)) 
					{
						String c = "ǩ��ʱ��"+(String) daka.qdtime.get(id);
						fw.write(c);
					}
				}
				for(int j = 0;j<DakaInfo.qiantui.size();j++) 
				{
					if(id==DakaInfo.qiantui.get(j)) 
					{
						String d = "ǩ��ʱ��"+(String) daka.qttime.get(id);
						fw.write(d);
					}
				}
				
				
				fw.write(System.getProperty("line.separator"));
			}
			fw.close();
		}
		catch(IOException e1)
		{}
		
	}

}
