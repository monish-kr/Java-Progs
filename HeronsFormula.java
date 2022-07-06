package java6july;
import java.util.Scanner;

public class HeronsFormula {
	public static void main(String[] args) {
		double si,a,b,c,x,area;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a,b,c respectively:");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		si=(a+b+c)/2;
		x=(si*(si-a)*(si-b)*(si-c));
		area=Math.pow(x, 0.5);
		System.out.println("Area of triangle is: "+area);
		
	}

}
