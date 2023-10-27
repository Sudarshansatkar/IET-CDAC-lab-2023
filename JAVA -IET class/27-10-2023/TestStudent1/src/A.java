/*class A
{  
 int a=40;//non static  
   
 public static void main(String args[])
 {  
	A a1=new A();
  System.out.println(a1.a);  
 }  
} */

class A
{  
  static{System.out.println("static block is invoked");
  }  
  public static void main(String args[])
  {  
   System.out.println("Hello main");  
  }  
}  