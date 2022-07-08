package fundamentals;
import java.util.Scanner;
public class Factors {
	public static void main(String[] args) {
        int n,i=2,ch=0;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        
        while(i<=n/2)
        {
            ch=n%i;
            if(ch==0)
            {
                System.out.print(i+" ");
            }
            i++;
        }
        
    }

}
