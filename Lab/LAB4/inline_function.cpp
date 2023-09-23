// inline function

#include<iostream>
using namespace std;
inline int cube(int s)
{
	return s*s*s;
}
int main()
{
	cout<<"The cube of s is  "<<cube(3)<<"\n";
	return 0;
}

