package fundamentals;
import java.util.Scanner;
public class MultiplicationTable {
	public static void main(String[] args) {
        int i=1, n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        while(i<=10)
        {
            System.out.println(n*i);
            i++;
        }

	}

}
