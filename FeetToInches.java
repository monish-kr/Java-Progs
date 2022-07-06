package java6july;
import java.util.Scanner;
public class FeetToInches {
	
	public static void main(String args[])
	{
		double i,f,ch;
		Scanner s=new Scanner(System.in);
		System.out.println("Press\n(1)Feet to Inches\n(2)Inches to Feet\nYour choice:");
		ch =s.nextInt();
		
		if (ch==1)
		{
			f=s.nextInt();
			i=f*12;
			System.out.println("Feet: "+f+" In Inches: "+i);
		}
		else if (ch==2)
		{
			i=s.nextInt();
			f=i/12;
			System.out.println("Inches: "+i+" In Feets: "+f);
		}
	}

}
