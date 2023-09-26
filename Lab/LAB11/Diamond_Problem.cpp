//LAb 11 Daimond problem

#include<iostream>
using namespace std;

class Printer
{
	int id=500;
	public:	
		void display()
		  {
		  	cout<<"\nId : "<<id;
			cout<<"  Black and white printer";
	      }
};

class Inkz:virtual public Printer
{
	int id=501;
	public:
		void display()
		{ 
		    cout<<"\nId : "<<id;
		 	cout<<"  Inkz printer";
		}
};

class Laser:virtual public Printer
{
	int id=502;
	public:
		void display()
		{
		    cout<<"\nId : "<<id;
		 	cout<<"  Laser printer";
		}
};

class Thermal:public Inkz,public Laser
{
	int id=503;
	public:
		void display()
		{
		
    		Printer::display();
	    	Inkz::display();
		    Laser::display();
			cout<<"\nId : "<<id;
		 	cout<<"  Thermal printer";
		}
};

int main()
{
	Thermal t1;
	t1.display();
		
	return 0;
}
