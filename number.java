import java.util.*;
public class number
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=in.nextInt();
        System.out.println("Enter b: ");
        int b=in.nextInt();
        System.out.println("Enter s: ");
        int s=in.nextInt();
        System.out.println("Enter t: ");
        int t=in.nextInt();
        System.out.println("Enter m: ");
        int m=in.nextInt();
        System.out.println("Enter n: ");
        int n=in.nextInt();
        int da[]=new int[m];
        int dor[]=new int[n];
        System.out.println("Enter das");
        for(int i=0;i<m;i++)
        {
            da[i]=in.nextInt();
        }
        System.out.println("Enter dos");
        for(int i=0;i<n;i++)
        {
            dor[i]=in.nextInt();
        }
        int s1=0,s2=0,t1,t2;
        for(int i=0;i<m;i++)
        {
            t1=da[i]+a;
            if(t1>=s && t1<=t)
            s1++;
        }
        for(int i=0;i<n;i++)
        {
            t1=dor[i]+b;
            if(t1>=s && t1<=t)
            s2++;
        }
        System.out.println(s1+" "+s2);
    }
}