#include <iostream>     
using  namespace std;  
#include<string.h>
class date
{
	int dd,mm,yy;
	public:
		void get()
		{
			cout<<"enter date\n";
			cin>>dd>>mm>>yy;
		}
		void put()
		{
			cout<<"date is "<<dd<<"/"<<mm<<"/"<<yy<<endl;
		}
};
class student
{
	int rollno;
	int m1,m2,m3;
	char name[10];
	float avg;
	date d;
	
	public:
		void get()
		{
			cout<<"enter rollno\n";
			cin>>rollno;
			cout<<"enter student name\n";
			cin>>name;
			cout<<"enter the marks of three subject: \n";
			cin>>m1>>m2>>m3;
			calc();
			d.get();
			
		}
	
		
		void put()
		{
			cout<<rollno<<"-------"<<name<<"-----------"<<avg<<endl;
		
			d.put();
		}
		float calc()
		{
			avg=(float)(m1+m2+m3)/3;
		}
		int getrollno()
		{
			return rollno;
		}
		char* getname()
		{
			return name;
		}
		void setrollno(int r)
		{
			rollno=r;
		}
		void setname(char* n)
		{
			strcpy(name,n);
		}
		
		
};
int main()
{
	student s[10],temp;
	int i,n,j;
	cout<<"enter value of n\n";
	cin>>n;
	for(i=0;i<n;i++)
	{
		s[i].get();
		
	}
	for(i=0;i<n;i++)
	{
		s[i].put();
		
	}
	cout<<"sort information\n";
	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(s[i].getrollno()>s[j].getrollno())
			{
				temp=s[i];
				s[i]=s[j];
				s[j]=temp;
			}
			
		}
	}
	for(i=0;i<n;i++)
	s[i].put();
}



/*output
103-------ram-----------50
date is 12/12/2012
102-------sita-----------90
date is 5/4/2013
101-------laxman-----------78
date is 5/6/2012
sort information
101-------laxman-----------78
date is 5/6/2012
102-------sita-----------90
date is 5/4/2013
103-------ram-----------50
date is 12/12/2012
*/
