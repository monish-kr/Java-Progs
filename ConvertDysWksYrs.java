package java6july;
import java.util.Scanner;

public class ConvertDysWksYrs {
	
	public static void main(String args[])
	{
		int d,w,y;
		Scanner s=new Scanner(System.in);
		System.out.println("Input number of days:");
		d=s.nextInt();
		y=d/365;
		d=d%365;
		w=d/7;
		d=d%7;
		System.out.println("Days: "+d+" Weeks: "+w+" Years: "+y);
		
	}

}
