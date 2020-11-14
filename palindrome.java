public class palindrome
{
    public static void main(int n)
    {
        int temp=n;
        int rem=0, rev=0;
        while(temp>0)
        {
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        
        if(n==rev)
        {
            System.out.println("Same");
        }
        else
        {
            System.out.println("Not same");
        }
        }
    }