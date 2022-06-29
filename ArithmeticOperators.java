package fundamentals;
import java.util.Scanner;
public class ArithmeticOperators {

	public static void main(String args[])
	{
		int a,b,c;
		Scanner s = new Scanner(System.in);
		System.out.print("Input First no = ");
		a = s.nextInt();
		System.out.print("Input Second no = ");
		b = s.nextInt();
		c=a+b;
		System.out.print("Your answer is = ");
		System.out.print(c);
		
	}
}
