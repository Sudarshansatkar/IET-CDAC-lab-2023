#include<iostream>
using namespace std;

class student
{
	int r_no, m1, m2;
	public :
		student (int r_no, int m1, int m2)
		{
			this->r_no=r_no;
			this->m1=m1;
			this->m2=m2;
			
		}
		int get()
		{
			return m1+m2;
		}
		void display()
		{
			cout << "Roll No : " << this->r_no << endl;
			cout << "M1 Marks : " << this->m1 << endl;
			cout << "M2 Marks : " << this->m2 << endl;
		}
};

class sports
{
	int s_m;
	public :
		sports (int s_m)
		{
			this->s_m = s_m;		   
		}
		int get()
		{
			return this->s_m;
		}
		void display()
		{
			cout << "Sports Marks : " << this->s_m << endl;
		}
	
};

class result : public student, public sports
{
	int res;
	float avgs;
	public :
		result(int r_no, int m1, int m2, int s_m) : student(r_no , m1, m2), sports(s_m)
		{
			
		}
		void avg()
		{
			this->res = student :: get() + sports :: get() ;
			this->avgs = (float)(this->res/3);
		}
		void display()
		{
			student :: display();
			sports :: display();
			cout << "Avg : " << avgs << endl;
		}
};

int main()
{
	result r1(1, 80, 90, 75);
	r1.avg();
	r1.display();
	
}
