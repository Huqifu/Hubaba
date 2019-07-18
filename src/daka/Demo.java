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
			System.out.println("-----员工打卡系统-----");
			System.out.println("输入 0--------退出");
			System.out.println("输入 1--------签到");
			System.out.println("输入 2--------签退");
			System.out.println("输入 3--------查看签到信息");
			System.out.println("输入 4--------添加员工");
			System.out.println("输入 5--------删除员工");
			System.out.println("输入 6--------查找员工");
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
				System.out.println("退出");
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
				String a = "工号为:"+String.valueOf(id);
				String b = "姓名："+(String) com.getEmp().get(id);
				fw.write(a);
				fw.write(b);
				
				for(int j = 0;j<DakaInfo.qiandao.size();j++) 
				{
					if(id==DakaInfo.qiandao.get(j)) 
					{
						String c = "签到时间"+(String) daka.qdtime.get(id);
						fw.write(c);
					}
				}
				for(int j = 0;j<DakaInfo.qiantui.size();j++) 
				{
					if(id==DakaInfo.qiantui.get(j)) 
					{
						String d = "签退时间"+(String) daka.qttime.get(id);
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
