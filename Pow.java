package fundamentals;
import java.util.Scanner;

public class Pow {
    public static void main(String[] args) {
        int x,n,pow=1,i=1;
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        n = s.nextInt();
        
        while(i<=n)
        {
            pow=pow*x;
            i++;
        }
        System.out.println(pow);
    }

}
