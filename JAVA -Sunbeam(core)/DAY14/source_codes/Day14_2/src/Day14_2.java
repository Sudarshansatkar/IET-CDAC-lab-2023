import java.util.HashSet;
import java.util.Objects;
// If we create a HashSet of Employee class
// it is compulsory to override equals() and hashcode()
// then only the unique objects will be added to HashSet
class Employee
{
	private String name;
	private int id;
	Employee()
	{
		super();
	}
	Employee(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
	
}


/*
public class Day14_2 {

	public static void main(String[] args) 
	{
		HashSet<Employee> hs =new HashSet<Employee>();
		hs.add(new Employee("Akshita",123));
		hs.add(new Employee("Sparsh",456));
		hs.add(new Employee("Akshita",123));
		//System.out.println("Hash Set = "+hs);
		for(Employee e : hs)
			System.out.println(e);
		
		Employee key = new Employee("Sparsh",456);
		System.out.println("Record is present or not ?"+hs.contains(key));
		
	}

}
*/

public class Day14_2 {

	public static void main(String[] args) 
	{
		HashSet<Employee> hs =new HashSet<Employee>();
		Employee e1 = new Employee("Akshita",123);
		Employee e2 = new Employee("Sparsh",456);
		Employee e3 = new Employee("Akshita",123);
		
		System.out.println("e1 hashcode = "+e1.hashCode());
		System.out.println("e2 hashcode = "+e2.hashCode());
		System.out.println("e3 hashcode = "+e3.hashCode());
		
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		//System.out.println("Hash Set = "+hs);
		for(Employee e : hs)
			System.out.println(e);
		
		Employee key = new Employee("Sparsh",456);
		System.out.println("Record is present or not ?"+hs.contains(key));
		key=new Employee("person1",1234);
		System.out.println("Record is present or not ?"+hs.contains(key));
		
	}

}




