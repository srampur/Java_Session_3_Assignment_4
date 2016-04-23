import java.util.Scanner;

/*
 * Session 3 : OOPs class & objects
Assignment 
–
Design a very basic calculator using methods.
 */
public class CalcDemo {

	private int add(int a, int b)
	{
		return a + b;
	}
	
	private int subtract (int a, int b)
	{
		return a - b;
	}
	
	private int multiply (int a, int b)
	{
		return a * b;
	}
	
	private int divide (int a, int b)
	{
		return Math.abs(a/b);
	}
	
	public static void main(String[] args) {
		int option = 0, num1 = 0, num2  = 0, result = 0;
		CalcDemo obj = new CalcDemo();
		System.out.println("Enter your operation");
		System.out.println("1. Add");
		System.out.println("2. Substract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("NOTE: ONLY INTEGER ALLOWED");
		Scanner s = new Scanner(System.in);
		option = s.nextInt();
		
		switch(option)
		{
		case 1:
			System.out.println("To Add Enter two numbers:");
			num1 = s.nextInt();
			num2 = s.nextInt();
			
			result = obj.add(num1, num2);
			break;
		case 2:
			System.out.println("To Subtract Enter two numbers:");
			num1 = s.nextInt();
			num2 = s.nextInt();
			
			result = obj.subtract(num1, num2);
			break;
		case 3:
			System.out.println("To multiply Enter two numbers:");
			num1 = s.nextInt();
			num2 = s.nextInt();

			result = obj.multiply(num1, num2);
			break;
		case 4:
			System.out.println("To divide Enter two numbers:");
			num1 = s.nextInt();
			num2 = s.nextInt();
			
			if (num2 != 0)
				result = obj.divide(num1, num2);
			else
				System.out.println("Denominator can not be 0");
			break;
			default:
				System.out.println("Wrong entry!!!");
				break;
		}
		
		s.close();
		System.out.println("Result is "+result);
	}

}
