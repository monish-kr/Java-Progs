package fundamentals;
import java.util.Scanner;
import java.lang.Math;

public class TotalSalary {
	public static void main(String[] args) {
		double allow=0, ts, hra, da, pf;
        int b;
        Scanner s = new Scanner(System.in);
        b = s.nextInt();
        String str = s.next();
        char ch = str.charAt(0);
        hra = (0.2)*b;
        da = (0.5)*b;
        pf = (11.0/100.0)*b;
        
        if(ch=='A')
        {
            allow=1700;
            ts=b+hra+da+allow-pf;
            System.out.println(Math.round(ts));
        }
        else if(ch=='B')
        {
            allow=1500;
            ts=b+hra+da+allow-pf;
            System.out.println(Math.round(ts));
        }
        else{
            allow=1300;
            ts=b+hra+da+allow-pf;
            System.out.println(Math.round(ts));
        }
	}

}
