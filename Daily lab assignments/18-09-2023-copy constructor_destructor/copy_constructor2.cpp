// userdefined copy constructor

#include<iostream>
using namespace std;

class date
{
	int dd, mm, yy;
	public:
		void show();
		date (int,int,int);
		date(date&);
};

date::date(int d, int m, int y)
{
	dd=d;
	mm=m;
	yy=y;
}
void date::show()
{
	cout<<"date is "<<dd<<"/"<<mm<<"/"<<yy<<endl;
}
date::date(date&d_new)
{
	this->dd=19;
	this->mm=10;
	this->yy=d_new.yy;
}
int main()
{
	date d(18,9,2023);
	date d1(d);
	d.show();
	d1.show();
}
