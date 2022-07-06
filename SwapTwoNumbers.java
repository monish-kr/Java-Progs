package java6july;
import java.util.Scanner;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		int a,b,c=0;
		Scanner s = new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println(a+" "+b);
	}

}
