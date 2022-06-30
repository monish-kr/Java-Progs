package fundamentals;
import java.util.Scanner;

public class TwoNosPositiveOrNot {

	public static void main(String args[])
	{
		int a,b,c;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter\n1.To check both +ve or not \n2.To check either one +ve or not");
		c= s.nextInt();
		System.out.println("Input 2 nos to check if +ve or not: ");
		a= s.nextInt();
		b= s.nextInt();
		
		if(c==1)
		{
			if(a>0 && b>0)
				System.out.println("Both are +ve " + a + " " + b);
			else
				System.out.println("Both are not +ve " + a + " " +b);
		}
		else if(c==2)
		{
			if(a>0 || b>0)
				System.out.println("Either one of them is +ve");
			else
				System.out.println("None of them are +ve");
				
		}
		
	}
	
}
