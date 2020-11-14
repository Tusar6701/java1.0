
import java.util.*;
class a1
{

    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int n,k;
        System.out.println("Enter row: ");
        n=in.nextInt();

        System.out.println("Enter column: ");
        k=in.nextInt();
        int arr[][]=new int[n][k];
        int s[]=new int[100000];
        int c=0,x;
        int min=10000;
        System.out.println("Enter: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<k;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                for(x=0;x<(n-j);x++)
                {
                    s[c]=s[c]+arr[i][x];
                }
                if(x!=(n-1))
                {
                    for(int b=0;b<k;b++)
                    {

                        if(x==(n-1) || x>=n)
                        {
                            x=n-j;
                            continue;

                        }
                        else
                        {
                            s[c]+=arr[b][++x];
                        }
                        if(s[c]<min)
                        {
                            min=s[c];

                        }
                        c++;
                    }
                }
                else
                {
                    if(s[c]<min)
                    {
                        min=s[c];

                    }
                    c++;
                }
            }
        }
        for(int q=0;q<c;q++)
        {
            System.out.println(s[q]);
        }
        System.out.println("final: "+min);

    }
}

