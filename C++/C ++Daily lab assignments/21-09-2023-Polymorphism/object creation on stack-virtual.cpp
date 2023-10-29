//Case 3 : Object creation on stack with involvment of virtual keyword

#include<iostream>
using namespace std;

class employee
{
	int id;
	public: 
			
			void display();
			virtual int findsalary()
			{
				return 0;
			}
			
};


void employee::display()
{
	cout<<"id of an employee is "<<id<<endl;
}

class wageemployee:public employee
{
	int hrs=10,rate=20;
	public:

			void display();
			int findsalary();
};


int wageemployee::findsalary()
{
	return hrs*rate;
}

void wageemployee::display()
{
	employee::display();
	cout<<"hrs="<<hrs<<endl;
	cout<<"rate="<<rate<<endl;
}

class salesmanager:public wageemployee
{
	int sales=200,comm=1;
	public:
		
			void display();
			int findsalary();
};



void salesmanager::display()
{
	wageemployee::display();
	cout<<"sales of an emp is="<<sales<<endl;
	cout<<"commission of an emp is="<<comm<<endl;
}

int salesmanager::findsalary()
{
	return (wageemployee::findsalary())+sales*comm;
}




int main()
{
	employee* ptr;
	employee e1;
	ptr=&e1;

	cout<<ptr->findsalary()<<endl;
	
	wageemployee we1;
	ptr=&we1;

	cout<<ptr->findsalary()<<endl;
	
	salesmanager sm;
	ptr=&sm;

	cout<<ptr->findsalary()<<endl;
}
