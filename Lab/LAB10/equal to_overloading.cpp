// Equal == Operator Overloading 
 
#include<iostream>
using namespace std;
class Equal
{
	private :
		int num;
	public :
		void input()
		{
			cin>>num;
		}
		int operator ==(Equal x)
		{
			if(num==x.num)
			return 1;
			else
			return 0;
		}
};
int main()
{
	Equal n1,n2;
	cout<<"Please  enter 1st number n1.  ";
	n1.input();
	cout<<" Please  enter 2nd number n2.";
	n2.input();
	if(n1==n2)
	{
		cout<<"n1 is equal to n2. ";
	}
	else
	{
		cout<<"n1 is not equal to n2. ";
	}
 return 0;
 
}

