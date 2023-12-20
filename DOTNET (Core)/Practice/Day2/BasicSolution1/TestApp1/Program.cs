using HR;

Employee e1=new Employee();
Console.WriteLine(e1);

WageEmployee w1=new WageEmployee();
Console.WriteLine(w1);

SalesEmployee s1=new SalesEmployee();
Console.WriteLine(s1);

Console.WriteLine(s1.ComputePay());

s1.target=56000;

Console.WriteLine("Target  set is less:");
Console.WriteLine(s1.ComputePay());


// Using List------------
Console.WriteLine("Using List :");
List<Employee>employees=new List<Employee>();
employees.Add(e1);
employees.Add(w1);
employees.Add(s1);
foreach(Employee emp in employees)
{
    Console.WriteLine(emp);
    
    Console.WriteLine("Salaray: "+emp.ComputePay());
}
SalesEmployee s2=new SalesEmployee();
Console.WriteLine(s2);

int instanceCount=SalesEmployee.count;
Console.WriteLine(instanceCount);