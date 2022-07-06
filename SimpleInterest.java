package java6july;
import java.util.Scanner;
public class SimpleInterest {
	public static void main(String[] args) {
		
		double p,r,t,si;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter p,r,t respectively:");
		p=s.nextInt();
		r=s.nextInt();
		t=s.nextInt();
		si=p*r*t;
		System.out.println("Simple Interest= "+si);
		
		
	}

}
