package fundamentals;
import java.util.Scanner;

public class CheckPrime {
	public static void main(String args[])
	{
		int n, i=2, flag=0, check;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no you want to check:");
		n = s.nextInt();
		
		while(i<=n-1)
		{
			check = n%i;
			if (check==0)
			{
				flag=1;
				break;
			}
			i=i+1;
		}
		if(flag==1)
			System.out.println("Not Prime");
		else
			System.out.println("Prime");
		
	}

}
