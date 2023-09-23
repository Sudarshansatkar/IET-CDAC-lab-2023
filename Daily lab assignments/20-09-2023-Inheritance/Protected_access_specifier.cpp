#include<iostream>
using namespace std;

class A
{
	int c;
	public:
		int a;
	protected:
		int b;
	public:
		void display()
		{
			cout<<"in display of A\n";
		}
};
class B:protected A
{
	public:
		void show()
		{
			cout<<a<<b;
		}
};
class C:protected B
{
	public:
		void show()
		{
			cout<<a<<b;
		}
};
int main()
{
	B bobj;
	bobj.show();
	C cobj;
	cobj.show();
	//bobj.display();
}
