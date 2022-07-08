package fundamentals;
import java.util.Scanner;
public class SumEvenOdd {
	public static void main(String[] args) {
		int n, sum_e=0,sum_o=0;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        
        while(n!=0)
        {
            if(n%2==0)
            {
                sum_e=sum_e+(n%10);
            }
            else
            {
                sum_o=sum_o+(n%10);
            }
            n = n/10;
        }
        System.out.println(sum_e+" "+sum_o);

	}

}
