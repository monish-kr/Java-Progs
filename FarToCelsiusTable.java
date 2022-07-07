package fundamentals;
import java.util.Scanner;

public class FarToCelsiusTable {
	public static void main(String args[])
	{
		int S,E,W,C;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter starting, step and end farhenite value for table");
		S = s.nextInt();
		E = s.nextInt();
		W = s.nextInt();
		
		while(S<=E)
		{
			C=(S-32)*5/9;
			System.out.println(S+" "+C);
			S = S+W;
		}
	}

}
