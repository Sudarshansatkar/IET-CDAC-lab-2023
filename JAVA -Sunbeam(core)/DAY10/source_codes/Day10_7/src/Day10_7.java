import java.util.InputMismatchException;
import java.util.Scanner;
// in this code we handled the exception
// ArithmeticException // InputMismatchException
public class Day10_7 {

	public static void main(String[] args) 
	{
		int num1;
		int num2;
		int result;
		Scanner sc = new Scanner(System.in);
		
		try
		{
		System.out.println("Enter the first number : ");
		num1 = sc.nextInt();
		System.out.println("Enter the second number : ");
		num2 = sc.nextInt();
		
			result = num1/num2;
			//throw new ArithmeticException() 
			System.out.println("Num1 = "+num1+" Num2 = "+num2+" Result = "+result);
		}
		catch(ArithmeticException e)  //Handler 
		{
			System.out.println("Second number can't be zero!");
		}
		catch(InputMismatchException e)
		{
			System.out.println("entered data should be numeric");
		}
		
	}

}
