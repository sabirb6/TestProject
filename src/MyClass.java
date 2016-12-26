
import java.util.Scanner;
public class MyClass {
	
	public static int multiply(int x,int y)
	{
		if(x==0||y==0)
			return 0;
		else
			return x*y;
	}
	public int divide(int x,int y)
	{
		if(y>10)
		{
			throw new IllegalArgumentException("y should be less than 10 ");
		}
		else
			return x/y;	
	}
	
	public static void main(String[] args)
	{
		int input1=0;
		int input2=0;
		int result=0;
		String option=null;
		do
		{
		
		System.out.println("Menu ");
		System.out.println("1.Multiplication");
		System.out.println("2.Division of ");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:System.out.print("Input1: ");
				input1=sc.nextInt();
				System.out.print("Input2: ");
				input2=sc.nextInt();
				result=multiply(input1,input2);
				System.out.println(result);
				break;
		case 2:System.out.print("Input1: ");
				input1=sc.nextInt();
				System.out.print("Input2: ");
				input2=sc.nextInt();
				result=new MyClass().divide(input1,input2);
				System.out.println(result);
				break;
		default: System.out.println("you have entered Wrong Choice");		
				
		}
		System.out.println("Do you want to continue: (y(or)n)");
		option=sc.next();
		}while(option.equals("y"));
	}

}
