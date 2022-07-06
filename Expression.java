package java6july;

import java.util.Scanner;

public class Expression {
	public static void main(String[] args) {
		double a,b,c,d,x;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		d=s.nextInt();
		x=((a+b)*(c-d))/(a+d);
		System.out.println(x);

}
}