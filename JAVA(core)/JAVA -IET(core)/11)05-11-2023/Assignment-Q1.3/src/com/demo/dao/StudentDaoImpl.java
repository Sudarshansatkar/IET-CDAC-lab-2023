package com.demo.dao;

import com.demo.beans.Student;

public class StudentDaoImpl implements StudentDao
{
	static int cnt;
	static Student[] sarr=new Student[100];
	
static
{
	sarr[0]=new Student(1,"SKS",55,65,76,8.35f);
	sarr[1]=new Student(2,"CRB",84,65,87,7.7f);
	
	cnt=2;
}

	public void save(Student s)
	{
		sarr[cnt]=s;
		cnt++;
	}
	
	public Student[] findall() 
	{
		return sarr;
	}
	
	public Student findByName(String sname)
	{
		for(Student s:sarr)
		{
			if(s!=null)
			{
					if(s.getName().equals(sname))
						{
							return s;
						}
			}
			else 
			{
				break;
			}
		}
		return null;
	}

	@Override
	public float getGPA(int id) 
	{
		for(Student s:sarr)
		{
			if(s!=null)
			{
				if(s.getStudid()==id)
				{
					int m1=s.getM1();
					int m2=s.getM2();
					int m3=s.getM3();
					
					float ans=s.calculateGPA(m1,m2,m3);
					System.out.println("before answer-------");
					return ans;
					
				}
			}
			else
				{
					break;
				}
				
			}
		return -1;

		}

		
		
	}
	

