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
class B:private A
{
	public:
		void show()
		{
			cout<<a<<b;
		}
};
class C : private B
{
	public:
		/*void show()
		{
			cout<<a<<b;
		}*/
};
int main()
{
	B bobj;
	bobj.show();
	//bobj.display();
	C cobj;
	//cobj.show();
}
