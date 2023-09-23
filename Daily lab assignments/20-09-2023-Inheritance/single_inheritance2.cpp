#include<iostream>
using namespace std;

class A
{
	int a;
	public:
		A()
		{
			cout<<"in default of A \n";
		}
		A(int a)
		{
			cout<<"in para of A\n";
			this->a=a;
		}
		void display()
		{
			cout<<"in display of A class\n";
			cout<<"value of a = "<<a<<endl;
		}
};
class B:public A
{
	int b;
	public:
		B()
		{
			cout<<"in default of B\n";
		}
		B(int b):A(10) //base class initialization list(offer only for constructor)
		{
			cout<<"in para of B\n";
			this->b=b;
		}
		void display()
		{
			A::display(); //:: to call function of base class
			cout<<"in display of B class \n";
			cout<<b;
		}
};
int main()
{
	B bobj(20);
	bobj.display();
	cout<<sizeof(bobj);
}
