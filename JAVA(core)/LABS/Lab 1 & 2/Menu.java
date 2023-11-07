package Assignment_1;
import java.util.Scanner;
public class Menu
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	
		int program;
		do 
		{
			
		System.out.println("Enter the program to be executed:");
		System.out.println("1 : Print table of a number");
		System.out.println("2 : Check prime or not");
		System.out.println("3 : Display Diamond star pattern");
		
	
		program=sc.nextInt();
		
		switch(program)
			{

		case 1:{
			Table_print.Print();
			break;}
		case 2:{
			Prime.PrimeCal();
			break;}
		case 3:{
			Pattern.diamond();
			break;}
		default:
		{ System.out.println("No program selected") ;
            break;
		}
		
	}
	
	} while (program!=0);
		
		System.out.println("Program terminated") ;
	
}
}
