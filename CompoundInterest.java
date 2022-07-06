package java6july;
import java.util.Scanner;
import java.lang.Math;

public class CompoundInterest {
	public static void main(String[] args) {
		double p,r,t,a,b,ci;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter p,r,t respectively: ");
		p=s.nextInt();
		r=s.nextInt();
		t=s.nextInt();
		b=(1+r)/100;
		a=Math.pow(b, t);
		ci=p*a;
		System.out.println("Compund Interest= "+ci);
	}

}
