package fundamentals;
import java.util.Scanner;
public class PrintNnaturalNos {
	public static void main(String[] args) {
		int i=1,n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n:");
		n = s.nextInt();
		
		while(i<=n)
		{
			System.out.println(i);
			i=i+1;
		}
	}

}
