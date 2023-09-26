//custom exception handling


#include <iostream>
using namespace std;

class Test1
{
   string str;
   public:
      Test1(string str)
      {
         try{
            if (str == "String")
	     {
               throw "Exception! You cannot use keyword 'String'!";
            }
            else
            	{
            	cout<<"String: "<<str;
		}
            this->str = str;   
         }
         catch(const char* s)
	   {
            cout << s << endl;
         }
      }
};

int main()
 {
 	string a;
 	cout<<"enter a string=";
 	cin>>a;
   	Test1 t(a);
   
   return 0;
}
