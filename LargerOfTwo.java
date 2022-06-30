package fundamentals;
import java.util.Scanner;

public class LargerOfTwo {
	public static void main(String[] args) {
		int a,b;
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		
		if (a>b)      //Condition Statement
		{
			System.out.println("Inside If");  //This will happen if condition True
		}
		else 
		{
			System.out.println("Inside Else"); //This will happen if condition False
		}
	}

}
