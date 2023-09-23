#include<iostream>
using namespace std;
#include<string.h>

class student
{
	int rno;
	char name[10];
	public:
		student (int, char[]);
		student(student &t)
		{
			rno=t.rno;
			strcpy(name,t.name);
		}
		
		~student()       //destructor
		{
			
			cout<<"Institute name=IET";
		}
		
		void display();
};
student::student(int no, char n[])
{
	rno=no;
	strcpy(name,n);
}
void student::display()
{
	cout<<endl<<rno<<"\t"<<name<<"\t"<<endl;
}
int main()
{
	student s(101,"Sudarshan");
	s.display();
	
}
