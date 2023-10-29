
import java.util.Scanner;
public class TestStudentArr
{
	public static void main(String[] args)
	{
	
	
		Scanner sc=new Scanner(System.in);
		int choice;
		
		
		
		
		do
		{
			System.out.print(" 1:Add Student: \n 2:Display all Students \n 3:Display by id\n 4: Update marks by id\n");
			System.out.print(" 5. display by name\n 6. exit\n choice: ");
			choice=sc.nextInt();
			switch(choice)
			{
		
			
			case 1:
				
				TestStudentService.addNewStudent();
				
				break;
				
			case 2:
				
				TestStudentService.diplayStudent();
				
				break;
				
			case 3:
				
				System.out.println("Enter ID:");
				int id1=sc.nextInt();
				
				Student ob2=TestStudentService.displayById(id1);
				
				if(ob2!=null)
				{
					System.out.println(ob2);
				}
				else
				{
					System.out.println("not found :"+ id1);
				}
				
				
				break;
				
			case 4:
				
				System.out.println("Enter ID:");
				int id2=sc.nextInt();
				System.out.println("Enter 3 sub. marks to be updated for above ID: ");
				int k1=sc.nextInt();
				int k2=sc.nextInt();
				int k3=sc.nextInt();
				
				Student ob3=TestStudentService.updateMarks(id2,k1,k2,k3);
				
				if(ob3!=null)
				{
					System.out.println(ob3);
				}
				
				else
				{
					System.out.println("id not found!");
				}
				
				break;
				
				
			case 5:
				
				System.out.println("Enter name:");
				sc.nextLine();
				String nm=sc.nextLine();
				Student[] slist=TestStudentService.getByName(nm);
				
				
				if(slist!=null)
				{
					for(Student s:slist)
					{
					System.out.println(s);
					}
				}
				
				else
				{
					System.out.println("not found");
				}
				
				
				
				
				
				break;
				
			case 6:
				
				System.out.println("Thank you for visiting.....");
				//System.exit(0);
	
				
				break;
				
			default:
				System.out.println("Enter Correct info");
				break;
				
			}
			
		}while(choice!=0);
		
		
		
		
	}
	


			
			
			
			
			
			
			
		
	
}
		
