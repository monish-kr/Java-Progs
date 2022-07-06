package java6july;
import java.util.Scanner;

public class ConvetSecIntoHrsMinsSecs {
	
	public static void main (String args[])
	{
		int h,m,sec;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter time in seconds: ");
		sec=s.nextInt();
		h=sec/3600;
		sec=sec%3600;
		m=sec/60;
		sec=sec%60;
		System.out.println("Your time in hrs: "+h+" mins: "+m+" secs: "+sec);
		
	}

}
