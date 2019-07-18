package daka2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Company {

	// ���Ա��������
	public List<Employee> list = new ArrayList<Employee>();
	// ��ſ������ڼ�����Ϣ������
	public Map<String,List<DakaInfo>> map = new HashMap<String,List<DakaInfo>>();
	
	// ����Ա��
	public void addEmp(Employee e){
		list.add(e);
		System.out.println("�����Ϣ�ɹ�");
	}
	
	// ��ְԱ��
	public void delEmp(int id){
		int index = -1;
		int i = 0;
		for(Employee e:list){
			index = i;
			if(e.getId() == id){
				list.remove(index);
				break;
			}
			i++;
		}
	}
	
	// ����Ա��
	public Employee findEmp(int id){
		int index = -1;
		int i = 0;
		for(Employee e:list){
			index = i;
			if(e.getId() == id){
				return list.get(index);
			}
			i++;
		}
		return null;
	}
	
	// ��ʾԱ����Ϣ
	public void printEmp(){
		for(Employee e:list){
			System.out.println(e);
		}
	}
}

