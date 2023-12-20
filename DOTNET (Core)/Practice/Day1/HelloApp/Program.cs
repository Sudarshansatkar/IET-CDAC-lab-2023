using HR;

    Student s1=new Student(3,"SKS");
    Student s2=new Student();

    Console.WriteLine(s1);

    Console.WriteLine("using constructor chaining");
    Console.WriteLine(s2);

 
    Console.WriteLine(s1.id);
    s1.id=34;

    Console.WriteLine(s1.id);

    Console.WriteLine(s1);

//    String sname=s1.getname();
    s1.Name="RAJ";
    String sname=s1.Name;
   Console.WriteLine(sname);

   Console.WriteLine(s1);

//------------------------------------------------------------
Console.WriteLine("------------------------------------------");

    s2.Name="SKSKSKS";
    //Console.WriteLine(s2);
 String anothername=s2.Name;
 String strperson=s2.ToString();

 Console.WriteLine(s2);

  
