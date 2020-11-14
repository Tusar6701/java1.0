import java.util.*;
class Trace
{
    public static void main(String args[]){
    int T,N;
    int M[][];
    Scanner sc=new Scanner(System.in);
    T=sc.nextInt();
    N=sc.nextInt();
    
    int r[]=new int[T];
    int c[]=new int[T];
    int k[]=new int [T];
    for(int t=0;t<T;t++)
    {   
        String s[]=new String[5];
        
        N=sc.nextLine();
        M=new int[N][N];
    r[t]=0;
    c[t]=0;
    k[t]=0;
    for(int p=0;p<N;p++)
    {
        s[p]=sc.next;
    }
    
    for(int i=0;i<N;i++)
    {
        M[i][]=s[i].split(" ");
        for(int j=0;j<N;j++)
        {
            
            
            if(i==j)
                k[t]+=M[i][j];//trace
        }
    }
    int Rcount=0, Ccount=0;
    for(int i=0;i<N;i++)
    {
        int n;
        for(int j=0;j<N;j++)
        {
            for(int k=0;k<N;k++)
            {
                if(M[i][j]==M[i][k])
                    Rcount=1;
            }
            for(int l=0;l<N;l++)
            {
                if(M[j][i]==M[l][i])
                    Ccount=1;
            }
        }
        r[t]+=Rcount;
        c[t]+=Ccount;
    }
    }
    
    for(int o=0;o<T;o++)
    {
        System.out.println("Case #"+x+": "+k[o]+" "+r[0]+" "+c[o]);
    }
    }
}
    