package fundamentals;
import java.util.Scanner;

public class AverageOf3Numbers {
	
	public static void main(String args[])
	{
		int m1,m2,m3,avg;
		char ch;
		String str;
		Scanner s = new Scanner (System.in);
	    System.out.print("Your Name = ");
		str = s.next();
		ch = str.charAt(0);
		System.out.print("Enter your marks = ");
		m1 = s.nextInt();
		m2 = s. nextInt();
		m3 = s.nextInt();
		avg = (m1+m2+m3)/3;
		System.out.println(ch);
		System.out.print("Your Average Is = ");
		System.out.print(avg);
		
		
	}

}
