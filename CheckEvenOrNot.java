package fundamentals;
import  java.util.Scanner;

public class CheckEvenOrNot {
	
	public static void main(String args[])
	{
		int a;
		System.out.println("Enter a no to check even or not: ");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		
		if(a%2==0)
		{
			System.out.println("No is even");
		}
		else
		{
			System.out.println("No is odd");
		}
		
		
	}

}
