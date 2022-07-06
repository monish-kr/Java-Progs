package java6july;
import java.util.Scanner;
public class FarToCel {
	public static void main(String[] args) {
		
		double c,f;
		System.out.println("Pree\n(a)Celsius to Far\n(b)Far to Celsius\nEnter Your Choice:");
		Scanner s=new Scanner(System.in);
		String str=s.next();
		char ch=str.charAt(0);
		
		if(ch=='a')
		{
			System.out.print("Enter Temp In Celsius: ");
			c=s.nextDouble();
			f=32.0+c*(1.8);
			System.out.print("Your temp in far is: "+f);
		}
		else if(ch=='b')
		{
			System.out.print("Enter Temp In Far: ");
			f=s.nextDouble();
			c=(f-32.0)/(1.8);
			System.out.print("Your temp in celsius is: "+c);
		}
		else
			System.out.println("Wrog Choice!");
		
	}

}
